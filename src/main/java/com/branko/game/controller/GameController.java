package com.branko.game.controller;

import com.branko.game.domain.Game;
import com.branko.game.domain.GameResult;
import com.branko.game.domain.Move;
import com.branko.game.domain.Player;
import com.branko.game.domain.Statistics;
import com.branko.game.service.element.AbstractElement;
import com.branko.game.service.element.ElementFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GameController {

    private final Random random = new Random();

    public Game playGame(int numberOfRounds) {
        AbstractElement paper = ElementFactory.create(Move.PAPER);
        AbstractElement scissors = ElementFactory.create(Move.SCISSORS);
        AbstractElement rock = ElementFactory.create(Move.ROCK);
        List<AbstractElement> elements = Arrays.asList(paper, rock, scissors);

        Player playerA = new Player("Player A");
        playerA.setMove(paper);
        Player playerB = new Player("Player B");
        Game game = new Game(playerA, playerB);

        int playerAwins = 0;
        int playerBwins = 0;
        int draws = 0;

        for (int i = 1; i <= numberOfRounds; i++) {
            playerB.setMove(getRandomElement(elements));
            GameResult roundResult = playerA.getMove().playAgainst(playerB.getMove());

            if (roundResult.equals(GameResult.WIN)) {
                playerAwins++;
            } else if (roundResult.equals(GameResult.LOSE)) {
                playerBwins++;
            } else {
                draws++;
            }
        }
        Statistics statistics = new Statistics(playerAwins, playerBwins, draws, numberOfRounds);
        game.setStatistics(statistics);
        return game;
    }

    private AbstractElement getRandomElement(List<AbstractElement> elements) {
        return elements.get(random.nextInt(elements.size()));
    }

}
