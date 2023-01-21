package com.driver;

public class Boat implements WaterVehicle{

    String name;
    int Capacity;

    public Boat(String name, int capacity) {
        this.name = name;
        Capacity = capacity;
    }

    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return Capacity;
    }
}
