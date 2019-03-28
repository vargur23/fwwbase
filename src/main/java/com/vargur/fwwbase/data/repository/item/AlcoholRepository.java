package com.vargur.fwwbase.data.repository.item;

import com.vargur.fwwbase.data.objects.items.Alcohol;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface AlcoholRepository extends MongoRepository<Alcohol, String> {

  Optional<Alcohol> findByMyid(String myid);

  Optional<Alcohol> findByName(String name);

  Optional<Alcohol> findByCost(String cost);

  Optional<Alcohol> findByMyidOrName(String myid, String name);

}
