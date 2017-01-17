/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obliga_opg_2;

/**
 *
 * @author jibba_000
 */
public class Game {

    Die die = new Die();
    Player house = new Player();

    public GameResult game1(Player player) {
        die.setSides(6);
        house.setName("House");
        int playerScore = 0;
        int houseScore = 0;
        for (int i = 0; i < 10; i++) {
            playerScore = playerScore + die.throwDie();
            houseScore = houseScore + die.throwDie();
            player.setPoints(playerScore);
            house.setPoints(houseScore);
        }
        GameResult gameResult = new GameResult();

        if (player.getPoints() > house.getPoints()) {
            gameResult.setWinner(player);
            gameResult.setLoser(house);
        } else {
            gameResult.setWinner(house);
            gameResult.setLoser(player);
        }
        return gameResult;
    }

    public GameResult game2(Player player) {
        die.setSides(12);
        house.setName("House");
        int playerScore = 0;
        int houseScore = 0;
        for (int i = 0; i < 5; i++) {
            playerScore = playerScore + die.throwDie();
            houseScore = houseScore + die.throwDie();
            player.setPoints(playerScore);
            house.setPoints(houseScore);
        }
        die.setSides(24);
        player.setPoints(playerScore);
        house.setPoints(houseScore);
        for (int i = 0; i < 5; i++) {
            playerScore = playerScore + die.throwDie();
            houseScore = houseScore + die.throwDie();
            player.setPoints(playerScore);
            house.setPoints(houseScore);
        }

        if (playerScore % 2 == 0) {
            playerScore *= 2;
            player.setPoints(playerScore);
        }
        if (houseScore % 2 == 0) {
            houseScore *= 2;
            house.setPoints(houseScore);
        }

        GameResult gameResult = new GameResult();

        if (player.getPoints() > house.getPoints()) {
            gameResult.setWinner(player);
            gameResult.setLoser(house);
        } else {
            gameResult.setWinner(house);
            gameResult.setLoser(player);
        }
        return gameResult;
    }

    public GameResult game3(Player player) {
        die.setSides(6);
        house.setName("House");
        int playerScore = 0;
        int houseScore = 0;
        for (int i = 0; i < 1; i++) {
            playerScore = playerScore + die.throwDie();
            houseScore = houseScore + die.throwDie();
            player.setPoints(playerScore);
            house.setPoints(houseScore);
        }

        if (die.throwDie() <= 3) {
            die.setSides(12);
            for (int i = 0; i < 1; i++) {
                playerScore = playerScore + die.throwDie();
                houseScore = houseScore + die.throwDie();
                player.setPoints(playerScore);
                house.setPoints(houseScore);
            }

        } else {
            die.setSides(10);
            for (int i = 0; i < 1; i++) {
                playerScore = playerScore + die.throwDie();
                houseScore = houseScore + die.throwDie();
                player.setPoints(playerScore);
                house.setPoints(houseScore);
            }
        }
        GameResult gameResult = new GameResult();

        if (player.getPoints() < house.getPoints()) {
            gameResult.setWinner(player);
            gameResult.setLoser(house);
        } else {
            gameResult.setWinner(house);
            gameResult.setLoser(player);
        }
        return gameResult;
    }

    public GameResult game4(Player player) {
        die.setSides(7);
        house.setName("House");
        int playerScore = 0;
        int houseScore = 0;
        for (int i = 0; i < 1; i++) {
            playerScore = playerScore + die.throwDie();
            System.out.println(playerScore);

        }
        GameResult gameResult = new GameResult();
        // min Game klasse repræsentere et spil med et Player objekt som er givet i metodernes parametre
        // Game klassen køre spillet og får returneret et spilresultat fra GameResult klassen.
        // Derudover bruger gameklassen en terning som er kaldt fra Die klassen.
        //return gameResult;
        return gameResult;
    }
}
