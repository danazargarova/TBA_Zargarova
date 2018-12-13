package Person;

import Items.Item;

public class Player {

    public Item[] inventory= new Item[2];

    int xLoc, yLoc;


    public int getxLoc() {
        return xLoc;
    }

    public void setxLoc(int xLoc) {
        this.xLoc = xLoc;
    }

    public int getyLoc() {
        return yLoc;
    }

    public void setyLoc(int yLoc) {
        this.yLoc = yLoc;
    }

    public Player (int xLoc, int yLoc)
    {

        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }

    public void addItem(Item item){
        for(int i=0; i<2; i++){
            if (inventory[i]==null){
                inventory[i]=item;
            }
        }
    }

}
