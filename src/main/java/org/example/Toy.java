package main.java.org.example;

import java.util.ArrayList;
import java.util.Random;

public class Toy implements Interface{
    protected int id;
    protected String name;
    protected int count;
    protected int odd;

    public Toy(String name, int count, int odd) {
        this.name = name;
        this.id = generateId();
        this.count = count;
        this.odd = odd;
    }

    private int generateId() {
        return new Random().nextInt();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getInfo() {
        return "ID: " + id + "| Название: " + name + "| Количество: " + count + "| Вероятность: " + odd;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public int getOdd() {
        return odd;
    }

    @Override
    public int inputOdd(int odd) {
        return this.odd = odd;
    }

    @Override
    public int inputCount(int count) {
        return this.count = count;
    }
}
