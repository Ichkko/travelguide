package org.example.onlinrshop.model.entity.Dtos;

import lombok.Data;
import org.example.onlinrshop.model.entity.auth.Role;

import java.util.Set;

@Data
public class UserDTO {
    private long id;
    private String username;
    private String password;
    private Set<Role> roles;
    private String firstName;
    private String lastName;
    private int age;
    private String level;


}
