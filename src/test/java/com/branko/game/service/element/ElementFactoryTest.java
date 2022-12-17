package com.branko.game.service.element;

import com.branko.game.domain.Move;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ElementFactoryTest {

    @Test
    void testCreatePaper() {
        AbstractElement result = ElementFactory.create(Move.PAPER);
        assertTrue(result instanceof PaperElement);
    }

    @Test
    void testCreateRock() {
        AbstractElement result = ElementFactory.create(Move.ROCK);
        assertTrue(result instanceof RockElement);
    }

    @Test
    void testCreateScissors() {
        AbstractElement result = ElementFactory.create(Move.SCISSORS);
        assertTrue(result instanceof ScissorsElement);
    }
}