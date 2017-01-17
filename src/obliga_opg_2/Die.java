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
public class Die {

    private int sides;
    private int points;

    public Die() {
    }

    public int throwDie() {
        points = (int) (Math.random() * sides + 1);
        return points;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}
