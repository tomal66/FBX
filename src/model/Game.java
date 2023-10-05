package model;

public abstract class Game {
    protected String name;  // Name of the game

    public Game(String name) {
        this.name = name;
    }

    public abstract void play();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}