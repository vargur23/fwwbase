package com.vargur.fwwbase.data.repository.item;

import com.vargur.fwwbase.data.objects.items.Mines;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MinesRepository extends MongoRepository<Mines, String> {
  Optional<Mines> findByMyid(String myid);

  Optional<Mines> findByName(String name);

  Optional<Mines> findByCost(String cost);

  Optional<Mines> findByMyidOrName(String myid, String name);
}
