package test;

import test.adb.FF3B;
import test.adb.FF3D;
import test.adb.FF3E;
import test.adb.FF801E;

import java.io.ByteArrayInputStream;

/**
 * Created by a.sinenko on 13.09.2017.
 */
public class Main {
    public static void main(String[] args) {
        FF3B ff3B = new FF3B();

        FF3D ff3D = new FF3D();
        ff3D.addTag("DF805D", "0");
        ff3D.addTag("DF8033", "43214");
        ff3D.addTag("DF8069", "sdr");
        ff3D.addTag("DF806A","4523234");
        ff3D.addTag("DF806B","asdf");
        ff3D.addTag("DF806C" , "1");
        ff3D.addTag("DF806D", "233456");

        FF3E ff3E = new FF3E();
        ff3E.addTag("DF805D", "0"); // Sequence
        ff3E.addTag("DF8064", "2"); // Limit Type
        ff3E.addTag("DF8065", "200000000"); // Limit Value
        ff3E.addTag("DF8066", "510234987"); // Limit Length
        ff3E.addTag("DF8067", "1"); // Limit Length Type
        ff3E.addTag("DF8068", "2017-12-12"); // Limit End Date
        ff3E.addTag("DF813A", "830"); // Current (today)
        ff3E.addTag("DF806E", "123456789"); // Record Processing
        ff3E.addTag("DF808E", "123456789");
        
        FF801E ff801E = new FF801E();
        ff801E.addTag("DF805D", "0"); // Sequence
        ff801E.addTag("DF802C", "1234567890123456"); // Card number
        ff801E.addTag("DF8074", "123456789"); // Card Sequence Number
        ff801E.addTag("DF8223", "123456789"); // Payment Amount
        ff801E.addTag("DF8224", "2"); // BO Transaction Type
        ff801E.addTag("DF8225", "2017-12-12"); // Transaction Date
        ff801E.addTag("DF8226", "qwewqeqw"); // Transaction Description
        ff801E.addTag("DF8227", "123456789"); // BO Utrnno
        ff801E.addTag("DF8343", "123456789"); // Transaction Time
        ff801E.addTag("DF8342", "1"); // Operation type (OPTP dictionary)
        ff801E.addTag("DF8270", "987654321"); // Transaction External Reference
        ff801E.addTag("DF8514", "000012345"); // Issuer Available Balance after Transaction
        ff801E.addTag("DF8A10", "1"); // Extended Transaction description

        ff3B.addTag(ff3D);
        ff3B.addTag(ff3E);
        ff3B.addTag(ff801E);

        System.out.println(ff3B.toString());
    }
}
