package com.branko.game.service.element;

import com.branko.game.domain.GameResult;
import com.branko.game.domain.Move;
import com.branko.game.service.visitor.ScissorsVisitor;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ScissorsElementTest {

    private final ScissorsElement scissorsElement = new ScissorsElement(new ScissorsVisitor());

    @Test
    void testPlayAgainstPaper() {
        GameResult result = scissorsElement.playAgainst(Objects.requireNonNull(ElementFactory.create(Move.PAPER)));
        assertEquals(GameResult.WIN, result);
    }

    @Test
    void testPlayAgainstRock() {
        GameResult result = scissorsElement.playAgainst(Objects.requireNonNull(ElementFactory.create(Move.ROCK)));
        assertEquals(GameResult.LOSE, result);
    }

    @Test
    void testPlayAgainstScissors() {
        GameResult result = scissorsElement.playAgainst(Objects.requireNonNull(ElementFactory.create(Move.SCISSORS)));
        assertEquals(GameResult.DRAW, result);
    }
}