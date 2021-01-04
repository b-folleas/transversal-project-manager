package fr.dreamteam.manager.model;

public enum Ground {
    ROAD("ROAD"),
    GARDEN("ROAD"),
    BUILDING("BUILDING"),
    WATER("WATER");

    private final String text;

    Ground(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
