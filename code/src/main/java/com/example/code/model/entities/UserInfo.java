package com.example.code.model.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Data
@Table(name = "user_info")
public class UserInfo extends BaseEntity{
    private String username;
    private String password;
    private String email;

    @OneToMany(mappedBy = "user")
    private List<Review> reviewList;

    @OneToMany(mappedBy = "user")
    private List<Booking> bookings;

    @ManyToOne
    private UserRole userRole;
}
