package com.vargur.fwwbase.data.objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class Factions {
  @Id
  private String dbid;
  @Field("id")
  private String myid;
  private String name;
  private String trait;

  public Factions() {
  }

  public void setDbId(String dbid) {
    this.dbid = dbid;
  }

  public void setMyid(String id) {
    this.myid = myid;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setTrait(String trait) {
    this.trait = trait;
  }

  public String getMdbId() {
    return dbid;
  }

  public String getId() {
    return myid;
  }

  public String getName() {
    return name;
  }

  public String getTrait() {
    return trait;
  }

  @Override
  public String toString() {
    return String.format(
      "[_id=%s, id=%s name='%s', trait='%s']",
      dbid, myid, name, trait);
  }
}
