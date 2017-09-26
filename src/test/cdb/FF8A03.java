package test.cdb;

import test.MiddleLevelTag;

import java.util.HashMap;

/**
 * Created by a.sinenko on 12.09.2017.
 */
public class FF8A03 extends MiddleLevelTag {
    private static final String tag = "FF8A03";

    public FF8A03() {
        super(tag);
        tags.put("DF805D", null); // Sequence
        tags.put("DF8064", null); // Limit Type
        tags.put("DF8065", null); // Limit Value
        tags.put("DF8066", null); // Limit Length
        tags.put("DF8067", null); // Limit Length Type
        tags.put("DF8068", null); // Limit End Date
        tags.put("DF806E", null); // Record Processing
        tags.put("DF808E", null); // Limit Currency
    }
}
