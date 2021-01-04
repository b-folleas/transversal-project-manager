package fr.dreamteam.manager.repository;

import fr.dreamteam.manager.model.Truck;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public void saveTruck(Truck truck) {
        this.postItem("/truck", truck);
    }
}
