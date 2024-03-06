package edu.iu.habahram.ducksservice.model;

import java.util.Objects;

public record DuckData(int id, String type) {

    public String toLine() {
        return String.format("%1$s,%2$s", id(), type());
    }

    public static DuckData fromLine(String line) {
        String[] tokens = line.split(",");
        return new DuckData(Integer.parseInt(tokens[0]), tokens[1]);
    }
    public int compareTo(Object object){

        DuckData otherDuck = (DuckData) object;

        return otherDuck.type.compareTo(otherDuck.type);
    }

}
