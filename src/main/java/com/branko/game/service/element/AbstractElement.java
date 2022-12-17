package com.branko.game.service.element;

import com.branko.game.service.visitor.GameVisitor;

public abstract class AbstractElement implements Element {

    private final GameVisitor visitor;

    protected AbstractElement(GameVisitor visitor) {
        this.visitor = visitor;
    }

    public GameVisitor getVisitor() {
        return visitor;
    }
}
