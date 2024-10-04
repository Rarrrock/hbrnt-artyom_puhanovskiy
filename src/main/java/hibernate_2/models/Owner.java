package hibernate_2.models;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Owner")
@NoArgsConstructor
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "owner")
    private List<Car_2> car2s;

    @OneToOne
    private DriveLicense driveLicense;

    public Owner(String name, DriveLicense driveLicense) {
        this.name = name;
        this.driveLicense = driveLicense;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Car_2> getCar2s() { return car2s; }
    public void setCar2s(List<Car_2> car2s) { this.car2s = car2s; }

    public DriveLicense getDriveLicense() { return driveLicense; }
    public void setDriveLicense(DriveLicense driveLicense) { this.driveLicense = driveLicense; }
}
