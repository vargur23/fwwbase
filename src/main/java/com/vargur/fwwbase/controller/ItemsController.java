package com.vargur.fwwbase.controller;

import com.mongodb.client.MongoDatabase;
import com.vargur.fwwbase.data.objects.items.*;
import com.vargur.fwwbase.data.repository.item.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

@RestController
@RequestMapping("items")
public class ItemsController {
  private static Logger log = LogManager.getLogger(ItemsController.class);

  @Autowired
  MongoDbFactory mongo;

  @GetMapping("")
  public HashMap listItems() {
    log.info("All Items");
    HashMap indexMap = new HashMap();
    MongoDatabase db = mongo.getDb();

    indexMap.put("database", db.getName());


    db.listCollectionNames().forEach((Consumer<? super String>) s -> {
      indexMap.put(s, "/" + s);
    });

    return indexMap;
  }

  @Autowired
  AlcoholRepository alcoholRepository;

  @GetMapping("alcohol")
  public List<Alcohol> alcohol() {
    log.info("All Alcohol");
    return alcoholRepository.findAll();
  }

  @GetMapping("alcohol/{id}")
  public Alcohol alcoholByVal(@PathVariable String id) {
    log.info("Alcohol by val: " + id);
    try {
      return alcoholRepository.findByMyidOrName(id, URLDecoder.decode(id, "UTF-8")).get();
    } catch (UnsupportedEncodingException e) {
      log.error(e.getMessage());
    }
    return null;
  }

  @Autowired
  ArmorRepository armorRepository;

  @GetMapping("armor")
  public List<Armor> armor() {
    log.info("All Armor");
    return armorRepository.findAll();
  }

  @GetMapping("armor/{id}")
  public Armor armorByVal(@PathVariable String id) {
    log.info("Armor by val: " + id);
    try {
      return armorRepository.findByMyidOrName(id, URLDecoder.decode(id, "UTF-8")).get();
    } catch (UnsupportedEncodingException e) {
      log.error(e.getMessage());
    }
    return null;
  }

  @Autowired
  ChemsRepository chemsRepository;

  @GetMapping("chems")
  public List<Chems> chems() {
    log.info("All chems");
    return chemsRepository.findAll();
  }

  @GetMapping("chems/{id}")
  public Chems chemsByVal(@PathVariable String id) {
    log.info("chems by val: " + id);
    try {
      return chemsRepository.findByMyidOrName(id, URLDecoder.decode(id, "UTF-8")).get();
    } catch (UnsupportedEncodingException e) {
      log.error(e.getMessage());
    }
    return null;
  }

  @Autowired
  ClothingRepository clothingRepository;

  @GetMapping("clothing")
  public List<Clothing> clothing() {
    log.info("All Clothing");
    return clothingRepository.findAll();
  }

  @GetMapping("clothing/{id}")
  public Clothing clothingByVal(@PathVariable String id) {
    log.info("Clothing by val: " + id);
    try {
      return clothingRepository.findByMyidOrName(id, URLDecoder.decode(id, "UTF-8")).get();
    } catch (UnsupportedEncodingException e) {
      log.error(e.getMessage());
    }
    return null;
  }

  @Autowired
  FoodRepository foodRepository;

  @GetMapping("food")
  public List<Food> food() {
    log.info("All food");
    return foodRepository.findAll();
  }

  @GetMapping("food/{id}")
  public Food foodByVal(@PathVariable String id) {
    log.info("food by val: " + id);
    try {
      return foodRepository.findByMyidOrName(id, URLDecoder.decode(id, "UTF-8")).get();
    } catch (UnsupportedEncodingException e) {
      log.error(e.getMessage());
    }
    return null;
  }

  @Autowired
  GearRepository gearRepository;

  @GetMapping("gear")
  public List<Gear> gear() {
    log.info("All Gear");
    return gearRepository.findAll();
  }

  @GetMapping("gear/{id}")
  public Gear gearByVal(@PathVariable String id) {
    log.info("Gear by val: " + id);
    try {
      return gearRepository.findByMyidOrName(id, URLDecoder.decode(id, "UTF-8")).get();
    } catch (UnsupportedEncodingException e) {
      log.error(e.getMessage());
    }
    return null;
  }

  @Autowired
  GrenadesRepository grenadesRepository;

  @GetMapping("grenades")
  public List<Grenades> grenades() {
    log.info("All Grenades");
    return grenadesRepository.findAll();
  }

  @GetMapping("grenades/{id}")
  public Grenades grenadesByVal(@PathVariable String id) {
    log.info("Grenades by val: " + id);
    try {
      return grenadesRepository.findByMyidOrName(id, URLDecoder.decode(id, "UTF-8")).get();
    } catch (UnsupportedEncodingException e) {
      log.error(e.getMessage());
    }
    return null;
  }

