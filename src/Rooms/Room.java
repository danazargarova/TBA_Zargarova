package Rooms;

import Person.Player;
import Items.Item;

public class Room{
    private Item item;

    Player occupant;
    int xLoc,yLoc;

    public Room(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }

    /**
     * Method controls the results when a person enters this room.
     * @param x the Person entering
     */
    public void enterRoom(Player x)
    {
        System.out.println("You've entered the Ghost's room. Do you wish to FIGHT or RUN?");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
     //   x.addItem(this.item);
    }

    /**
     * Removes the player from the room.
     * @param x
     */
    public void leaveRoom(Player x)
    {
        occupant = null;
    }

    public void placeItem(Item item){
        this.item=item;
    }

}

