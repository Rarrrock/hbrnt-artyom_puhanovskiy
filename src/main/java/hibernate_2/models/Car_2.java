package hibernate_2.models;

import hibernate_2.enums.CarType_2;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Car_2")
@NoArgsConstructor
public class Car_2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String model;

    @Enumerated(EnumType.STRING)
    private CarType_2 type;
    private int power;
    private int price;
    private int year;

    @ManyToOne
    private Owner owner;

    public Car_2(String model, CarType_2 type, int power, int price, int year) {
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

    public CarType_2 getType() { return type; }
    public void setType(CarType_2 type) { this.type = type; }

    public int getPower() { return power; }
    public void setPower(int power) { this.power = power; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public Owner getOwner() { return owner; }
    public void setOwner(Owner owner) { this.owner = owner; }
}