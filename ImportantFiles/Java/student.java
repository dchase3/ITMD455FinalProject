package com.example.raiven.itmd455final;

/**
 * Created by Raiven on 4/27/2018.
 */

/**
 * Created by Raiven on 4/10/2018.
 */
public class student {

    private int id;
    private String name;

    public student()
    {
        id++;
        name="Stacey Adams";
    }
    public student(String name)
    {
        super();
        this.name=name;
        id++;
    }

     public int getId() {
            return id;
    }

    public void setId(int i) {
            id = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String toString()
    {
        return "Id : " + id + "\tName: " + name;
    }
}