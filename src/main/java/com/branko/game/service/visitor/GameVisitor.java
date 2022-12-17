package com.branko.game.service.visitor;

import com.branko.game.domain.GameResult;
import com.branko.game.service.element.PaperElement;
import com.branko.game.service.element.RockElement;
import com.branko.game.service.element.ScissorsElement;

public interface GameVisitor {
    GameResult play(RockElement rock);
    GameResult play(PaperElement paper);
    GameResult play(ScissorsElement scissors);
}
