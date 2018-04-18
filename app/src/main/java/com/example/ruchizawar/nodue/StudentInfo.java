package com.example.ruchizawar.nodue;

import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by RUCHI ZAWAR on 13/04/2018.
 */

public class StudentInfo {

    String prn,totalfees,feespaid,remainingfees;
    String name;
    String branch,year,feescategory;
    public StudentInfo()
    {

    }

    public StudentInfo(String prn, String name, String branch, String year, String feescategory, String totalfees, String feespaid, String remainingfees)
    {
        this.prn=prn;
        this.name=name;
        this.branch=branch;
        this.year=year;
        this.feescategory=feescategory;
        this.totalfees=totalfees;
        this.feespaid=feespaid;
        this.remainingfees=remainingfees;
    }


    public StudentInfo(String name, String branch, String year, String feescategory, String totalfees, String feespaid, String remainingfees)
    {
        this.name=name;
        this.branch=branch;
        this.year=year;
        this.feescategory=feescategory;
        this.totalfees=totalfees;
        this.feespaid=feespaid;
        this.remainingfees=remainingfees;
    }

    public String getPrn() {
        return prn;
    }

    public void setPrn( String  prn) {
        this.prn = prn;
    }

    public  String  getTotalfees() {
        return totalfees;
    }

    public void setTotalfees( String  totalfees) {
        this.totalfees = totalfees;
    }

    public  String  getFeespaid() {
        return feespaid;
    }

    public void setFeespaid( String  feespaid) {
        this.feespaid = feespaid;
    }

    public  String  getRemainingfees() {
        return remainingfees;
    }

    public void setRemainingfees(String remainingfees) {
        this.remainingfees = remainingfees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getFeescategory() {
        return feescategory;
    }

    public void setFeescategory(String feescategory) {
        this.feescategory = feescategory;
    }
}
