package Rooms;
import Items.Flashlight;
import Person.Player;

public class FlashlightRoom extends Room {
    public FlashlightRoom(int f, int g){
        super(f,g);
    }
    public void enterRoom(Player x)
    {
        System.out.println("You've entered the Ghost's room. Do you wish to FIGHT or RUN?");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        x.addItem(new Flashlight());
    }
}
