package fr.dreamteam.manager.service;

import fr.dreamteam.manager.model.Incident;
import fr.dreamteam.manager.model.Truck;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TruckAdministrateur implements ITruckAdministrateur {

    @Override
    public List<Truck> getTruckForIncident(Incident incident, List<Truck> trucks) {

        Truck closeTruck = null;

        for (Truck t : trucks.stream().filter(Truck::isAvailability).collect(Collectors.toList())) {
            closeTruck = this.isClosier(incident, closeTruck, t);
        }

        return Collections.singletonList(closeTruck);
    }

    private Truck isClosier(Incident incident, Truck a, Truck b) {
        if (a == null) {
            return b;
        } else if (b == null) {
            return a;
        } else {
            return incident.getMapItem().getDistance(a.getMapItem()) > incident.getMapItem().getDistance(b.getMapItem()) ? b : a;
        }
    }

}
