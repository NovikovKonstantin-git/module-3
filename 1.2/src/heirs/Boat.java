package heirs;

import abstractions.Vehicles;
import interfaces.Carriers;
import interfaces.Screw;

import java.util.Locale;

public class Boat extends Vehicles implements Screw, Carriers {
    public Boat(String name, String brand, String model, int places) {
        super(name, brand, model, places);
    }

    @Override
    public String transport(double max_weight, double height_cargo, double width_cargo) {
        return String.format(Locale.US,", макс. вес груза: %.1f. кг, макс. высота груза: %.1f м, макс. ширина груза: %.1f м",
                max_weight, height_cargo, width_cargo);
    }

    @Override
    public int slew(int screw) {
        return screw;
    }
}
