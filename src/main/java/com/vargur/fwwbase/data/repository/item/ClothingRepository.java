package com.vargur.fwwbase.data.repository.item;

import com.vargur.fwwbase.data.objects.items.Clothing;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ClothingRepository extends MongoRepository<Clothing, String> {
  Optional<Clothing> findByMyid(String myid);

  Optional<Clothing> findByName(String name);

  Optional<Clothing> findByCost(String cost);

  Optional<Clothing> findByMyidOrName(String myid, String name);

}
