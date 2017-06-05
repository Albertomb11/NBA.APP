package org.NBAAPP.com.model;

import java.io.IOException;
import java.util.Comparator;
import java.util.Objects;

/**
 * Created by Alberto on 11/05/2017.
 */
public class Team{
    //-------------------------Attributes--------------------------------
    private String name;            //Attribute type name String.
    private int foundationYear;    //Attribute type foundationYear Date.
    private String conference;      //Attribute type conference String.
    private String stadium;         //Attribute type stadium String.
    private String city;            //Attribute type city String.
    private String owner;           //Attribute type owner String.
    private String founders;        //Attribute type founders String.

    //-------------------------Constructors-------------------------------------
    public Team() {
        this.name = "";
        this.foundationYear = 0;
        this.conference = "";
        this.stadium = "";
        this.city = "";
        this.owner = "";
        this.founders = "";
    }

    public Team(
            String name,
            int foundationYear,
            String conference,
            String stadium,
            String city,
            String owner,
            String founders) {
        this.setName(name);
        this.setFoundationYear(foundationYear);
        this.setConference(conference);
        this.setStadium(stadium);
        this.setCity(city);
        this.setOwner(owner);
        this.setFounders(founders);
    }

    //------------------------------Setters-----------------------
    public void setName(String name) {
        if (name.equals("")){
            this.name = "Invalid";
            System.out.println("The introduced name is invalid");
        }else{
            this.name = name;
        }
    }

    public void setFoundationYear(int foundationYear) {
            if (foundationYear < 1900 || foundationYear > 2018){
                this.foundationYear = 0;
                System.out.println("The introduced foundation year is invalid");
            }else{
                this.foundationYear = foundationYear;
            }
    }

    public void setConference(String conference) {
        if (conference.equals("")
        ){
            this.conference = "Invalid";
            System.out.println("The introduced conference is invalid");
        }else{
            this.conference = conference;
        }
    }

    public void setStadium(String stadium) {
        if (stadium.equals("")){
            this.stadium = "Invalid";
            System.out.println("The introduced stadium is invalid");
        }else{
            this.stadium = stadium;
        }
    }

    public void setCity(String city) {
        if (city.equals("")){
            this.city = "Invalid";
            System.out.println("The introduced city is invalid");
        }else{
            this.city = city;
        }
    }

    public void setOwner(String owner) {
        if (owner.equals("")){
            this.owner = "Invalid";
            System.out.println("The introduced owner is invaild");
        }else{
            this.owner = owner;
        }
    }

    public void setFounders(String founders) {
        if (founders.equals("")){
            this.founders = "Invalid";
            System.out.println("The introduced founders is invalid");
        }else{
            this.founders = founders;
        }
    }

    //-----------------------------Getters--------------------------
    public String getName() {
        return name;
    }

    public int getFoundationDate() {
        return foundationYear;
    }

    public String getConference() {
        return conference;
    }

    public String getStadium() {
        return stadium;
    }

    public String getCity() {
        return city;
    }

    public String getOwner() {
        return owner;
    }

    public String getFounders() {
        return founders;
    }


    //-------------------------toString method--------------------------------
    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", foundationYear=" + foundationYear +
                ", conference='" + conference + '\'' +
                ", stadium='" + stadium + '\'' +
                ", city='" + city + '\'' +
                ", owner='" + owner + '\'' +
                ", founders='" + founders + '\'' +
                '}';
    }

    public static Comparator<Team> compareByName = new Comparator<Team>() {
        @Override
        public int compare(Team team1, Team team2) {
            return team1.getName().compareToIgnoreCase(team2.getName());
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

        Team team = (Team)obj;

        return Objects.equals(this.getName(),team.getName());
    }
}
