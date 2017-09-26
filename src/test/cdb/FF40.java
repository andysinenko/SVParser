package test.cdb;

import test.MiddleLevelTag;

import java.util.HashMap;

/**
 * Created by a.sinenko on 12.09.2017.
 */
public class FF40 extends MiddleLevelTag {
    private static final String tag = "FF40";

    public FF40() {
        super(tag);
        tags.put("DF805D", null); //Sequence
        tags.put("DF8003", null); //Customer ID
        tags.put("DF8007", null); //Cardholder ID
        tags.put("DF8005", null); //Corporate code
        tags.put("DF8006", null); //VIP Code
        tags.put("DF8079", null); //Institution Number
        tags.put("DF807A", null); //Agent Code
        tags.put("DF807B", null); //Customer Code
        tags.put("DF8013", null); //Security ID 1
        tags.put("DF8012", null); //Language Code
        tags.put("DF8019", null); //First Name
        tags.put("DF801A", null); //Second Name
        tags.put("DF801B", null); //Surname
        tags.put("DF8418", null); //INN
        tags.put("DF8419", null); //KPP
        tags.put("DF837B", null); //OKATO
        tags.put("DF8004", null); //Customer description
    }

}
