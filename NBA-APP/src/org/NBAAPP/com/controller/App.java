package org.NBAAPP.com.controller;
import org.NBAAPP.com.model.Coach;
import org.NBAAPP.com.model.Method;
import org.NBAAPP.com.model.Player;
import org.NBAAPP.com.model.Team;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Alberto on 11/05/2017.
 */
public class App {

    private Method method;

    public App() {
        method = new Method();
    }
    /**
     * In this method we control the option that the user has entered and will refer
     * to the corresponding method and will be executed.
     */
    public void start() {
        int option;

            while ((option = showMenu()) != 0) {
                switch (option) {
                    case 1:
                        askTeamInfo();
                        break;
                    case 2:
                        askPlayerInfo();
                        break;
                    case 3:
                        askCoachInfo();
                        break;
                    case 4:
                        method.teamListByName();
                        break;
                    case 5:
                        method.playerListByName();
                        break;
                    case 6:
                        method.coachListByName();
                        break;
                    case 7:
                        method.removeTeam(method.obtaintIndentifierOfTeam());
                        break;
                    case 8:
                        method.removePlayer(method.obtaintIndentifierOfPlayer());
                        break;
                    case 9:
                        method.removeCoach(method.obtaintIndentifierOfCoach());
                        break;
                    default:
                }
            }
    }

    /**
     * In this method we ask the user the data corresponding to the equipment and we control
     * that it does not put incorrect characters.
     *
     * @return
     */
    public void askTeamInfo(){
        Scanner s = new Scanner(System.in);
        String name, conference = "", stadium, city, owner, founders;
        int foundationYear = 0, question;

                do {
                    System.out.println("Enter the name of the team");
                    name = s.next().trim().replaceAll("\\s+", " ");
                } while (name.equals(""));


            s.nextLine();

            do {
                try {
                    System.out.println("Enter the foundation Year of the team (1900 to 2018)");
                    foundationYear = s.nextInt();
                }catch (InputMismatchException e){
                System.out.println("Invalid, try again");
                s.nextLine();
                }
            }while (foundationYear < 1900 || foundationYear > 2018);

            s.nextLine();

            do {
                try {
                    System.out.println("Enter the conference in which the team belongs (East[1] or West[2])");
                    question = s.nextInt();
                    if (question == 1) {
                        conference = "East";
                    } else if (question == 2) {
                        conference = "West";
                    }
            }catch (InputMismatchException e) {
                    System.out.println("Invalid, try again");
                    s.nextLine();
                }
            }while (conference.equals(""));

            s.nextLine();

            do {
                System.out.println("Enter the name of the team´s stadium");
                stadium = s.next().trim().replaceAll("\\s+", " ");
            } while (stadium.equals(""));

            s.nextLine();

            do {
                System.out.println("Enter the name of the team city");
                city = s.next().trim().replaceAll("\\s+", " ");
            } while (city.equals(""));

            s.nextLine();

            do {
                System.out.println("Enter the name of the team owner");
                owner = s.next().trim().replaceAll("\\s+", " ");
            } while (owner.equals(""));

            s.nextLine();

            do {
                System.out.println("Enter the name of the team founders");
                founders = s.next().trim().replaceAll("\\s+", " ");
            } while (founders.equals(""));

            s.nextLine();

        method.addTeam(new Team(name, foundationYear, conference, stadium, city, owner, founders));
    }

