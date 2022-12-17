package com.branko.game.service.helper;

import com.branko.game.domain.GameResult;

public class ResultHelper {

    private ResultHelper() {
    }

    public static GameResult invertVisitorResult(GameResult visitorResult) {
        if (visitorResult.equals(GameResult.LOSE)) {
            return GameResult.WIN;
        }
        if (visitorResult.equals(GameResult.WIN)) {
            return GameResult.LOSE;
        }
        return visitorResult;
    }
}
