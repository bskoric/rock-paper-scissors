package com.branko.game.service.element;

import com.branko.game.domain.GameResult;
import com.branko.game.domain.Move;
import com.branko.game.service.visitor.RockVisitor;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RockElementTest {

    private final RockElement rockElement = new RockElement(new RockVisitor());

    @Test
    void testPlayAgainstPaper() {
        GameResult result = rockElement.playAgainst(Objects.requireNonNull(ElementFactory.create(Move.PAPER)));
        assertEquals(GameResult.LOSE, result);
    }

    @Test
    void testPlayAgainstRock() {
        GameResult result = rockElement.playAgainst(Objects.requireNonNull(ElementFactory.create(Move.ROCK)));
        assertEquals(GameResult.DRAW, result);
    }

    @Test
    void testPlayAgainstScissors() {
        GameResult result = rockElement.playAgainst(Objects.requireNonNull(ElementFactory.create(Move.SCISSORS)));
        assertEquals(GameResult.WIN, result);
    }
}