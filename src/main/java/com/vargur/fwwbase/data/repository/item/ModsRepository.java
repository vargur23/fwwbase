package com.vargur.fwwbase.data.repository.item;

import com.vargur.fwwbase.data.objects.items.Mods;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ModsRepository extends MongoRepository<Mods, String> {
  Optional<Mods> findByMyid(String myid);

  Optional<Mods> findByName(String name);

  Optional<Mods> findByCost(String cost);

  Optional<Mods> findByMyidOrName(String myid, String name);
}
