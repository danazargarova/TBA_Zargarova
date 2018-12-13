package Rooms;

import Game.Runner;
import Items.Flashlight;
import Items.GhostVacuum;
import Person.Player;

public class GhostRoom extends Room {
    public GhostRoom(int x, int y) {
        super(x, y);

    }

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Player x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        int howManyItems = 0;
        for (int i = 0; i < 2; i++) {
            if (x.inventory[i] instanceof Flashlight || x.inventory[i] instanceof GhostVacuum) {
                howManyItems++;
            }
        }
        if (howManyItems == 0) {
            System.out.println("You died :(");
            Runner.gameOff();
        }
        if (howManyItems == 1) {
            if (Math.random() < .5) {
                System.out.println("You died :(");
                Runner.gameOff();
            }
        }

        if (howManyItems == 2) {
            System.out.print("You killed the ghost! Congratulations!");}
        }

        public String toString () {
            return "[G]";
        }


}

