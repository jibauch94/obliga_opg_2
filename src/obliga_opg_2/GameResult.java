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
public class GameResult {
    private Player winner;
    private Player loser;
    
    public GameResult(){
    }
    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Player getLoser() {
        return loser;
    }

    public void setLoser(Player loser) {
        this.loser = loser;
    }
    
    
    @Override
    public String toString(){
        return this.winner.getName() + " got: " + this.winner.getPoints() + " points\n"
                + this.loser.getName() + " got: " + this.loser.getPoints() + " points\n" + "\n" 
                + "winner: " + this.winner.getName() + " " + this.winner.getPoints() + "\n" + "\n"
                + "loser: " + this.loser.getName() + " " + this.loser.getPoints();
}
    // jeg har valgt at lave min GameResult klasse med en Player winner og Player loser.
    // ved at kalde med datatypen player har min result klasse et playerobjekt den kan bruge
    // herefter har jeg lavet en toString metode som returnere et spilresultat.
    // toString metoden printer player points og house points og fortæller herefter hvem vinderen og taberen er.
}
