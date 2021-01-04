package fr.dreamteam.manager.model;

public class Incident {

    private int id;
    private MapItem mapItem;
    private float intensity;
    private IncidentType incidentType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MapItem getMapItem() {
        return mapItem;
    }

    public void setMapItem(MapItem mapItem) {
        this.mapItem = mapItem;
    }

    public float getIntensity() {
        return intensity;
    }

    public void setIntensity(float intensity) {
        this.intensity = intensity;
    }

    public IncidentType getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(IncidentType incidentType) {
        this.incidentType = incidentType;
    }

    @Override
    public String toString() {
        return "Incident{" +
                "id=" + id +
                ", mapItem=" + mapItem +
                ", intensity=" + intensity +
                ", incidentType=" + incidentType +
                '}';
    }
}
