package com.vargur.fwwbase.data.repository.item;

import com.vargur.fwwbase.data.objects.items.Food;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface FoodRepository extends MongoRepository<Food, String> {

  Optional<Food> findByMyid(String myid);

  Optional<Food> findByName(String name);

  Optional<Food> findByCost(String cost);

  Optional<Food> findByMyidOrName(String myid, String name);
}
