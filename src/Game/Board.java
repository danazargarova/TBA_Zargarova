package Game;

import Rooms.Room;

public class Board {
    private Room[][] map;

    public Board(Room [][] map){
        this.map=map;
    }
    public void printMap()

    {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.println(map[i][j]);
            }
        }
    }
}
