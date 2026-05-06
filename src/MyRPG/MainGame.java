package MyRPG;

import java.util.Scanner;

public class MainGame {

    private static boolean inGame = true;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String PlayerName = sc.nextLine();
        sc.close();

        Player player = new Player(PlayerName);
        player.printStats();

        while(inGame){

            inGame = false;
        }
    }
}
