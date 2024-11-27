import java.util.Scanner;

import Game.GamePlay;

public class Main {
    public static void main(String[] args) {
        GamePlay game = new GamePlay();
        game.initialize();

        System.out.println("Game Start:");
        game.startGame();

    }
}