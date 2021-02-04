package Fundamentals.HashMap;

import java.util.HashMap;

/*
Sample ng HashMap na gumamit ako ng Object para sa Value.
Si object gameStat nasa loob nya yung values ng score at gamePlayed
 */
public class ObjectValueGameStats {

    public static void main(String[] args) {

        HashMap<String, gameStat> points = new HashMap<>();

        gameStat Amy = new gameStat(1,2);
        points.put("Amelia",Amy);
        System.out.println(points.get("Amelia").gamePlayed);
        /*Output:
        2
         */

        //shortcut
        points.put("Rowell",new gameStat(3,4) );
        System.out.println(points.get("Rowell").gamePlayed);
        /*Output:
        4
         */

    }


    private static class gameStat {
        private int score;
        private int gamePlayed;

        public gameStat(int score, int gamePlayed) {
            this.score = score;
            this.gamePlayed = gamePlayed;
        }
    }
}
