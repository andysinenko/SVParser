package test.cdb;

import test.MiddleLevelTag;

import java.util.HashMap;

/**
 * Created by a.sinenko on 12.09.2017.
 */
public class FF8009 extends MiddleLevelTag {
    private static final String tag = "FF8009";
    private final HashMap<String, String> tags = new HashMap<String, String>();

    public FF8009() {
        super(tag);
        tags.put("DF805D", null); // Sequence
        tags.put("DF805B", null); // SRVT ID
        tags.put("DF8139", null); // SRVT Type
        tags.put("DF822C", null); // Service Additional
        tags.put("DF806E", null); // Record Processing
        tags.put("DF8227", null); // BO Utrnno
        tags.put("DF8409", null); // Service Desc
        tags.put("DF840C", null); // Service Currency
        tags.put("DF8347", null); // Service Number
        tags.put("DF8117", null); // Merchant ID
        tags.put("DF8424", null); // Payment Parameters
        tags.put("FF804B", null); // Parameter Block
        tags.put("DF8332", null); // Payment Purpose
    }

}
