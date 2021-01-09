package fr.dreamteam.manager.repository;

import fr.dreamteam.manager.model.Incident;

import java.util.List;

public interface IIncidentRepository {

    List<Incident> getIncidents();

}
