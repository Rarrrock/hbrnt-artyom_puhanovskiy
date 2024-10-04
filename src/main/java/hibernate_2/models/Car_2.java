package hibernate_2.models;

import hibernate_2.enums.CarType;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Car")
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String model;

    @Enumerated(EnumType.STRING)
    private CarType type;
    private int power;
    private int price;
    private int year;

    @ManyToOne
    private Owner owner;

    public Car(String model, CarType type, int power, int price, int year) {
        this.model = model;
        this.type = type;
        this.power = power;
        this.price = price;
        this.year = year;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public CarType getType() { return type; }
    public void setType(CarType type) { this.type = type; }

    public int getPower() { return power; }
    public void setPower(int power) { this.power = power; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public Owner getOwner() { return owner; }
    public void setOwner(Owner owner) { this.owner = owner; }
}