package lab1;

import java.util.ArrayList;

public class Compact_executive extends Luxury{
    private final String ready = "Класс Compact_executive";
    public Compact_executive(ArrayList<String> newType1, float newType2, float newType3, boolean newType4) {
        super(newType1, newType2, newType3,newType4);
    }
    public String getDescription() {
        return ready;
    }
}
