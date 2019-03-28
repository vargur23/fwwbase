package com.vargur.fwwbase.data.repository.item;

import com.vargur.fwwbase.data.objects.items.HeavyWeapons;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface HeavyWeaponsRepository extends MongoRepository<HeavyWeapons, String> {
  Optional<HeavyWeapons> findByMyid(String myid);

  Optional<HeavyWeapons> findByName(String name);

  Optional<HeavyWeapons> findByCost(String cost);

  Optional<HeavyWeapons> findByMyidOrName(String myid, String name);
}
