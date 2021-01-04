package fr.dreamteam.manager.service;

import fr.dreamteam.manager.model.Incident;
import fr.dreamteam.manager.model.Truck;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncidentToProcess implements IIncidentToProcess {

    @Override
    public List<Incident> getIncidentsToProcess(List<Incident> incidents, List<Truck> trucks) {
        return incidents;
    }
}
