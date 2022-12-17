/*********************************************************************
 * The Initial Developer of the content of this file is NETCONOMY.
 * All portions of the code written by NETCONOMY are property of
 * NETCONOMY. All Rights Reserved.
 *
 * NETCONOMY Software & Consulting GmbH
 * Hilmgasse 4, A-8010 Graz (Austria)
 * FN 204360 f, Landesgericht fuer ZRS Graz
 * Tel: +43 (316) 815 544
 * Fax: +43 (316) 815544-99
 * www.netconomy.net
 *
 * (c) 2022 by NETCONOMY Software & Consulting GmbH
 *********************************************************************/

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
