package com.vargur.fwwbase.data.objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class Item {

  @Id
  private String dbid;
  @Field("id")
  private String myid;
  private String name;
  private String cost;
  private String version;

  public String getDbid() {
    return dbid;
  }

  public void setDbid(String dbid) {
    this.dbid = dbid;
  }

  public String getMyid() {
    return myid;
  }

  public void setMyid(String myid) {
    this.myid = myid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCost() {
    return cost;
  }

  public void setCost(String cost) {
    this.cost = cost;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public String toString() {
    return String.format(
      "Item: [_id=%s, id=%s name='%s', cost='%s', version='%s']",
      dbid, myid, name, cost, version);
  }
}
