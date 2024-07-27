package com.example.demo.model;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data

public class User {
    @ID
    @GeneratedValue(strategy = GenerationType.IDENTITY);
    private Long id;
    private String username;
    private String password;
    
}
