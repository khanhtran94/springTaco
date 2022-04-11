package com.example.taco.data;

import com.example.taco.TacoOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}
