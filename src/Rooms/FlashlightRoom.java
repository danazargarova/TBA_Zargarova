package Rooms;
import Items.Flashlight;
import Person.Player;

public class FlashlightRoom extends Room {
    public FlashlightRoom(int f, int g){
        super(f,g);
    }
    public void enterRoom(Player x)
    {
        System.out.println("You stumbled into a flashlight. You picked it up. This will increase your chance of killing the Ghost.");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        x.addItem(new Flashlight());
    }
    public String toString(){
        return "[F]";
    }


}
