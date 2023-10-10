package Classes;

import java.awt.Color;

import Enumerators.BodyType;
import Enumerators.TypeOfFuel;
import Enumerators.TypeOfGearBox;
import Interfaces.iFuelStation;
import Interfaces.iWipingCar;

public class Pickup extends Car implements iFuelStation, iWipingCar {
    
    private float loadCapacity;

    public Pickup(String name, String model, Color color, int numOfWheels,
            TypeOfGearBox typeOfGearBox, TypeOfFuel typeOfFuel, float engCapacity, float loadCapacity) {
        super(name, model, color, BodyType.PICKUP, numOfWheels, typeOfGearBox, typeOfFuel, engCapacity);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void getFuel() {
        // TODO Auto-generated method stub

    }

    @Override
    public void wipHeadLights() {
        // TODO Auto-generated method stub

    }

    @Override
    public void wipMirrows() {
        // TODO Auto-generated method stub

    }

    @Override
    public void wipWindshield() {
        // TODO Auto-generated method stub

    }
}
