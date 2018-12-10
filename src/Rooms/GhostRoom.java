package Rooms;

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
        System.out.println("You found the winning room! Ten points for Gryffindor.");
        Runner.gameOff();
    }


}

}
