package Lab6;


import lab1.SUVs;
import lab1.Minivans;


public interface AbstractFactory {
    SUVs createSUVs (int type);
    Minivans createMinivans (int type);

}
