package fr.dreamteam.manager.model;

import java.util.List;

public class Truck {

    private Long id;
    private MapItem mapItem;
    private Barrack barrack;
    private boolean availability;
    private int matricule;
    private List<Incident> incidents;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MapItem getMapItem() {
        return mapItem;
    }

    public void setMapItem(MapItem mapItem) {
        this.mapItem = mapItem;
    }

    public Barrack getBarrack() {
        return barrack;
    }

    public void setBarrack(Barrack barrack) {
        this.barrack = barrack;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public List<Incident> getIncidents() {
        return incidents;
    }

    public void setIncidents(List<Incident> incidents) {
        this.incidents = incidents;
    }

    public Truck linkToIncident(Incident incident) {
        this.incidents.add(incident);
        // Lorsqu'un truck doit s'occuper d'un incident il n'est plus disponible
        this.availability = false;
        return this;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "id=" + id +
                ", mapItem=" + mapItem +
                ", barrack=" + barrack +
                ", availability=" + availability +
                ", matricule=" + matricule +
                '}';
    }
}
