package fr.dreamteam.manager.service;

import fr.dreamteam.manager.model.Incident;
import fr.dreamteam.manager.model.Truck;

import java.util.List;

public interface IIncidentToProcess {

    List<Incident> getIncidentsToProcess(List<Incident> incidents, List<Truck> trucks);

}
