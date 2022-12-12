package com.example.Nestdigitalapp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "visitorlog")
public class VisitorLog {

    @Id
    @GeneratedValue()

    private int id;
    private String visitorname;
    private String purpose;
    private String whomtomeet;
    private String entrydate;
    private String exitdate;

    public VisitorLog() {
    }

    public VisitorLog(int id, String visitorname, String purpose, String whomtomeet, String entrydate, String exitdate) {
        this.id = id;
        this.visitorname = visitorname;
        this.purpose = purpose;
        this.whomtomeet = whomtomeet;
        this.entrydate = entrydate;
        this.exitdate = exitdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVisitorname() {
        return visitorname;
    }

    public void setVisitorname(String visitorname) {
        this.visitorname = visitorname;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getWhomtomeet() {
        return whomtomeet;
    }

    public void setWhomtomeet(String whomtomeet) {
        this.whomtomeet = whomtomeet;
    }

    public String getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(String entrydate) {
        this.entrydate = entrydate;
    }

    public String getExitdate() {
        return exitdate;
    }

    public void setExitdate(String exitdate) {
        this.exitdate = exitdate;
    }
}
