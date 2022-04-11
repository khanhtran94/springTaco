package com.example.taco;

import lombok.Data;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class TacoOrder implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    @NotBlank(message = "Field is required")
    private String deliveryName;
    @NotBlank(message = "Field is required")
    private String deliveryStreet;
    @NotBlank(message = "Field is required")
    private String deliveryCity;
    @NotBlank(message = "Field is required")
    private String deliveryState;
    @NotBlank(message = "Field is required")
    private String deliveryZip;
    @NotBlank(message = "Field is required")
    private String ccNumber;
    @Pattern(regexp = "^(0[1-9]|1[0-2])([\\/])([2-9][0-9])$",
            message = "Must be formatted MM/YY")
    private String ccExpiration;
    @Digits(integer = 3, fraction = 0, message = "Invalid CVV")
    private String ccCVV;

    private Date placedAt;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}