  @Autowired
  HeavyWeaponsRepository heavyWeaponsRepository;

  @GetMapping("heavyweapons")
  public List<HeavyWeapons> heavyWeapons() {
    log.info("All heavyweapons");
    return heavyWeaponsRepository.findAll();
  }

  @GetMapping("heavyweapons/{id}")
  public HeavyWeapons heavyWeaponsByVal(@PathVariable String id) {
    log.info("heavyWeapons by val: " + id);
    try {
      return heavyWeaponsRepository.findByMyidOrName(id, URLDecoder.decode(id, "UTF-8")).get();
    } catch (UnsupportedEncodingException e) {
      log.error(e.getMessage());
    }
    return null;
  }

  @Autowired
  LeaderRepository leaderRepository;

  @GetMapping("leader")
  public List<Leader> leader() {
    log.info("All leader");
    return leaderRepository.findAll();
  }

  @GetMapping("leader/{id}")
  public Leader leaderByVal(@PathVariable String id) {
    log.info("leader by val: " + id);
    try {
      return leaderRepository.findByMyidOrName(id, URLDecoder.decode(id, "UTF-8")).get();
    } catch (UnsupportedEncodingException e) {
      log.error(e.getMessage());
    }
    return null;
  }

  @Autowired
  MeleeRepository meleeRepository;

  @GetMapping("melee")
  public List<Melee> melee() {
    log.info("All melee");
    return meleeRepository.findAll();
  }

  @GetMapping("melee/{id}")
  public Melee meleeByVal(@PathVariable String id) {
    log.info("melee by val: " + id);
    try {
      return meleeRepository.findByMyidOrName(id, URLDecoder.decode(id, "UTF-8")).get();
    } catch (UnsupportedEncodingException e) {
      log.error(e.getMessage());
    }
    return null;
  }

  @Autowired
  MinesRepository minesRepository;

  @GetMapping("mines")
  public List<Mines> mines() {
    log.info("All mines");
    return minesRepository.findAll();
  }

  @GetMapping("mines/{id}")
  public Mines minesByVal(@PathVariable String id) {
    log.info("mines by val: " + id);
    try {
      return minesRepository.findByMyidOrName(id, URLDecoder.decode(id, "UTF-8")).get();
    } catch (UnsupportedEncodingException e) {
      log.error(e.getMessage());
    }
    return null;
  }

  @Autowired
  ModsRepository modsRepository;

  @GetMapping("mods")
  public List<Mods> mods() {
    log.info("All mines");
    return modsRepository.findAll();
  }

  @GetMapping("mods/{id}")
  public Mods modsByVal(@PathVariable String id) {
    log.info("mods by val: " + id);
    try {
      return modsRepository.findByMyidOrName(id, URLDecoder.decode(id, "UTF-8")).get();
    } catch (UnsupportedEncodingException e) {
      log.error(e.getMessage());
    }
    return null;
  }

  @Autowired
  PerksRepository perksRepository;

  @GetMapping("perks")
  public List<Perks> perks() {
    log.info("All perks");
    return perksRepository.findAll();
  }

  @GetMapping("perks/{id}")
  public Perks perksByVal(@PathVariable String id) {
    log.info("perks by val: " + id);
    try {
      return perksRepository.findByMyidOrName(id, URLDecoder.decode(id, "UTF-8")).get();
    } catch (UnsupportedEncodingException e) {
      log.error(e.getMessage());
    }
    return null;
  }

  @Autowired
  PistolsRepository pistolsRepository;

  @GetMapping("pistols")
  public List<Pistols> pistols() {
    log.info("All Pistols");
    return pistolsRepository.findAll();
  }

  @GetMapping("pistols/{id}")
  public Pistols pistolsByVal(@PathVariable String id) {
    log.info("Pistols by val: " + id);
    try {
      return pistolsRepository.findByMyidOrName(id, URLDecoder.decode(id, "UTF-8")).get();
    } catch (UnsupportedEncodingException e) {
      log.error(e.getMessage());
    }
    return null;
  }

  @Autowired
  RiflesRepository riflesRepository;

  @GetMapping("rifles")
  public List<Rifles> rifles() {
    log.info("All  rifles");
    return riflesRepository.findAll();
  }

  @GetMapping("rifles/{id}")
  public Rifles riflesByVal(@PathVariable String id) {
    log.info("rifles by val: " + id);
    try {
      return riflesRepository.findByMyidOrName(id, URLDecoder.decode(id, "UTF-8")).get();
    } catch (UnsupportedEncodingException e) {
      log.error(e.getMessage());
    }
    return null;
  }

}
