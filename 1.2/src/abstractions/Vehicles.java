package abstractions;

public abstract class Vehicles {
    private String name;
    private String brand;
    private String model;
    private int places;

    public Vehicles(String name, String brand, String model, int places) {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.places = places;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPlaces() {
        return places;
    }
}
