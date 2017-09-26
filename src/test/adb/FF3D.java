package test.adb;

import test.MiddleLevelTag;

/**
 * Created by a.sinenko on 13.09.2017.
 */
public class FF3D extends MiddleLevelTag{
    private static final String tag = "FF3D";

    public FF3D() {
        super(tag);
        tags.put("DF805D", null); // Sequence
        tags.put("DF8033", null); // Account Number
        tags.put("DF8069", null); // FE Account Status
        tags.put("DF806A", null); // Issuer Available Balance
        tags.put("DF806B", null); // Debit/Credit
        tags.put("DF806C", null); // Issuer Hold Amount
        tags.put("DF806D", null); // Issuer Ledger Balance
        tags.put("DF8034", null); // Currency Code
        tags.put("DF8037", null); // Source for opening the
        tags.put("DF806E", null); // Record Processing Code
        tags.put("DF8055", null); // Account Exceed Limit
        tags.put("DF8370", null); // Fee Scheme
        tags.put("DF840B", null); // Unbilled Amount
        tags.put("DF820E", null); // Account Status Reason
        tags.put("DF8453", null); // Account Status Reason
        tags.put("DF845E", null); // Account maximum available
        tags.put("DF834E", null); // Account irreducible subbalance
        tags.put("DF8414", null); // Grace Period End Date
        tags.put("DF8415", null); // Total Amount Due
        tags.put("DF8416", null); // Minimal Amount Due
        tags.put("DF8606", null); // Installment Balance
        tags.put("DF876A", null); // Last transaction date
        tags.put("DF876B", null); // Last transaction time
    }
}
