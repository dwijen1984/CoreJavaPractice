package com.dwijen.Enum.Practice;

/**
 * Created by dkirtan on 5/3/17.
 */
public class EnumTest {

    public static void main(String args[])
    {
        boolean b = StoreUnitNumber.DSS_STORE_UNIT_NUMBER.getStoreUnitNumber().equalsIgnoreCase("9300");
        System.out.println(b);
        System.out.println(StoreUnitNumber.DSS_STORE_UNIT_NUMBER);
        System.out.println(StoreUnitNumber.DSS_STORE_UNIT_NUMBER.getStoreUnitNumber());
        System.out.println(StoreUnitNumber.taxNonInvoicableStores);
        System.out.println(StoreUnitNumber.byNumber("9301"));
    }
}
