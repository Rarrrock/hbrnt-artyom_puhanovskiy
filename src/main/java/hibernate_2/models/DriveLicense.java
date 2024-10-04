package hibernate_2.models;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "DriveLicense")
@NoArgsConstructor
public class DriveLicense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String series;

    public DriveLicense(String series) {
        this.series = series;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getSeries() { return series; }
    public void setSeries(String series) { this.series = series; }
}