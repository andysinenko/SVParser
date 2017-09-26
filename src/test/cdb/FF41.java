package test.cdb;

import test.MiddleLevelTag;

import java.util.HashMap;

/**
 * Created by a.sinenko on 12.09.2017.
 */
public class FF41 extends MiddleLevelTag {
    private static final String tag = "FF41";

    public FF41() {
        super(tag);
        tags.put("DF805D", null); // Sequence
        tags.put("DF802C", null); // Card
        tags.put("DF8A67", null); // PAN ID
        tags.put("DF8042", null); // Embossed
        tags.put("DF8073", null); // OAR
        tags.put("DF8074", null); // Card
        tags.put("DF8076", null); // FE Hot
        tags.put("DF8077", null); // PIN Offset
        tags.put("DF8032", null); // Card
        tags.put("DF8078", null); // Expiration
        tags.put("DF8030", null); // Primary
        tags.put("DF8031", null); // Primary
        tags.put("DF8101", null); // CVC1
        tags.put("DF8102", null); // CVC2
        tags.put("DF8103", null); // PVV
        tags.put("DF806E", null); // Record
        tags.put("DF8163", null); // PIN REISSUED
        tags.put("DF8179", null); // PLASTIC
        tags.put("DF802F", null); // Card Type
        tags.put("DF8002", null); // Contract
        tags.put("DF824E", null); // EMV Data
        tags.put("DF8370", null); // Fee Scheme
        tags.put("DF862D", null); // Currency
        tags.put("DF8454", null); // Hot Card
        tags.put("DF8455", null); // Hot Card
        tags.put("DF802D", null); // Is Primary
        tags.put("DF8520", null); // Double
        tags.put("DF8104", null); // Card Issue
        tags.put("DF8579", null); // Initialization in Track
        tags.put("DF857A", null); // Initialization in Track
        tags.put("DF862B", null); // Positive Service
        tags.put("DF862E", null); // Old Card
        tags.put("DF8A13", null); // Card ID
        tags.put("DF8A1A", null); // Barcode
        tags.put("DF876C", null); // Suppress
        tags.put("DF876D", null); // PVKI
    }

}
