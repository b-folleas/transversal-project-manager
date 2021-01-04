package fr.dreamteam.manager.schedule;

import fr.dreamteam.manager.model.Incident;
import fr.dreamteam.manager.repository.IIncidentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManagerRunner {

    private final Logger logger = LoggerFactory.getLogger(ManagerRunner.class);

    private final IIncidentRepository incidentRepository;

    public ManagerRunner(IIncidentRepository incidentRepository) {
        this.incidentRepository = incidentRepository;
    }

    @Scheduled(fixedRate = 5000)
    public void getFromManagerApi() {
        //Get list of incidents
        List<Incident> incidents = this.incidentRepository.getIncidents();

        for (Incident incident : incidents) {
            logger.info("Incident info : " + incident.toString());
        }
    }

}
