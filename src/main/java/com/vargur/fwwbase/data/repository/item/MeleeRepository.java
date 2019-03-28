package com.vargur.fwwbase.data.repository.item;

import com.vargur.fwwbase.data.objects.items.Melee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MeleeRepository extends MongoRepository<Melee, String> {
  Optional<Melee> findByMyid(String myid);

  Optional<Melee> findByName(String name);

  Optional<Melee> findByCost(String cost);

  Optional<Melee> findByMyidOrName(String myid, String name);

}
