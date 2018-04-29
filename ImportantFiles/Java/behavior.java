package com.example.raiven.itmd455final;

/**
 * Created by Raiven on 4/28/2018.
 */


public class behavior {

    private int behaviorId;
    private int studentId;
    private String date;
    private String conduct;
    private String details;
    private String action;

    public behavior()
    {
        behaviorId++;
        studentId=3;
        date="1/21/18";
        conduct="Blurting";
        details="Repeatedly using the F word";
        action="Sent in hall way plus verbal warning";
    }
    public behavior(int bid,int id, String date, String conduct, String details, String action)
    {
        super();
        behaviorId=bid;
        this.studentId=id;
        this.date=date;
        this.conduct=conduct;
        this.details= details;
        this.action=action;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String d) {
        date = d;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int i) {
        studentId = i;
    }

    public int getBehaviorId() {  return behaviorId; }

    public void setBehaviorId(int i) {
        behaviorId = i;
    }

    public String getConduct() {
        return conduct;
    }

    public void setConduct (String c) {
        conduct = c;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String d) {
        details = d;
    }


    public String getAction() {
        return action;
    }

    public void setAction(String a) {
        action = a;
    }


    public String toString()
    {
        return "bId : " + behaviorId + "\tsid: " + studentId+"\tconduct : " + conduct + "\tdetails: " + details+"\tdate : " + date + "\taction taken: " + action;
    }
}