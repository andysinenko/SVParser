package test.adb;

import test.MiddleLevelTag;

/**
 * Created by a.sinenko on 13.09.2017.
 */
public class FF8081 extends MiddleLevelTag {
    private static final String tag = "FF8081";

    public FF8081() {
        super(tag);
        tags.put("DF805D", null); // Sequence
        tags.put("DF8003", null); // Customer
        tags.put("DF8005", null); // Corporate
        tags.put("DF8006", null); // VIP Code
        tags.put("DF8079", null); // Institution
        tags.put("DF807A", null); // Agent
        tags.put("DF807B", null); // Customer
        tags.put("DF8012", null); // Language
        tags.put("DF8019", null); // First Name
        tags.put("DF801A", null); // Second
        tags.put("DF801B", null); // Surname
        tags.put("DF8418", null); // INN
        tags.put("DF8419", null); // KPP
        tags.put("DF837B", null); // OKATO
        tags.put("DF8004", null); // Customer description
        tags.put("DF800A", null); // Residence data
    }
}
