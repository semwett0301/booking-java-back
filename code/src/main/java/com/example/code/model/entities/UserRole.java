package com.example.code.model.entities;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class UserRole extends BaseEntity {
    private String name;

    @OneToMany(mappedBy = "userRole")
    List<UserInfo> userList;
}
