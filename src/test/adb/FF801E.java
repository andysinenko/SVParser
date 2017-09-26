package test.adb;

import test.MiddleLevelTag;

/**
 * Created by a.sinenko on 13.09.2017.
 */
public class FF801E extends MiddleLevelTag {
    private static final String tag = "FF801E";

    public FF801E() {
        super(tag);
        tags.put("DF805D", null); // Sequence
        tags.put("DF802C", null); // Card number
        tags.put("DF8074", null); // Card Sequence Number
        tags.put("DF8223", null); // Payment Amount
        tags.put("DF8224", null); // BO Transaction Type
        tags.put("DF8225", null); // Transaction Date
        tags.put("DF8226", null); // Transaction Description
        tags.put("DF8227", null); // BO Utrnno
        tags.put("DF8343", null); // Transaction Time
        tags.put("DF8342", null); // Operation type (OPTP dictionary)
        tags.put("DF8270", null); // Transaction External Reference
        tags.put("DF8514", null); // Issuer Available Balance after Transaction
        tags.put("DF8A10", null); // Extended Transaction description
    }
}
