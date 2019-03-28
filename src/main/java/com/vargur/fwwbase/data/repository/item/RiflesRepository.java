package com.vargur.fwwbase.data.repository.item;

import com.vargur.fwwbase.data.objects.items.Rifles;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RiflesRepository extends MongoRepository<Rifles, String> {

  Optional<Rifles> findByMyid(String myid);

  Optional<Rifles> findByName(String name);

  Optional<Rifles> findByCost(String cost);

  Optional<Rifles> findByMyidOrName(String myid, String name);
}
