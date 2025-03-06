package edu.miu.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Publisher {
    private Integer id ;
    private String name;
    private String email;
    private String phoneNumber;

}
