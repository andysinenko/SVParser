package test.cdb;

import test.MiddleLevelTag;

import java.util.HashMap;

/**
 * Created by a.sinenko on 12.09.2017.
 */
public class FF44 extends MiddleLevelTag {
    private static final String tag = "FF44";

    public FF44() {
        super(tag);
        tags.put("DF805D", null); // Sequence
        tags.put("DF806F", null); // Misc Account Number
        tags.put("DF8034", null); // Currency Code
        tags.put("DF8072", null); // Misc Account Type
        tags.put("DF8070", null); // Misc Account Description
        tags.put("DF8071", null); // Misc Account Source Account
        tags.put("DF806E", null); // Record Processing Code
    }
}
