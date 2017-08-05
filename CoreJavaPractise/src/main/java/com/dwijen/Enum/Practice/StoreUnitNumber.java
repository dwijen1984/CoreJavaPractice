package com.dwijen.Enum.Practice;

import java.util.EnumSet;

/**
 * Created by dkirtan on 5/3/17.
 */
public enum StoreUnitNumber {

    DSS_STORE_UNIT_NUMBER("9300"),
    MP_STORE_UNIT_NUMBER("9301"),
    OVERSTOCK_STORE_UNIT_NUMBER("9311"),
    MYGOFER_STORE_UNIT_NUMBER("9367"),
    MP_KMART_STORE_UNIT_NUMBER("7864"),
    OVERSTOCK_KMART_STORE_UNIT_NUMBER("7868");

    private StoreUnitNumber(String storeUnitNumber) {
        this.storeUnitNumber = storeUnitNumber;
    }

    private final String                   storeUnitNumber;

    public static EnumSet<StoreUnitNumber> taxNonInvoicableStores = EnumSet.of(DSS_STORE_UNIT_NUMBER, OVERSTOCK_STORE_UNIT_NUMBER, OVERSTOCK_KMART_STORE_UNIT_NUMBER);

    public String getStoreUnitNumber() {
        return storeUnitNumber;
    }

    public static StoreUnitNumber byNumber(String unitNo) {

        for (StoreUnitNumber unitNumber : StoreUnitNumber.values()) {
            if (unitNumber.getStoreUnitNumber().equalsIgnoreCase(unitNo)) {
                return unitNumber;
            }
        }
        throw new IllegalArgumentException("[StoreUnitNumber not found, invalid argument " + unitNo + " ]");

    }

}
