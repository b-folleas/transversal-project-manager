package fr.dreamteam.manager.service;

import fr.dreamteam.manager.model.Incident;
import fr.dreamteam.manager.model.Truck;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IncidentToProcess implements IIncidentToProcess {

    @Override
    public List<Incident> getIncidentsToProcess(List<Incident> incidents, List<Truck> trucks) {

        // Si jamais un incident est déjà associé à un truck alors il n'est pas a traiter.
        return incidents.stream().filter(i -> trucks.stream().noneMatch(t -> t.getIncidents().stream().anyMatch(it -> it.getId() == i.getId()))).collect(Collectors.toList());
    }
}
