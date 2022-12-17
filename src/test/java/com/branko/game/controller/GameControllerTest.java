package com.branko.game.controller;

import com.branko.game.domain.Game;
import com.branko.game.domain.Move;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameControllerTest {

    private static final int NUMBER_OF_ROUNDS = 5;
    private final GameController gameController = new GameController();

    @Test
    void testPlayGame() {
        Game game = gameController.playGame(NUMBER_OF_ROUNDS);
        assertEquals(Move.PAPER.toString(), game.getPlayerA().getMove().getName());
        assertEquals(NUMBER_OF_ROUNDS, game.getStatistics().getNumberOfRounds());
    }
}