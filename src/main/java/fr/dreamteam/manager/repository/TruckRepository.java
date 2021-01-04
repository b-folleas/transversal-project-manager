package fr.dreamteam.manager.repository;

import fr.dreamteam.manager.model.Incident;
import fr.dreamteam.manager.model.Truck;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
public class TruckRepository extends BaseRepository<Truck> implements ITruckRepository {


    public TruckRepository(@Value("${api.baseUrl}") String baseUrl) {
        super(baseUrl);
    }

    @Override
    Class<Truck> getClassObject() {
        return Truck.class;
    }

    @Override
    public List<Truck> getTrucks() {
        return this.getList("/trucks");
    }

    @Override
    public void linkToIncident(Truck truck, Incident incident) {
        // Il faut également modifier les données présente dans l'application et non seulement l'API. Cela permet d'éviter d'associer 2 fois le même truck pour un incident.
        truck.linkToIncident(incident);
        this.getItem(String.format(Locale.FRANCE, "/truck/%d/link/incident/%d", truck.getId(), incident.getId()));
    }
}
