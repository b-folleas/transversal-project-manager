package fr.dreamteam.manager.repository;

import fr.dreamteam.manager.model.Truck;

import java.util.List;

public interface ITruckRepository {

    public List<Truck> getTrucks();

    public void saveTruck(Truck truck);

}
