package com.practice.hibernate.models.onetoone;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String street;
    String city;

    //this is bidirectional mapping
    //Now we don’t have a column referencing to User table in our Address table so what is this piece of code?
    //This is where Hibernate comes into helping us, mappedBy = “address” tells Hibernate to look for a field named "address"
    //in the User class and link that particular instance to the current user object.
    @JsonIgnore
    @OneToOne(mappedBy = "address")
 //   @JoinColumn(name = "user_id", referencedColumnName = "id")
    User user;
}