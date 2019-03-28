package com.vargur.fwwbase.data.repository.item;

import com.vargur.fwwbase.data.objects.items.Chems;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ChemsRepository extends MongoRepository<Chems, String> {
  Optional<Chems> findByMyid(String myid);

  Optional<Chems> findByName(String name);

  Optional<Chems> findByCost(String cost);

  Optional<Chems> findByMyidOrName(String myid, String name);

}
