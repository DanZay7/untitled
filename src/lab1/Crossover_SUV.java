package lab1;

import java.util.ArrayList;

public class Crossover_SUV extends SUVs{
    private final String ready = "Класс Crossover_SUV";
    public Crossover_SUV(ArrayList<String> newType1, float newType2, float newType3, boolean newType4) {
        super(newType1, newType2, newType3,newType4);
    }
    public String getDescription() {
        return ready;
    }
}
