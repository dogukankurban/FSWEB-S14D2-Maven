package org.example.model;

public class Room {
    private Wall[] walls;

    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;

    private Ceiling ceiling;
    private Lamp lamp;
    private Carpet carpet;

    public Room( Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Lamp lamp, Carpet carpet)  {

        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.lamp = lamp;
        this.carpet = carpet;
    }

    public Room(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Lamp lamp) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.lamp = lamp;
    }

    public Wall[] getWalls() {
        return walls;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Carpet getCarpet() {
        return carpet;
    }
}
