package hibernate_1.models;

import hibernate_1.enums.CarType;
import jakarta.persistence.*;

// Аналогично классу Word, класс Car обозначает таблицу car.
@Entity
@Table(name = "car")
public class Car {
    // Поля включают id (первичный ключ с автоинкрементом), model (модель машины),
    // type (тип машины, который представлен через перечисление Enum),
    // power (мощность), price (цена) и year (год выпуска).
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "model")
    private String model;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private CarType type;

    @Column(name = "power")
    private int power;

    @Column(name = "price")
    private double price;

    @Column(name = "year")
    private int year;

    public Car() {
    }

    public Car(String model, CarType type, int power, double price, int year) {
        this.model = model;
        this.type = type;
        this.power = power;
        this.price = price;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public CarType getType() {
        return type;
    }

    public int getPower() {
        return power;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", type=" + type +
                ", power=" + power +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
