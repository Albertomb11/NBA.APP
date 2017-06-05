package org.NBAAPP.com.model;

import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

/**
 * Created by Alberto on 11/05/2017.
 */
public class Player extends Person {
    //-----------------------Attributes----------------------------
    private String position;        //Attribute type position String.

    //------------------------Constructor------------------------------
    public Player(){
        this("", 0,0,"",0.0,0.0,"","");
    }

    public Player(String position) {
        this.setPosition(position);
    }

    public Player(
            String name,
            int birthdate,
            int age,
            String cityOfBirth,
            double height,
            double salary,
            String actualTeam,
            String position) {
        super(name, birthdate, age, cityOfBirth, height, salary, actualTeam);
        this.setPosition(position);
    }

    //------------------------------Setters-----------------------
    public void setPosition(String position) {
        if (position.equals("")){
            this.position = "";
            System.out.println("The introduced position is invaild. The valid position are: Point Guard, Shooting Guard, Small Forward, Power Forward, Center");
        }else{
            this.position = position;
        }
    }

    //---------------------------Getters------------------------
    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return super.toString()+
                "position='" + position + '\'' +
                '}';
    }

    public static Comparator<Player> compareByName = new Comparator<Player>() {
        @Override
        public int compare(Player player1, Player player2) {
            return player1.getName().compareToIgnoreCase(player2.getName());
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

        Player player = (Player) obj;

        return Objects.equals(this.getName(),player.getName());
    }
}
