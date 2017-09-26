package test.adb;

import test.MiddleLevelTag;
import test.cdb.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by a.sinenko on 12.09.2017.
 * Front End Account Data Block
 */
public class FF3B {
    private final String tag = "FF3B";
    private List<MiddleLevelTag> accountDataBlockList = new ArrayList<MiddleLevelTag>();

    public FF3B() {
    }

    public void addTag(MiddleLevelTag tag) {
        int nextSequensNumber = 0;
        if(accountDataBlockList.size() > 0)
            nextSequensNumber = accountDataBlockList.size();
        tag.setSequenceNumber(nextSequensNumber);
        accountDataBlockList.add(tag);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if(accountDataBlockList != null && accountDataBlockList.size() > 0) {
            for(MiddleLevelTag t: accountDataBlockList) {
                result.append(t.toString());
            }
        }
        String resultString = result.toString();
        result.setLength(0);
        String lengthStr = null;
        if(resultString.length() >= 0x7B) {
            lengthStr = String.format("%03X", resultString.length());
            result.append(tag).append("8").append(lengthStr);
        } else {
            lengthStr = String.format("%02X", resultString.length());
            result.append(tag).append(lengthStr);
        }
        result.append(resultString);
        return result.length()>0?result.toString():null;
    }

}
