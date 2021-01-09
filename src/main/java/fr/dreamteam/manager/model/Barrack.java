package fr.dreamteam.manager.model;

public class Barrack {

    private Long id;
    private String name;
    private MapItem mapItem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MapItem getMapItem() {
        return mapItem;
    }

    public void setMapItem(MapItem mapItem) {
        this.mapItem = mapItem;
    }

    @Override
    public String toString() {
        return "Barrack{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mapItem=" + mapItem +
                '}';
    }
}
