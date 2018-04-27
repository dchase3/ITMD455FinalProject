//first package will be different on each computer make use you add yours
//and comment out the others on your computer.
package com.example.densi.itmd455finalproject;
//package com.example.ssiruuk.itmd455finalproject;
//package com.example.raiven.itmd455final;

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