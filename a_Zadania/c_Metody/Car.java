package a_Zadania.c_Metody;

public class Car {
    String brand;
    String model;
    Double price;

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String toString() {
        return "brand= " + brand + ", model= " + model + ", price= " + price;
    }
}