    /**
     * In this method we ask the user the data corresponding to the player and we control
     * that it does not put incorrect characters.
     *
     * @return
     */
    public void askPlayerInfo() {
        Scanner s = new Scanner(System.in);
        String name, cityOfBirth, actualTeam, position = "";
        int age = 0, birthdate = 0, question = 0;
        double height = 0.0, salary = 0.0;

            do {
                System.out.println("Enter the name of the player");
                name = s.next().trim().replaceAll("\\s+", " ");
            } while (name.equals(""));

            s.nextLine();

            do {
                try {
                    System.out.println("Enter the postion of the player");
                    System.out.println("Point Guard[1], Shooting Guard[2], Small Forward[3], Power Forward[4], Center[5]");
                    question = s.nextInt();

                    if (question == 1) {
                        position = "Point Guard";
                    } else if (question == 2) {
                        position = "Shooting Guard";
                    } else if (question == 3) {
                        position = "Small Forward";
                    } else if (question == 4) {
                        position = "Power Forward";
                    } else if (question == 5) {
                        position = "Center";
                    }
            }catch (InputMismatchException e) {
                    System.out.println("Invalid, try again");
                    s.nextLine();
                }
            }while (position.equals(""));

            s.nextLine();

            do {
                try {
                    System.out.println("Enter the birthdate of the player (Year only, 1900 to 2018)");
                    birthdate = s.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Invalid, try again");
                s.nextLine();
            }
            } while (birthdate < 1900 || birthdate > 2018);

            s.nextLine();

            do {
                System.out.println("Enter the city where the player was born");
                cityOfBirth = s.next().trim().replaceAll("\\s+", " ");
            } while (cityOfBirth.equals(""));

            s.nextLine();

            do {
                System.out.println("Enter the player´s current team");
                actualTeam = s.next().trim().replaceAll("\\s+", " ");
            } while (actualTeam.equals(""));

            s.nextLine();

            do {
                try {
                    System.out.println("Enter the age of the player");
                    age = s.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Invalid, try again");
                s.nextLine();
            }
            } while (age < 0 || age > 150);

            s.nextLine();

            do {
                try {
                    System.out.println("Enter the height of the player");
                    height = s.nextDouble();
            }catch (InputMismatchException e){
                System.out.println("Invalid, try again");
                s.nextLine();
            }
            } while (height < 0.0 || height > 4.0);

            s.nextLine();

            do {
                try {
                    System.out.println("Enter the salary of the player");
                    salary = s.nextDouble();
            }catch (InputMismatchException e){
                System.out.println("Invalid, try again");
                s.nextLine();
            }
            } while (salary < 0.0);

        method.addPlayer(new Player(name, birthdate, age, cityOfBirth, height, salary, actualTeam, position));
    }

    /**
     * In this method we ask the user the data corresponding to the coach and we control
     * that it does not put incorrect characters.
     *
     * @return
     */
    public void askCoachInfo() {
        Scanner s = new Scanner(System.in);
        String name, cityOfBirth, actualTeam;
        int age = 0, birthdate = 0, rings = 0;
        double height = 0.0, salary = 0.0;


        do {
            System.out.println("Enter the name of the coach");
            name = s.next().trim().replaceAll("\\s+", " ");
        } while (name.equals("")  );

        s.nextLine();

        do {
            try {
                System.out.println("Enter the birthdate of the coach (Year only)");
                birthdate = s.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Invalid, try again");
            s.nextLine();
        }
        } while (birthdate < 0 || birthdate > 2018);

        do {
            System.out.println("Enter the city where the coach was born");
            cityOfBirth = s.next().trim().replaceAll("\\s+", " ");
        } while (cityOfBirth.equals(""));

        s.nextLine();

            do {
                System.out.println("Enter the coach´s current team");
                actualTeam = s.next().trim().replaceAll("\\s+", " ");
            } while (actualTeam.equals(""));


        s.nextLine();

        do {
            try {
                System.out.println("Enter the rings that the coach owns");
                rings = s.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Invalid, try again");
            s.nextLine();
        }
        } while (rings < 0);

        s.nextLine();

        do {
            try {
                System.out.println("Enter the age of the coach");
                age = s.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Invalid, try again");
            s.nextLine();
        }
        } while (age < 0 || age > 2018);

        s.nextLine();

        do {
            try {
                System.out.println("Enter the height of the coach");
                height = s.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Invalid, try again");
            s.nextLine();
        }
        } while (height < 0.0 || height > 4.0);

        s.nextLine();

        do {
            try {
                System.out.println("Enter the salary of the coach");
                salary = s.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Invalid, try again");
            s.nextLine();
        }
        } while (salary < 0.0);

        method.addCoach(new Coach(name, birthdate, age, cityOfBirth, height, salary, actualTeam, rings));
    }

    /**
     * In this method we show the app menu and ask you to enter an option.
     *
     * @return
     */
    public int showMenu() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        try {
            System.out.println("********************************");
            System.out.println("* 1 - Add team                 *");
            System.out.println("* 2 - Add player               *");
            System.out.println("* 3 - Add coach                *");
            System.out.println("* 4 - List of team(By name)    *");
            System.out.println("* 5 - List of players(By name) *");
            System.out.println("* 6 - List of coach(By name)   *");
            System.out.println("* 7 - Remove team              *");
            System.out.println("* 8 - Remove player            *");
            System.out.println("* 9 - Remove coach             *");
            System.out.println("* 0 - Exit                     *");
            System.out.println("********************************");
            System.out.println("Opcion: ");

            option = scanner.nextInt();

        }catch (InputMismatchException e){
        System.out.println("Invalid option");
        start();
    }

        return option;
    }

}


