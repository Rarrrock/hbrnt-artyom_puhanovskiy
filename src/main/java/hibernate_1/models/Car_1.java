package hibernate_1.models;

import hibernate_1.enums.CarType_1;
import jakarta.persistence.*;

// Аналогично классу Word, класс Car обозначает таблицу car.
@Entity
@Table(name = "Car_1")
public class Car_1 {
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
    private CarType_1 type;

    @Column(name = "power")
    private int power;

    @Column(name = "price")
    private double price;

    @Column(name = "year")
    private int year;

    public Car_1() {
    }

    public Car_1(String model, CarType_1 type, int power, double price, int year) {
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

    public CarType_1 getType() {
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

    public void setType(CarType_1 type) {
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
