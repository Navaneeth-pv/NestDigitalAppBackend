package com.example.Nestdigitalapp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "leaveapplication")
public class LeaveApplication {


    @Id
    @GeneratedValue()

    private int id;
    private String empcode;
    private String leavetype;
    private String remark;
    private String fromdate;
    private String todate;
    private String applydate;

    public LeaveApplication() {
    }

    public LeaveApplication(int id, String empcode, String leavetype, String remark, String fromdate, String todate, String applydate) {
        this.id = id;
        this.empcode = empcode;
        this.leavetype = leavetype;
        this.remark = remark;
        this.fromdate = fromdate;
        this.todate = todate;
        this.applydate = applydate;
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

    public String getLeavetype() {
        return leavetype;
    }

    public void setLeavetype(String leavetype) {
        this.leavetype = leavetype;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getFromdate() {
        return fromdate;
    }

    public void setFromdate(String fromdate) {
        this.fromdate = fromdate;
    }

    public String getTodate() {
        return todate;
    }

    public void setTodate(String todate) {
        this.todate = todate;
    }

    public String getApplydate() {
        return applydate;
    }

    public void setApplydate(String applydate) {
        this.applydate = applydate;
    }
}
