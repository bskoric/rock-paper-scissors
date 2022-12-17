package com.branko.game.service.element;

import com.branko.game.domain.Move;
import com.branko.game.service.visitor.PaperVisitor;
import com.branko.game.service.visitor.RockVisitor;
import com.branko.game.service.visitor.ScissorsVisitor;

public class ElementFactory {

    private ElementFactory() {
    }

    public static AbstractElement create(Move move) {
        if (move.equals(Move.PAPER)) {
            return new PaperElement(new PaperVisitor());
        }

        if (move.equals(Move.ROCK)) {
            return new RockElement(new RockVisitor());
        }

        if (move.equals(Move.SCISSORS)) {
            return new ScissorsElement(new ScissorsVisitor());
        }

        return null;
    }
}
