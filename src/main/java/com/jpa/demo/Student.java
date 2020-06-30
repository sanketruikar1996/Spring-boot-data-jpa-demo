package com.jpa.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Student 
{   @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private int id;
    private String first_name;
    private String last_name;
    private int age;

    public int getid(){return this.id;}
    public void setid(int id){this.id=id;}
    public String getfirst_name(){return this.first_name;}
    public void setfirst_name(String fm){this.first_name=fm;}
    public String getlast_name(){return this.last_name;}
    public void setlast_name(String ls){this.last_name=ls;}
    public int getage(){return this.age;}
    public void setage(int ag){this.age=ag;}
   



    
}