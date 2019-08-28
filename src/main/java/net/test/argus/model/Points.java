package net.test.argus.model;

import javax.persistence.*;


@Entity
@Table(name = "points")
public class Points {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private String status;

    @Column(name = "id_unit")
    private String id_unit;


    @Override
    public String toString() {
        return "Points{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", id_unit='" + id_unit + '\'' +
                '}';
    }

    public String getId_unit() {
        return id_unit;
    }

    public void setId_unit(String id_unit) {
        this.id_unit = id_unit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
