package org.NBAAPP.com.model;

import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

/**
 * Created by Alberto on 11/05/2017.
 */
public class Coach extends Person {
    //------------------------Attributes----------------------
    private int rings;      //Attribute type rings int.

    //-----------------------Constructor-----------------------
    public Coach(){
        this("", 0, 0, "", 0.0, 0.0, "", 0);
    }

    public Coach(int rings) {
        this.setRings(rings);
    }

    public Coach(
            String name,
            int birthdate,
            int age,
            String cityOfBirth,
            double height,
            double salary,
            String actualTeam,
            int rings) {
        super(name, birthdate, age, cityOfBirth, height, salary, actualTeam);
        this.setRings(rings);
    }

    //-------------------------Setters-------------------
    public void setRings(int rings) {
        if (rings < 0){
            this.rings = 0;
            System.out.println("The introduced rings is invalid");
        }else{
            this.rings = rings;
        }
    }

    //--------------------------Getters--------------------
    public int getRings() {
        return rings;
    }

    //--------------------toString method------------------------
    @Override
    public String toString() {
        return super.toString()+
                "rings=" + rings +
                '}';
    }

    public static Comparator<Coach> compareByName = new Comparator<Coach>() {
        @Override
        public int compare(Coach coach1, Coach coach2) {
            return coach1.getName().compareToIgnoreCase(coach2.getName());
        }
    };

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Coach coach = (Coach) obj;

        return Objects.equals(this.getName(),coach.getName());
    }
}
