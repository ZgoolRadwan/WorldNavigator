package com.company.Maps.Walls.WallFactory;

import com.company.Items.Flash;
import com.company.Items.GameItem;
import com.company.Items.Key;
import com.company.Maps.Walls.Wall;
import com.company.Maps.Walls.*;
import com.company.ObjectsForWalls.Chest;
import com.company.ObjectsForWalls.Mirror;
import com.company.ObjectsForWalls.Painting;
import com.company.ObjectsForWalls.Seller;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.HashMap;

public class WallFactory {


   public static Wall createWall(String wallType, Element wallPropertyTags)
   {
       /*switch (wallType) {
           case "chest":
               return createChestWall(wallPropertyTags);
           case "seller":
               return createSellerWall(wallPropertyTags);
           case "empty":
               return new EmptyWall();
           case "painting":
               return createPaintingWall(wallPropertyTags);
           case "mirror":
               return createMirrorWall(wallPropertyTags);
           case "door":
               return new EmptyWall(); // door will be initialized after rooms
       }*/
       throw new NullPointerException("Wall missed tags in XML File");
   }

    private static Wall createPaintingWall(Element itemsFromXML) {
        String password="";
        String keyBehindPainting="";
        try {
            password = itemsFromXML.getElementsByTagName("password").item(0).getTextContent();
        } catch (NullPointerException e) {
            System.out.println("Painting password tags missed in XML file, Check XML file");
        }
        try {
            keyBehindPainting = itemsFromXML.getElementsByTagName("key").item(0).getTextContent();
        } catch (NullPointerException e) {
            System.out.println("Painting key tags missed in XML file, Check XML file");
        }

//        Wall painting=new PaintingWall.PaintingBuilder().hideKey(password)
//                .setKeyBehindPainting(keyBehindPainting).build();
        Wall painting=new PaintingWall();
        Painting paintingObject=new Painting();
        ArrayList<GameItem>paintingItems=new ArrayList<>();
        Key key=new Key();
        //System.out.println("Painting created");
        key.setName(password);
        Key hideenKey=new Key();
        hideenKey.setName(keyBehindPainting);
        paintingItems.add(hideenKey);
        paintingObject.setHiddenItems(paintingItems);
        paintingObject.setLockKey(key);
        System.out.println("lock key");
        System.out.println("Painting22 created");
        painting.setObjectType(paintingObject);

        return painting;
    }

    private static Wall createMirrorWall(Element itemsFromXML) {
        String password="";
        String keyBehindMirror="";
       try {
             password = itemsFromXML.getElementsByTagName("password").item(0).getTextContent();
        } catch (NullPointerException e) {
            System.out.println("Password tag missed in XML file, check XML file.");
        }
        try {
            keyBehindMirror = itemsFromXML.getElementsByTagName("key").item(0).getTextContent();
        } catch (NullPointerException e) {
            System.out.println("Key tag missed in XML file, check XML file.");
        }
        //Wall mirror=new MirrorWall.MirrorBuilder().hideKey(password).setKeyBehindMirror(keyBehindMirror).build();
        Wall mirror=new MirrorWall();
        Mirror mirrorObject=new Mirror();
        Key key=new Key();
        key.setName(password);
        Key hideenKey=new Key();
        hideenKey.setName(keyBehindMirror);
        ArrayList<GameItem>items=new ArrayList<>();
        items.add(hideenKey);
        mirrorObject.setHiddenItems(items);
        mirrorObject.setLockKey(key);
        mirror.setObjectType(mirrorObject);
        System.out.println("Mirror created");
        return mirror;
    }

    private static Wall createChestWall(Element itemsFromXML) {

        String chestKey;
        ArrayList<GameItem>chestItems=new ArrayList<>();
        try {
          /*  NodeList items = itemsFromXML.getElementsByTagName("item");
            for (int k = 0; k < items.getLength(); k++) {
                chestItems.add(items.item(k));
            }*/
        } catch (NullPointerException e) {
            throw new NullPointerException("chest items tag missed in XML file, check XML file.");
        }
        try {
             chestKey = itemsFromXML.getElementsByTagName("key").item(0).getTextContent();
        } catch (NullPointerException e) {
            throw new NullPointerException("chest key tag missed in XML file, check XML file.");
        }
        try {
           /* golds =
                    Integer.parseInt(itemsFromXML.getElementsByTagName("golds").item(0).getTextContent());*/
        } catch (NullPointerException e) {
            throw new NullPointerException("chest golds tag missed in XML file, check XML file.");
        }
        //Wall chest = new ChestWall.ChestBuilder().setChestItems(chestItems,golds).setChestKey(chestKey).build();
        Wall chest = new ChestWall();
       /* ArrayList<GameItem>chestItems=new ArrayList<>();*/
        ArrayList<Flash>chestflasss=new ArrayList<>();
        Chest chest1=new Chest();
/*
        chest1.setItemsList(chestflasss);
        chest1.setKeysInChest(chestKeys);*/
        chest.setObjectType(chest1);
        System.out.println("Chest created");
        return chest;
    }

    private static Wall createSellerWall(Element itemsFromXML) {
        HashMap<String, Integer> sellerItemsBag = new HashMap<>();
        try {
            NodeList sellerItems = itemsFromXML.getElementsByTagName("item");
            for (int k = 0; k < sellerItems.getLength(); k++) {
                Node item = sellerItems.item(k);
                if (item.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) item;
                    try {
                        String item_name = element.getAttribute("name");
                        int item_price = Integer.parseInt(element.getAttribute("price"));
                        sellerItemsBag.put(item_name, item_price);

                    } catch (NullPointerException e) {
                        throw new NullPointerException("item name tag it's missed in XML file.");
                    }
                }
            }
            //Wall seller = new WallHasSeller.SellerBuilder().setSellerItems(sellerItemsBag).build();
            Wall seller = new WallHasSeller();
            Seller sellerObject=new Seller();
            Key k1=new Key();
            k1.setName("Honda");
            k1.setPrice(5);

            Key k2=new Key();
            k2.setName("marka");
            k2.setPrice(10);
            ArrayList<GameItem>sellerItemList=new ArrayList<>();
            sellerItemList.add(k1);sellerItemList.add(k2);
            sellerObject.setItemsList(sellerItemList);
            seller.setObjectType(sellerObject);

            System.out.println("Seller created");
            return seller;
        } catch (NullPointerException e) {
            throw new NullPointerException("Seller items tags is missed in XML file.");
        }
    }
}
