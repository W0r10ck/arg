package net.test.argus.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


@Entity
@Table(name = "nodes")
public class Node {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "name")
    private String name;

    @Column(name = "region")
    private String region;

    @Column(name = "street")
    private String street;

    @Column(name = "house")
    private String house;



    private Set<ConnectionUnits> units = new HashSet<>();
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nodes")
    public Set<ConnectionUnits> getUnits() {
        return this.units;
    }


    public void setUnits (Set<ConnectionUnits> units){
        this.units = units;
    }


    public Integer getId_units() {
        return id_units;
    }

    public void setId_units(Integer id_units) {
        this.id_units = id_units;
    }

    @Column(name = "id_units")
    private Integer id_units;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node node = (Node) o;
        return id == node.id &&
                name.equals(node.name) &&
                region.equals(node.region) &&
                street.equals(node.street) &&
                house.equals(node.house) &&
                id_units.equals(node.id_units);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, region, street, house, id_units);
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", id_units=" + id_units +
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }
}
