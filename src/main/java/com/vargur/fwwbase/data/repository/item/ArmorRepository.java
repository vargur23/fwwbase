package com.vargur.fwwbase.data.repository.item;

import com.vargur.fwwbase.data.objects.items.Armor;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ArmorRepository extends MongoRepository<Armor, String> {
  Optional<Armor> findByMyid(String myid);

  Optional<Armor> findByName(String name);

  Optional<Armor> findByCost(String cost);

  Optional<Armor> findByMyidOrName(String myid, String name);
}
