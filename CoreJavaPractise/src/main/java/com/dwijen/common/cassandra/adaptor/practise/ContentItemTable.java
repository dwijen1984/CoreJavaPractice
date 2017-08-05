package com.dwijen.common.cassandra.adaptor.practise;

/**
 * Created by dkirtan on 7/28/17.
 */
@TableName(tableName = "ContentItemTable")
public class ContentItemTable implements TableFormat{

    @FieldName(fieldName = "brand_id")
    Long brand_id;
    @FieldName(fieldName = "content_item_class_id")
    Long content_item_class_id;
    @FieldName(fieldName = "content_item_id")
    Long content_item_id;
    @FieldName(fieldName = "status")
    int status;
    @FieldName(fieldName = "marketing_description")
    String marketing_description;

    public Long getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Long brand_id) {
        this.brand_id = brand_id;
    }

    public String getMarketing_description() {
        return marketing_description;
    }

    public void setMarketing_description(String marketing_description) {
        this.marketing_description = marketing_description;
    }

    public Long getContent_item_class_id() {
        return content_item_class_id;
    }

    public void setContent_item_class_id(Long content_item_class_id) {
        this.content_item_class_id = content_item_class_id;
    }

    public Long getContent_item_id() {
        return content_item_id;
    }

    public void setContent_item_id(Long content_item_id) {
        this.content_item_id = content_item_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString(){
        StringBuffer b = new StringBuffer();
        b.append("brand_id:"+this.brand_id);
        b.append(" >> content_item_id:"+this.content_item_id);
        b.append(" >> content_item_class_id:"+this.content_item_class_id);
        b.append(" >> status:"+this.status);
        b.append(" >> marketing_description:"+this.marketing_description);
        return b.toString();
    }
}
