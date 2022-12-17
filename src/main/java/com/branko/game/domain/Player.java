package com.branko.game.domain;

import com.branko.game.service.element.AbstractElement;

public class Player {

    private AbstractElement move;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public AbstractElement getMove() {
        return move;
    }

    public void setMove(AbstractElement move) {
        this.move = move;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
