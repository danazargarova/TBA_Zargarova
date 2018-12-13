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
        System.out.println("You stumbled into a Ghost Vacuum. You picked it up. This will increase your chance of killing the Ghost.");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        x.addItem(new GhostVacuum());
    }
    public String toString(){
        return "[V]";
    }
}
