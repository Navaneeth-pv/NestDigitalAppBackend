package com.example.Nestdigitalapp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employeelog")
public class EmployeeLog {

    @Id
    @GeneratedValue()

    private int id;
    private String empcode;
    private String date;
    private String entrydate;
    private String exitdate;

    public EmployeeLog() {
    }

    public EmployeeLog(int id, String empcode, String date, String entrydate, String exitdate) {
        this.id = id;
        this.empcode = empcode;
        this.date = date;
        this.entrydate = entrydate;
        this.exitdate = exitdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpcode() {
        return empcode;
    }

    public void setEmpcode(String empcode) {
        this.empcode = empcode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
