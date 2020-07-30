package com.company.Maps.Walls;

import com.company.Enumerations.WallType;
import com.company.ObjectsForWalls.GameObject;

public class MirrorWall extends Wall {


  @Override
  public WallType getWallType() {
    return WallType.MIRROR;
  }

  @Override
  public void setObjectType(GameObject mirror) {
    objectInWall=mirror;
  }


//  @Override // override to show key
//  public void useKeyTo_Lock_Unlock(String key) {
//    if (isKeyHidden) {
//      if (mirrorPassword != null)
//        if (key.equals(mirrorPassword)) {
//          isKeyHidden = false;
//          System.out.println("key founded, check it");
//        }
//    }
//  }



//  @Override
//  public String toString() {
//    return "WallwithMirror{" +
//            "mirrorPassword='" + mirrorPassword + '\'' +
//            ", isKeyHidden=" + isKeyHidden +
//            ", keyBehindMirror='" + keyBehindMirror + '\'' +
//            '}';
//  }
}
