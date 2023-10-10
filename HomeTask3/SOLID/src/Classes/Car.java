package Classes;

import java.awt.*;

import Enumerators.TypeOfGearBox;
import Enumerators.BodyType;
import Enumerators.TypeOfFuel;

public abstract class Car {
    private String name;
    private String model;
    private Color color;
    private BodyType bodyType;
    private int whellsCount;
    private TypeOfGearBox gearboxType;
    private TypeOfFuel fuelType;
    private float engineCapacity;

    public Car(String name, String model, Color color, BodyType bodyType, int whellsCount,
            TypeOfGearBox gearboxType, TypeOfFuel fuelType, float engineCapacity) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.whellsCount = whellsCount;
        this.gearboxType = gearboxType;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
    }

    public void movement() {
    }

    public void maintenance() {
    }

    public boolean turnLight() {
        return true;
    }

    public boolean turnWipers() {
        return true;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public int getWhellsCount() {
        return whellsCount;
    }

    public TypeOfGearBox getGearboxType() {
        return gearboxType;
    }

    public TypeOfFuel getFuelType() {
        return fuelType;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setBodyType(BodyType typeOfBody) {
        this.bodyType = typeOfBody;
    }

    public void setWhellsCount(int numOfWheels) {
        this.whellsCount = numOfWheels;
    }

    public void setGearboxType(TypeOfGearBox typeOfGearBox) {
        this.gearboxType = typeOfGearBox;
    }

    public void setFuelType(TypeOfFuel typeOfFuel) {
        this.fuelType = typeOfFuel;
    }

    public void setEngineCapacity(float engCapacity) {
        this.engineCapacity = engCapacity;
    }

}