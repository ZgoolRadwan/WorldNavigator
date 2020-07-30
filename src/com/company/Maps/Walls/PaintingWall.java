package com.company.Maps.Walls;

import com.company.Enumerations.WallType;
import com.company.ObjectsForWalls.GameObject;

public class PaintingWall extends Wall {



  @Override
  public WallType getWallType() {
    return WallType.PAINTING;
  }

  @Override
  public void setObjectType(GameObject painting) {
    objectInWall=painting;
  }


//  @Override // override to show key
//  public void useKeyTo_Lock_Unlock(String key) {
//    if (isKeyHidden) {
//      if (paintingPassword != null)
//        if (key.equals(paintingPassword)) {
//          isKeyHidden = false;
//          System.out.println("key founded, check it");
//        }
//    }
//  }


}
