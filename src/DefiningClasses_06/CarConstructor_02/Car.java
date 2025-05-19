package DefiningClasses_06.CarConstructor_02;

public class Car {
    private String brand;
    private String model;
    private int horsePowers;

    public Car (String brand) {
        this.brand = brand;
        this.model = "unknown";
        this.horsePowers = -1;
    }

    public Car (String brand, String model, int horsePowers) {
        this.brand = brand;
        this.model = model;
        this.horsePowers = horsePowers;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }

    public String carInfo(){
        return String.format("The car is: %s %s - %d HP.",this.brand,this.model,this.horsePowers);
    }
}
