package com.vargur.fwwbase.data.repository;

import com.vargur.fwwbase.data.objects.Factions;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface FactionsRepository extends MongoRepository<Factions, String> {

  public Optional<Factions> findByMyid(String name);

  public Optional<Factions> findByName(String name);
}
