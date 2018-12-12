package Rooms;

import Items.Flashlight;
import Items.GhostVacuum;
import Person.Player;

public class VacuumRoom extends Room{
    public VacuumRoom(int j, int k){
        super(j,k);
    }
    public void enterRoom(Player x)
    {
        System.out.println("You've entered the Ghost's room. Do you wish to FIGHT or RUN?");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        x.addItem(new GhostVacuum());
    }
}
