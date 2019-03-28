package com.vargur.fwwbase.data.objects.items;

import com.vargur.fwwbase.data.objects.Item;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "heavy_weapons")
public class HeavyWeapons extends Item {
  public HeavyWeapons() {
    super();
  }
}
