package com.branko.game.service.visitor;

import com.branko.game.domain.GameResult;
import com.branko.game.service.element.PaperElement;
import com.branko.game.service.element.RockElement;
import com.branko.game.service.element.ScissorsElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ScissorsVisitorTest {

    private final ScissorsVisitor scissorsVisitor = new ScissorsVisitor();

    @Test
    void testPlayRock() {
        GameResult result = scissorsVisitor.play(new RockElement(new RockVisitor()));
        assertEquals(GameResult.LOSE, result);
    }

    @Test
    void testPlayPaper() {
        GameResult result = scissorsVisitor.play(new PaperElement(new PaperVisitor()));
        assertEquals(GameResult.WIN, result);
    }

    @Test
    void testPlayScissors() {
        GameResult result = scissorsVisitor.play(new ScissorsElement(new ScissorsVisitor()));
        assertEquals(GameResult.DRAW, result);
    }
}