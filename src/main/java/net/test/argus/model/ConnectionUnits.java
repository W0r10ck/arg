package net.test.argus.model;

import javax.persistence.*;

@Entity
@Table(name = "connectionunits")
public class ConnectionUnits {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "name")
    private String name;

    @Column(name = "capacity")
    private Integer capacity;

    @Column(name = "id_node")
    private Integer id_node;

    public Integer getId_node() {
        return id_node;
    }

    public void setId_node(Integer id_node) {
        this.id_node = id_node;
    }

    public Integer getId_points() {
        return id_points;
    }

    public void setId_points(Integer id_points) {
        this.id_points = id_points;
    }

    @Column(name = "id_points")
    private Integer id_points;

    @Override
    public String toString() {
        return "ConnectionUnits{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", id_node=" + id_node +
                ", id_points=" + id_points +
                '}';
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

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
