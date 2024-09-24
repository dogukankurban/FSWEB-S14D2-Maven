package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp(LampType.NEON,true,100);
        Ceiling ceiling = new Ceiling(3, PaintColor.RED);
        Bed bed = new Bed("double",2,2,2,2);
        Wall nWall = new Wall("N");
        Wall eWall = new Wall("E");
        Wall wWall = new Wall("W");
        Wall sWall = new Wall("S");
        Wall[] walls = new Wall[]{nWall,eWall,wWall,sWall};

        Bedroom bedroom = new Bedroom(nWall,eWall,wWall,sWall,ceiling,lamp,
                new Carpet(2,2,PaintColor.WHITE),
                "bedroom",bed, new Wardrobe(1,1,100));
        bedroom.createBedroom();
    }
}