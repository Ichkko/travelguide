package org.example.travel.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "descriptoins")
public class descriptoins extends BaseEntity {

    private String name;
    private String location;
    private String description;
    private String country;
    private travel travel;
    @ManyToMany(mappedBy = "descriptions")
    private Set<user> users;


    public descriptoins(String name, String location, String description, String country , travel travel  ) {

        this.name = name;
        this.location = location;
        this.description = description;
        this.country = country;
       this.travel=travel;

    }

    public descriptoins() {

    }

    @Column(name="name", length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @ManyToOne
    @JoinColumn(name="travelId", nullable = false)

    public org.example.travel.entity.travel getTravel() {
        return travel;
    }

    public void setTravel(org.example.travel.entity.travel travel) {
        this.travel = travel;
    }

    public Set<user> getUsers() {
        return users;
    }

    public void setUsers(Set<user> users) {
        this.users = users;
    }
}
