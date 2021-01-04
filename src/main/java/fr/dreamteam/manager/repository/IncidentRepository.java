package fr.dreamteam.manager.repository;

import fr.dreamteam.manager.model.Incident;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncidentRepository extends BaseRepository<Incident> implements IIncidentRepository {

    public IncidentRepository(@Value("${api.baseUrl}") String baseUrl) {
        super(baseUrl);
    }

    @Override
    Class<Incident> getClassObject() {
        return Incident.class;
    }

    @Override
    public List<Incident> getIncidents() {
        return this.getList("/incidents");
    }
}
