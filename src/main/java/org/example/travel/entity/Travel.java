package org.example.travel.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;
@Entity
@Table(name = "travel_packege")
public class travel_packege extends BaseEntity {

    private String travel_name;
    private String transport;
    private String price;
    private String duration;
    private Date created_at;
    public travel_packege(  String travel_name, String transport, String price, String duration, Date created_at) {


        this.travel_name = travel_name;
        this.transport = transport;
        this.price = price;
        this.duration = duration;
        this.created_at = created_at;

    }

    public travel_packege() {

    }
    @Column(name="name", length = 45)
    public String getTravel_name() {
        return travel_name;
    }

    public void setTravel_name(String travel_name) {
        this.travel_name = travel_name;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }
}
