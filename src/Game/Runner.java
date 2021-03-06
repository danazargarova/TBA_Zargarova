package Game;

import Items.Flashlight;
import Items.GhostVacuum;
import Person.Player;
import Rooms.*;

import java.util.Scanner;

public class Runner {


    private static boolean gameOn = true;

    public static void main(String[] args)
    {
        System.out.println("Welcome to Ghost Adventure. You are a paranormal investigator who has heard\nabout an extremely haunted motel near a small town in Michigan. Previous\ninvestigators have attempted to hunt down the malevolent spirit that plagues\nthe motel but all of them have failed. However, you are confident in your \nability to kill that Ghost. You will go from room to room within the motel. \nIf you come across a weapon or object left by previous investigators, you \nmay use it to your benefit. If you wish to see your inventory, type 'I.' \nIf you wish to see this message again, type 'info.' Good luck, brave ghost hunter.");
        Room[][] building = new Room[5][5];

        //Fill the building with normal rooms
        for (int x = 0; x<building.length; x++)
        {
            for (int y = 0; y < building[x].length; y++)
            {
                building[x][y] = new Room(x,y);
            }
        }



        //Create a random ghost room.

        int x = (int)(Math.random()*building.length-1)+1;
        int y = (int)(Math.random()*building.length-1)+1;
        building[x][y] = new GhostRoom(x, y);

        //Create a random flashlight room
        int f= (int)(Math.random()*building.length-1)+1;
        int g= (int)(Math.random()*building.length-1)+1;
        building[f][g]= new FlashlightRoom(f,g);

        //Create a random Vacuum room
        int j= (int)(Math.random()*building.length-1)+1;
        int k=(int)(Math.random()*building.length-1)+1;
        building[j][k]=new VacuumRoom(j,k);


        //Setup player 1 and the input scanner
        Player player1 = new Player( 0,0);
        building[4][0].enterRoom(player1);
        Scanner in = new Scanner(System.in);
        Board map = new Board(building);

        map.printMap();

        while(gameOn)
        {
            System.out.println("Where would you like to move? (Choose N, S, E, W)");
            String move = in.nextLine();
            if(validMove(move, player1, building))
            {
                System.out.println("Continue onwards, brave Ghosthunter");
                map.printMap();

            }
            else {
                System.out.println("Please choose a valid move.");
            }


        }
        in.close();
    }

    /**
     * Checks that the movement chosen is within the valid game map.
     * @param move the move chosen
     * @param p person moving
     * @param map the 2D array of rooms
     * @return
     */
    public static boolean validMove(String move, Player p, Room[][] map)
    {
        move = move.toLowerCase().trim();
        switch (move) {
            case "n":
                if (p.getxLoc() > 0)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()-1][p.getyLoc()].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }
            case "e":
                if (p.getyLoc()< map[p.getyLoc()].length -1)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "s":
                if (p.getxLoc() < map.length - 1)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()+1][p.getyLoc()].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "w":
                if (p.getyLoc() > 0)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()][p.getyLoc()-1].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }
            case "info":
                System.out.println("Welcome to Ghost Adventure. You are a paranormal investigator who has heard\nabout an extremely haunted motel near a small town in Michigan. Previous\ninvestigators have attempted to hunt down the malevolent spirit that plagues\nthe motel but all of them have failed. However, you are confident in your \nability to kill that Ghost. You will go from room to room within the motel. \nIf you come across a weapon or object left by previous investigators, you \nmay use it to your benefit. If you wish to see your inventory, type 'I.' \nIf you wish to see this message again, type 'info.' Good luck, brave ghost hunter.");
            case "i":
                for (int i = 0; i < p.inventory.length; i++) {
                if (p.inventory[i] instanceof Flashlight && p.inventory[i] instanceof GhostVacuum){
                    System.out.println("You have a FLASHLIGHT and a GHOST VACUUM.");}
                else if(p.inventory[i] instanceof Flashlight){
                    System.out.println("You have a FLASHLIGHT.");}
                else if(p.inventory[i] instanceof GhostVacuum){
                        System.out.println("You have a GHOST VACUUM.");}
                else{
                    System.out.println("Your inventory is empty. Go to rooms marked 'F' or 'V' to collect items.");}
                }
            default:
                break;

        }
        return true;
    }
    public static void gameOff()
    {
        gameOn = false;
    }



}