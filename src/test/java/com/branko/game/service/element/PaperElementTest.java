package com.branko.game.service.element;

import com.branko.game.domain.GameResult;
import com.branko.game.domain.Move;
import com.branko.game.service.visitor.PaperVisitor;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PaperElementTest {

    private final PaperElement paperElement = new PaperElement(new PaperVisitor());

    @Test
    void testPlayAgainstPaper() {
        GameResult result = paperElement.playAgainst(Objects.requireNonNull(ElementFactory.create(Move.PAPER)));
        assertEquals(GameResult.DRAW, result);
    }

    @Test
    void testPlayAgainstRock() {
        GameResult result = paperElement.playAgainst(Objects.requireNonNull(ElementFactory.create(Move.ROCK)));
        assertEquals(GameResult.WIN, result);
    }

    @Test
    void testPlayAgainstScissors() {
        GameResult result = paperElement.playAgainst(Objects.requireNonNull(ElementFactory.create(Move.SCISSORS)));
        assertEquals(GameResult.LOSE, result);
    }
}