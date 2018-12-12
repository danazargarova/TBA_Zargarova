package Person;

import Items.Item;

public class Player {

    public Item[] items= new Item[2];

    String firstName;
    String familyName;
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

    public Player (String firstName, String familyName, int xLoc, int yLoc)
    {
        this.firstName = firstName;
        this.familyName = familyName;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }

    public void addItem(Item item){
        for(int i=0; i<2; i++){
            if (items[i]==null){
                items[i]=item;
            }
        }
    }

}
