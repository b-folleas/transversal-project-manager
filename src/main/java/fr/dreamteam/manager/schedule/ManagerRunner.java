package fr.dreamteam.manager.schedule;

import fr.dreamteam.manager.model.Incident;
import fr.dreamteam.manager.model.Truck;
import fr.dreamteam.manager.repository.IIncidentRepository;
import fr.dreamteam.manager.repository.ITruckRepository;
import fr.dreamteam.manager.service.IIncidentToProcess;
import fr.dreamteam.manager.service.ITruckAdministrateur;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManagerRunner {

    private final Logger logger = LoggerFactory.getLogger(ManagerRunner.class);

    private final IIncidentRepository incidentRepository;
    private final IIncidentToProcess incidentToProcess;
    private final ITruckRepository truckRepository;
    private final ITruckAdministrateur truckAdministrateur;

    public ManagerRunner(IIncidentRepository incidentRepository, IIncidentToProcess incidentToProcess, ITruckRepository truckRepository, ITruckAdministrateur truckAdministrateur) {
        this.incidentRepository = incidentRepository;
        this.incidentToProcess = incidentToProcess;
        this.truckRepository = truckRepository;
        this.truckAdministrateur = truckAdministrateur;
    }

    @Scheduled(fixedRate = 5000)
    public void getFromManagerApi() {
        //Get list of incidents
        List<Incident> incidents = this.incidentRepository.getIncidents();

        // Get all trucks
        List<Truck> trucks = this.truckRepository.getTrucks();

        List<Incident> incidentsToProcess = this.incidentToProcess.getIncidentsToProcess(incidents, trucks);

        List<Truck> truckToAdministrate;

        for (Incident i : incidentsToProcess) {
            logger.info("Traitement de l'incident : " + i);
            truckToAdministrate = this.truckAdministrateur.getTruckForIncident(i, trucks);

            truckToAdministrate.forEach(t -> {
                logger.info("Associe le truck : " + t + " avec l'incident : " + i);
                this.truckRepository.saveTruck(t.linkToIncident(i));
            });
        }
    }

}
