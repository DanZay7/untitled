package lab1;

import lab3.AutoInterface;

import java.util.ArrayList;



public class Auto implements AutoInterface {
    final private  String ready = "Класс Auto";
    private ArrayList<String> brand = new ArrayList<>();
    private float wheels;
    private float powerengine;



    public Auto(ArrayList<String> newType1, float newType2, float newType3){
        brand = newType1;
        wheels = newType2;
        powerengine = newType3;

    }
    public void setBrand (ArrayList<String> brand){
        this.brand = brand;
    }
    public ArrayList<String> getBrand (){
        return brand;
    }
    public void setWheels (float wheels){
        this.wheels = wheels;
    }
    public float getWheels(){
        return wheels;
    }
    public void setPowerengine (float powerengine){
        this.powerengine = powerengine;
    }
    public float getPowerengine(){
        return powerengine;
    }

    public  void addBrand(String newType){
        brand.add(newType);
    }
    public String getDescription() {
        return ready;
    }

}
