package fr.dreamteam.manager.model;

public class MapItem {

    private int id;
    private int posx;
    private int posy;
    private Ground ground;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public Ground getGround() {
        return ground;
    }

    public void setGround(Ground ground) {
        this.ground = ground;
    }

    @Override
    public String toString() {
        return "MapItem{" +
                "id=" + id +
                ", posx=" + posx +
                ", posy=" + posy +
                ", ground=" + ground +
                '}';
    }

    public int getDistance(MapItem mapItem) {
        return Math.abs(this.posx - mapItem.posx) + Math.abs(this.posy * mapItem.posy);
    }
}
