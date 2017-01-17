/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obliga_opg_2;

import java.util.Scanner;

/**
 *
 * @author jibba_000
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player player = new Player();
        Game game = new Game();
        Scanner scan = new Scanner(System.in);
        boolean done = false;
        int choice = 0;
        String input;

        while (!done) {
            System.out.println("1: Enter player name: ");
            System.out.println("2: Game rules: ");
            System.out.println("3: Select game: ");
            System.out.println("4: Quit game: ");

            try {
                input = scan.nextLine();
                choice = Integer.parseInt(input);
            } catch (NumberFormatException ex) {
                System.out.println("invalid input, please try again");
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println("Enter name:" + "\n");
                    input = scan.nextLine();
                    player.setName(input);
                    System.out.println("\n");
                    break;

                case 2:
                    System.out.println("Press 1 for rules:" + "\n");
                    try {
                        input = scan.nextLine();
                        choice = Integer.parseInt(input);
                    } catch (NumberFormatException ex) {
                        System.out.println("invalid input, please try again");
                        continue;
                    }
                    if (choice == 1) {
                        {
                            System.out.println("\n");
                            System.out.println("\n" + "Rules game 1:");
                            System.out.println("\n" + "Der kastes 10 6-siddet terninger for begge spillere");
                            System.out.println("Flest antal point vinder");

                            System.out.println("\n" + "Rules game 2:");
                            System.out.println("\n" + "Der kastes 5 12-siddet terninger og 5 24-siddet terninger for begge spillere");
                            System.out.println("Ved lige antal point fordobles pointene");
                            System.out.println("Flest antal point vinder");

                            System.out.println("\n" + "Rules game 3:");
                            System.out.println("\n" + "Der kastes 1 6-siddet terning for begge spillere");
                            System.out.println("Fås 1-3 øjne kastes der 1 12-siddet terning ellers kastes 1 10-siddet terning");
                            System.out.println("Færrest antal point vinder");
                            System.out.println("\n");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Select game 1-4:" + "\n");
                    try {
                        input = scan.nextLine();
                        choice = Integer.parseInt(input);
                    } catch (NumberFormatException ex) {
                        System.out.println("invalid input, please try again");
                        continue;
                    }
                    if (choice == 1) {
                        System.out.println(game.game1(player));

                    }
                    if (choice == 2) {
                        System.out.println(game.game2(player));
                    }
                    if (choice == 3) {
                        System.out.println(game.game3(player));
                    }
                    
                    if (choice == 4) {
//game.game4(player);
System.out.println(game.game4(player));
                    }
                    if (choice > 4 || choice < 1) {
                        System.out.println("Invalid choice, game number must be between 1 and 3");
                    }

                    System.out.println("\n" + "vil du spille igen (1 = ja, 2 = nej");
                    try {
                        input = scan.nextLine();
                        choice = Integer.parseInt(input);
                    } catch (NumberFormatException ex) {
                        System.out.println("invalid input, please try again");
                        continue;
                    }
                    if (choice == 2) {
                        System.out.println("Spil afsluttet");
                        done = true;
                    }
                    break;

                case 4:
                    System.out.println("Spil afsluttet");
                    done = true;
                    break;
            }
        }
    }
}
