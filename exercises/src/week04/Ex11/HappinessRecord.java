package Ex11;

import java.util.PrimitiveIterator;

public class HappinessRecord {
    //    Create the HappinessRecord class that has a String country , an Integer rank and a Double score .
    private String country;
    private Integer rank;
    private Double score;

    public HappinessRecord(String country, Integer rank, Double score) {
        this.country = country;
        this.rank = rank;
        this.score = score;
    }

    public String getCountry() {
        return country;
    }

    public Integer getRank() {
        return rank;
    }

    public Double getScore() {
        return score;
    }
}
