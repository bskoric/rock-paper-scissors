package com.branko.game.service.visitor;

import com.branko.game.domain.GameResult;
import com.branko.game.service.element.PaperElement;
import com.branko.game.service.element.RockElement;
import com.branko.game.service.element.ScissorsElement;

public class PaperVisitor implements GameVisitor {

    @Override
    public GameResult play(RockElement rockElement) {
        return GameResult.WIN;
    }

    @Override
    public GameResult play(PaperElement paper) {
        return GameResult.DRAW;
    }

    @Override
    public GameResult play(ScissorsElement scissors) {
        return GameResult.LOSE;
    }
}
