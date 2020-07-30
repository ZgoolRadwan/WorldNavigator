package com.company.Maps.Walls;

import com.company.Enumerations.WallType;
import com.company.ObjectsForWalls.GameObject;


public class WallHasDoor extends Wall {


  @Override
  public WallType getWallType() {
    return WallType.DOOR;
  }

    @Override
    public void setObjectType(GameObject door) {
        objectInWall=door;
    }

//  @Override
//  public void checkWall(PlayerStatus playerStatus) {
//    if (lockable.isLocked()) {
//      System.out.println("Door is locked use " + getDoorkey() + " to unlock it.");
//    } else {
//      if (passableBehavior.isDoorOpen()) {
//        System.out.println("Door is open.");
//      } else {
//        System.out.println("Door is closed, open it.");
//      }
//    }
//  }


//
//    @Override
//    public String toString() {
//      return "DoorBuilder{" +
//              "nextRoom=" + nextRoom +
//              ", doorKey='" + doorKey + '\'' +
//              '}';
//    }
//  }
}
