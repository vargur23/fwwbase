package com.vargur.fwwbase.data.repository.item;

import com.vargur.fwwbase.data.objects.items.Grenades;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface GrenadesRepository extends MongoRepository<Grenades, String> {
  Optional<Grenades> findByMyid(String myid);

  Optional<Grenades> findByName(String name);

  Optional<Grenades> findByCost(String cost);

  Optional<Grenades> findByMyidOrName(String myid, String name);
}
