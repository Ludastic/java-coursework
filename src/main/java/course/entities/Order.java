package course.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import course.reqmodels.ReqForm;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="zakazi")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "telNumb")
    private String telNumb;
    @Column(name = "amountOf")
    private Integer amountOfPeople;
    @Column(name = "name")
    private String name;
    @Column(name ="surName")
    private String surName;
    @Column(name ="lastName")
    private String lastName;
    @Column(name ="eventType")
    private String eventType;
    public Order() {
        this.amountOfPeople = null;
        this.name = null;
        this.surName = null;
        this.lastName = null;
        this.eventType = null;
        this.telNumb = null;
    }
    public Order(ReqForm reqForm) {
        this.telNumb = reqForm.getTelNumb();
        this.amountOfPeople = reqForm.getAmountOfPeople();
        this.name = reqForm.getName();
        this.surName = reqForm.getSurName();
        this.lastName = reqForm.getLastName();
        this.eventType = reqForm.getEventType();
    }
}
