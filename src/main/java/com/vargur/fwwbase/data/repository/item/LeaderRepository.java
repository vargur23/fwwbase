package com.vargur.fwwbase.data.repository.item;

import com.vargur.fwwbase.data.objects.items.Leader;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface LeaderRepository extends MongoRepository<Leader, String> {

  Optional<Leader> findByMyid(String myid);

  Optional<Leader> findByName(String name);

  Optional<Leader> findByCost(String cost);

  Optional<Leader> findByMyidOrName(String myid, String name);

}
