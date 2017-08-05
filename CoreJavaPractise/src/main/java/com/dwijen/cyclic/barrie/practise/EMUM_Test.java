package com.dwijen.cyclic.barrie.practise;

/**
 * Created by dkirtan on 3/1/17.
 */
public class EMUM_Test {

    enum RSMap {
        skinny_content_id,
        item_id,
        account_id,
        file_id,
        ssin_id,
        upc,
        brand,
        manufacturer_model_number,
        ia_process_status,
        seller_approval_status,
        matched_content_item_id,
        matched_content_account_id,
        status,
        ia_response_dtm,
        tax_code,
        modified_id,
        created_dtm,
        modified_dtm,
        gu_id,
        match_confidence,
        match_reason,
        content_rejection_reason
    }

    public static void main(String args[]){

        System.out.println(RSMap.account_id);
        for(Enum_GF original : Enum_GF.values())
            System.out.printf("%n%s\t %s\t %s", original, original.getDescription(),original.getAge());
    }
}
