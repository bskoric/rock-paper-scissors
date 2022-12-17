package com.branko.game.service.element;

import com.branko.game.domain.GameResult;

public interface Element {
    GameResult playAgainst(AbstractElement el);
    String getName();
}
