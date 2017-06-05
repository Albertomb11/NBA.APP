package org.NBAAPP.com.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by Alberto on 11/05/2017.
 */
public class Method {

    private ArrayList<Team> teams;
    private ArrayList<Player> players;
    private ArrayList<Coach> coaches;

    /**
     * Constructor that instantiates arrayList.
     */
    public Method() {
        teams = new ArrayList<>();
        players = new ArrayList<>();
        coaches = new ArrayList<>();
    }

    /**
     * Method that adds the object team in the arraylist teams
     * @param team
     */
    public void addTeam(Team team) {
        if (team != null) {
            teams.add(team);
        }
    }

    /**
     * Method that adds the object player in the arraylist players
     * @param player
     */
    public void addPlayer(Player player) {
        if (player != null) {
            players.add(player);
        }
    }

    /**
     * Method that adds the object coach in the arraylist coaches
     * @param coach
     */
    public void addCoach(Coach coach) {
        if (coach != null) {
            coaches.add(coach);
        }
    }

    /**
     * Auxiliary method.
     * @return
     */
    public ArrayList<Team> getTeams() {
        return teams;
    }

    /**
     * Auxiliary method.
     * @return
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * Auxiliary method.
     * @return
     */
    public ArrayList<Coach> getCoaches() {
        return coaches;
    }

    /**
     * Method that runs the arrayList teams and prints the team object.
     */
    public void listOfTeam() {
        for (Team team : teams) {
            System.out.println(team);
        }
    }

    /**
     * Method that lists the array teams by name.
     */
    public void teamListByName() {
        Collections.sort(teams, Team.compareByName);

        listOfTeam();
    }

    /**
     * Method that runs the arrayList players and prints the player object.
     */
    public void listOfPlayers() {
        for (Player player : players) {
            System.out.println(player);
        }
    }

    /**
     * Method that lists the array players by name.
     */
    public void playerListByName() {
        Collections.sort(players, Player.compareByName);

        listOfPlayers();
    }

    /**
     * Method that runs the arrayList coaches and prints the coach object.
     */
    public void listOfCoach() {
        for (Coach coach : coaches) {
            System.out.println(coach);
        }
    }

    /**
     * Method that lists the array coaches by name.
     */
    public void coachListByName() {
        Collections.sort(coaches, Coach.compareByName);

        listOfCoach();
    }

    /**
     * Method that obtains the identifier of the team object.
     * @return
     */
    public String obtaintIndentifierOfTeam(){
        Scanner s = new Scanner(System.in);
        String index;

        System.out.println("Enter the team name´s to delete it");
        index = s.nextLine();

        return index;
    }

    /**
     * Method that obtains the identifier of the player object.
     * @return
     */
    public String obtaintIndentifierOfPlayer(){
        Scanner s = new Scanner(System.in);
        String index;

        System.out.println("Enter the player name´s to delete it");
        index = s.nextLine();

        return index;
    }

    /**
     * Method that obtains the identifier of the coach object.
     * @return
     */
    public String obtaintIndentifierOfCoach(){
        Scanner s = new Scanner(System.in);
        String index;

        System.out.println("Enter the coach name´s to delete it");
        index = s.nextLine();

        return index;
    }

    /**
     * Method that deletes the team object by passing the identifier.
     * @param identificador
     */
    public void removeTeam(String identificador) {
        String comprobador = null;
        Iterator<Team> itTeam = teams.iterator();

        while (itTeam.hasNext()) {
            Team team = itTeam.next();

            if (team.getName().equals(identificador)) {
                itTeam.remove();
                System.out.println("Team deleted successfully");
                comprobador = "";
            }
        }
        if (comprobador == null) {
            System.out.println("The team does not exist");
        }

    }

    /**
     * Method that deletes the player object by passing the identifier.
     * @param identificador
     */
    public void removePlayer(String identificador) {
        String comprobador = null;
        Iterator<Player> itPlayer = players.iterator();

        while (itPlayer.hasNext()) {
            Player player = itPlayer.next();

            if (player.getName().equals(identificador)) {
                itPlayer.remove();
                System.out.println("Player deleted successfully");
                comprobador = "";
            }
        }
        if (comprobador == null) {
            System.out.println("The player does not exist");
        }
    }

    /**
     * Method that deletes the coach object by passing the identifier.
     * @param identificador
     */
    public void removeCoach(String identificador) {
        String comprobador = null;
        Iterator<Coach> itCoach = coaches.iterator();

        while (itCoach.hasNext()) {
            Coach coach = itCoach.next();

            if (coach.getName().equals(identificador)) {
                itCoach.remove();
                System.out.println("Coach deleted successfully");
                comprobador = "";
            }
        }
        if (comprobador == null) {
            System.out.println("The coach does not exist");
        }
    }
}
