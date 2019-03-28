package com.vargur.fwwbase.data.repository.item;

import com.vargur.fwwbase.data.objects.items.Perks;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface PerksRepository extends MongoRepository<Perks, String> {
  Optional<Perks> findByMyid(String myid);

  Optional<Perks> findByName(String name);

  Optional<Perks> findByCost(String cost);

  Optional<Perks> findByMyidOrName(String myid, String name);
}
