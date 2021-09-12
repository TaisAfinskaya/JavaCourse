package com.alpha.work3;
import java.util.Random;

public class Id {
    private int id;
    static int nextId;

    static {
        Random rand = new Random();
        int upperbound = 101;
        nextId = rand.nextInt(upperbound);
    }

    public Id() {
        this.id = nextId++;
    }

    @Override
    public String toString() {
        return "Id{" +
                "id=" + id +
                '}';
    }
}
