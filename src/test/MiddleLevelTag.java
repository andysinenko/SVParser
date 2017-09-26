package test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by a.sinenko on 04.09.2017.
 */
public class MiddleLevelTag{
    protected final HashMap<String, String> tags = new HashMap<String, String>();
    protected String tagName;

    public MiddleLevelTag(String tagName) {
        this.tagName = tagName;
    }

    public void addTag(String tagName, String val) {
        if(tags.containsKey(tagName)) {
            tags.put(tagName, val);
        }
    }

    public void setSequenceNumber(int num) {
        tags.put("DF805D", String.valueOf(Integer.valueOf(tags.get("DF805D"))+ num) );
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("DF805D").append(String.format("%02X", tags.get("DF805D").length())).append(tags.get("DF805D"));
        for ( Map.Entry<String, String> entry : tags.entrySet()) {
            if(!entry.getKey().equalsIgnoreCase("DF805D")) {
                String key = entry.getKey();
                String val = entry.getValue();
                if (val != null) {
                    if (val.length() >= 0x7B) {
                        String len = String.format("%03X", val.length());
                        result.append(key).append("8").append(len).append(val);
                    } else {
                        String len = String.format("%02X", val.length());
                        result.append(key).append(len).append(val);
                    }
                }
            }
        }
        String resultString = result.toString();
        result.setLength(0);
        if(resultString.length() >= 0x7B) {
            String lengthStr = String.format("%03X", resultString.length());
            result.append(tagName).append("8").append(lengthStr).append(resultString);
        }else{
            String lengthStr = String.format("%02X", resultString.length());
            result.append(tagName).append(lengthStr).append(resultString);
        }

        return result.length()>0?result.toString():null;
    }
}
