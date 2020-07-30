package com.company.Maps.Walls;

import com.company.Enumerations.WallType;
import com.company.ObjectsForWalls.GameObject;

public class WallHasSeller extends Wall {

  @Override
  public WallType getWallType() {
    return WallType.SELLER;
  }

  @Override
  public void setObjectType(GameObject seller) {
    objectInWall=seller;
  }


//  @Override
//  public String toString() {
//    return "Wall with Seller{" +
//            "seller Items=" + sellerItems +
//            '}';
//  }


}
