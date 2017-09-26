package test.cdb;

import test.MiddleLevelTag;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by a.sinenko on 12.09.2017.
 * Front End Card Data Block
 */
public class FF3A {
    private final String tag = "FF3A";
    private List<MiddleLevelTag> accountDataBlockList = new ArrayList<MiddleLevelTag>();

    public void addTag(MiddleLevelTag tag) {
        int nextSequensNumber = 0;
        if(accountDataBlockList.size() > 0)
            nextSequensNumber = accountDataBlockList.size()-1;
        tag.setSequenceNumber(nextSequensNumber);
        accountDataBlockList.add(tag);
    }

    public FF3A() {
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

    /*private List<FF3F> ff3fList = new ArrayList<FF3F>();
    private List<FF40> ff40List = new ArrayList<FF40>();
    private List<FF41> ff41List = new ArrayList<FF41>();
    private List<FF42> ff42List = new ArrayList<FF42>();
    private List<FF43> ff43List = new ArrayList<FF43>();
    private List<FF44> ff44List = new ArrayList<FF44>();
    private List<FF8009> ff8009List = new ArrayList<FF8009>();
    private List<FF804B> ff804bList = new ArrayList<FF804B>();
    private List<FF8A03> ff8a03List = new ArrayList<FF8A03>();

    public void addFf3f(FF3F ff3f) {
        this.ff3fList.add(ff3f);
    }

    public void addFf40(FF40 ff40) {
        this.ff40List.add(ff40);
    }

    public void addFf41(FF41 ff41) {
        this.ff41List.add(ff41);
    }

    public void addFf42(FF42 ff42) {
        this.ff42List.add(ff42);
    }

    public void addFf43(FF43 ff43) {
        this.ff43List.add(ff43);
    }

    public void addFf44(FF44 ff44) {
        this.ff44List.add(ff44);
    }

    public void addFf8009(FF8009 ff8009) {
        this.ff8009List.add(ff8009);
    }

    public void addFf804bList(FF804B ff804B) {
        this.ff804bList.add(ff804B);
    }

    public void ff8a03List(FF8A03 ff8a03) {
        this.ff8a03List.add(ff8a03);
    }*/
}
