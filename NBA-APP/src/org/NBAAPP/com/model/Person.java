package org.NBAAPP.com.model;

import java.util.Date;

/**
 * Created by Alberto on 11/05/2017.
 */
public abstract class Person {
    //-------------------------Attributes-----------------------------------
    protected String name;            //Attribute type name String.
    protected int birthdate;         //Attribute type birthdate Date.
    protected int age;                //Attribute type age int.
    protected String cityOfBirth;     //Attribute type cityOfBirth String.
    protected double height;          //Attribute type height double.
    protected double salary;          //Attribute type salary double.
    protected String actualTeam;      //Attribute type actualTeam String.

    //--------------------------Constructor------------------------------------
    public Person() {
        this.name = "";
        this.birthdate = 0;
        this.age = 0;
        this.cityOfBirth = "";
        this.height = 0;
        this.salary = 0;
        this.actualTeam = "";
    }

    public Person(String name, int birthdate, int age, String cityOfBirth, double height, double salary, String actualTeam) {
        this.setName(name);
        this.setBirthdate(birthdate);
        this.setAge(age);
        this.setCityOfBirth(cityOfBirth);
        this.setHeight(height);
        this.setSalary(salary);
        this.setActualTeam(actualTeam);
    }

    //-----------------------Setters-------------------------------------------------
    public void setName(String name) {
        if (name.equals("")){
            this.name = "Invalid name";
            System.out.println("The introduced name is invalid");
        }else{
            this.name = name;
        }
    }

    public void setBirthdate(int birthdate) {
        if (birthdate < 0 || birthdate > 2017){
            this.birthdate = 0;
            System.out.println("The introduced birthdate is invaild");
        }else{
            this.birthdate = birthdate;
        }
    }

    public void setAge(int age) {
        if (age < 0 || age > 150){
            this.age = 16;
            System.out.println("The introduced age is invalid");
        }else{
            this.age = age;
        }
    }

    public void setCityOfBirth(String cityOfBirth) {
        if (cityOfBirth.equals("")){
            this.cityOfBirth = "Invalid city of birth";
            System.out.println("The introduced city is invalid");
        }else{
            this.cityOfBirth = cityOfBirth;
        }
    }

    public void setHeight(double height) {
        if (height < 0.0 || height > 4.0){
            this.height = 0.0;
            System.out.println("The introduced height is invalid");
        }else{
            this.height = height;
        }
    }

    public void setSalary(double salary) {
        if (salary < 0){
            this.salary = 0;
            System.out.println("The introduced salary is invalid");
        }else{
            this.salary = salary;
        }
    }

    public void setActualTeam(String actualTeam) {
        if (actualTeam.equals("")){
            this.actualTeam = "Invalid";
            System.out.println("The introduced actual Team is invalid");
        }else{
            this.actualTeam = actualTeam;
        }
    }

    //------------------------Getters----------------------------------------------
    public String getName() {
        return name;
    }

    public int getBirthdate() {
        return birthdate;
    }

    public int getAge() {
        return age;
    }

    public String getCityOfBirth() {
        return cityOfBirth;
    }

    public double getHeight() {
        return height;
    }

    public double getSalary() {
        return salary;
    }

    public String getActualTeam() {
        return actualTeam;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", age=" + age +
                ", cityOfBirth='" + cityOfBirth + '\'' +
                ", height=" + height +
                ", salary=" + salary +
                ", actualTeam='" + actualTeam + '\'' +
                '}';
    }
}