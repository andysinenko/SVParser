package test.cdb;

import test.MiddleLevelTag;

import java.util.HashMap;

/**
 * Created by a.sinenko on 12.09.2017.
 */
public class FF43 extends MiddleLevelTag {
    private static final String tag = "FF43";

    public FF43() {
        super(tag);
        tags.put("DF805D", null); // Sequence
        tags.put("DF8033", null); //  Account Number
        tags.put("DF8035", null); //  Account Type
        tags.put("DF806E", null); //  Record Processing Code
        tags.put("DF8107", null); //  Account Sequence Number
        tags.put("DF8105", null); //  Account Name – ACCT_OPEN
    }

}
