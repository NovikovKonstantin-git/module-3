package heirs;

import abstractions.Vehicles;
import interfaces.Wheeled;

import java.sql.SQLOutput;

public class Taxi extends Vehicles implements Wheeled {

    public Taxi(String name, String brand, String model, int places) {
        super(name, brand, model, places);
    }

    @Override
    public int ride(int wheels) {
        return wheels;
    }
}
