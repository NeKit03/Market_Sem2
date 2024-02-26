package org.example;

public abstract class Actor implements ActorBehaviour {
    protected String name;
    protected boolean makeOrder;
    protected boolean   takeOrder;

    public String getName() {
        return name;
    }

    public Actor(String name) {
        this.name = name;
        makeOrder=false;
        takeOrder=false;
    }
}
