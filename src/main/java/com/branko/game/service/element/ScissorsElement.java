package com.branko.game.service.element;

import com.branko.game.domain.GameResult;
import com.branko.game.domain.Move;
import com.branko.game.service.helper.ResultHelper;
import com.branko.game.service.visitor.GameVisitor;

public class ScissorsElement extends AbstractElement {

    public ScissorsElement(GameVisitor visitor) {
        super(visitor);
    }

    @Override
    public GameResult playAgainst(AbstractElement el) {
        return ResultHelper.invertVisitorResult(el.getVisitor().play(this));
    }

    @Override
    public String getName() {
        return Move.SCISSORS.toString();
    }
}
