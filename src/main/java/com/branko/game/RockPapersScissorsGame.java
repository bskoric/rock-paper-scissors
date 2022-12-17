package com.branko.game;

import com.branko.game.controller.GameController;
import com.branko.game.domain.Game;
import com.branko.game.domain.Statistics;

public class RockPapersScissorsGame {

    public static void main(String[] args) {
        System.out.println("Welcome to the game");

        GameController gameController = new GameController();
        Game gameResult = gameController.playGame(5);
        Statistics statistics = gameResult.getStatistics();

        System.out.printf("%s wins %s of %s games %n",
                          gameResult.getPlayerA().getName(),
                          statistics.getPlayerAwins(),
                          statistics.getNumberOfRounds());
        System.out.printf("%s wins %s of %s games %n",
                          gameResult.getPlayerB().getName(),
                          statistics.getPlayerBwins(),
                          statistics.getNumberOfRounds());
        System.out.printf("Tie: %s of %s games %n", statistics.getDraws(), statistics.getNumberOfRounds());
    }
}
