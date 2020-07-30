package com.company.StrategyPattern.Passable;

import com.company.Maps.Room;

public class CannotPassed implements PassableBehavior {

  @Override
  public Room getNextRoom() {
    return null;
  }

  @Override
  public void setNextRoom(Room nextRoom) {}



}
