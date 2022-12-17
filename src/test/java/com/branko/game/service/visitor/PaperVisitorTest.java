package com.branko.game.service.visitor;

import com.branko.game.domain.GameResult;
import com.branko.game.service.element.PaperElement;
import com.branko.game.service.element.RockElement;
import com.branko.game.service.element.ScissorsElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PaperVisitorTest {

    private final PaperVisitor paperVisitor = new PaperVisitor();

    @Test
    void testPlayRock() {
        GameResult result = paperVisitor.play(new RockElement(new RockVisitor()));
        assertEquals(GameResult.WIN, result);
    }

    @Test
    void testPlayPaper() {
        GameResult result = paperVisitor.play(new PaperElement(new PaperVisitor()));
        assertEquals(GameResult.DRAW, result);
    }

    @Test
    void testPlayScissors() {
        GameResult result = paperVisitor.play(new ScissorsElement(new ScissorsVisitor()));
        assertEquals(GameResult.LOSE, result);
    }
}