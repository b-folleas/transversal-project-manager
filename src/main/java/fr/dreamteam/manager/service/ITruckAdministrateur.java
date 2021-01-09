package fr.dreamteam.manager.service;

import fr.dreamteam.manager.model.Incident;
import fr.dreamteam.manager.model.Truck;

import java.util.List;

public interface ITruckAdministrateur {

    List<Truck> getTruckForIncident(Incident incident, List<Truck> trucks);

}
