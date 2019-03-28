package com.vargur.fwwbase.data.repository.item;

import com.vargur.fwwbase.data.objects.items.Pistols;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface PistolsRepository extends MongoRepository<Pistols, String> {
  Optional<Pistols> findByMyid(String myid);

  Optional<Pistols> findByName(String name);

  Optional<Pistols> findByCost(String cost);

  Optional<Pistols> findByMyidOrName(String myid, String name);
}
