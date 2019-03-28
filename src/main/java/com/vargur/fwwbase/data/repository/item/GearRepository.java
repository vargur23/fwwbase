package com.vargur.fwwbase.data.repository.item;

import com.vargur.fwwbase.data.objects.items.Gear;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface GearRepository extends MongoRepository<Gear, String> {
  Optional<Gear> findByMyid(String myid);

  Optional<Gear> findByName(String name);

  Optional<Gear> findByCost(String cost);

  Optional<Gear> findByMyidOrName(String myid, String name);

}
