package com.branko.game.service.visitor;

import com.branko.game.domain.GameResult;
import com.branko.game.service.element.PaperElement;
import com.branko.game.service.element.RockElement;
import com.branko.game.service.element.ScissorsElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RockVisitorTest {

    private final RockVisitor rockVisitor = new RockVisitor();

    @Test
    void testPlayRock() {
        GameResult result = rockVisitor.play(new RockElement(new RockVisitor()));
        assertEquals(GameResult.DRAW, result);
    }

    @Test
    void testPlayPaper() {
        GameResult result = rockVisitor.play(new PaperElement(new PaperVisitor()));
        assertEquals(GameResult.LOSE, result);
    }

    @Test
    void testPlayScissors() {
        GameResult result = rockVisitor.play(new ScissorsElement(new ScissorsVisitor()));
        assertEquals(GameResult.WIN, result);
    }

}