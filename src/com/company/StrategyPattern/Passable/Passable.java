package com.company.StrategyPattern.Passable;

import com.company.Maps.Room;

public class Passable implements PassableBehavior {

  private Room nextRoom;


  @Override
  public Room getNextRoom() {
    return nextRoom;
  }

  @Override
  public void setNextRoom(Room nextRoom) {
    this.nextRoom = nextRoom;
  }



  @Override
  public String toString() {
    return "WithDoor{" +
            "nextRoom=" + nextRoom +
            '}';
  }

}
