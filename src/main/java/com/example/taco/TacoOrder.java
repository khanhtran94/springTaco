package com.example.taco;

import lombok.Data;

import java.util.*;

@Data
public class TacoOrder {
    private String deliveryName;
    private String deliveryAddress;
    private String ccNumber;
    private String ccExpiration;

    private List<Taco> tacos = new ArrayList<Taco>();

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}
