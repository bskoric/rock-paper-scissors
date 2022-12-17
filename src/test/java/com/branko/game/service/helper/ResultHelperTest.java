package com.branko.game.service.helper;

import com.branko.game.domain.GameResult;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ResultHelperTest {

    @Test
    void testInvertVisitorLoseResult() {
        GameResult result = ResultHelper.invertVisitorResult(GameResult.LOSE);
        assertEquals(GameResult.WIN, result);
    }

    @Test
    void testInvertVisitorWinResult() {
        GameResult result = ResultHelper.invertVisitorResult(GameResult.WIN);
        assertEquals(GameResult.LOSE, result);
    }

    @Test
    void testInvertVisitorDrawResult() {
        GameResult result = ResultHelper.invertVisitorResult(GameResult.DRAW);
        assertEquals(GameResult.DRAW, result);
    }
}