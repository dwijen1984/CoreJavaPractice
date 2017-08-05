package com.dwijen.common.cassandra.adaptor.practise;

/**
 * Created by dkirtan on 7/28/17.
 */
@TableName(tableName = "item")
public class ItemTable implements TableFormat{

    @FieldName(fieldName = "item_id")
    Long item_id;
    @FieldName(fieldName = "content_item_class_id")
    Long content_item_class_id;
    @FieldName(fieldName = "content_item_id")
    Long content_item_id;
    @FieldName(fieldName = "account_type")
    int account_type;
    @FieldName(fieldName = "websku")
    String websku;

    public Long getItem_id() {
        return item_id;
    }

    public void setItem_id(Long item_id) {
        this.item_id = item_id;
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

    public int getAccount_type() {
        return account_type;
    }

    public void setAccount_type(int account_type) {
        this.account_type = account_type;
    }

    public String getWebsku() {
        return websku;
    }

    public void setWebsku(String websku) {
        this.websku = websku;
    }
    @Override
    public String toString(){
        StringBuffer b = new StringBuffer();
        b.append("item_id:"+this.item_id);
        b.append(" >> content_item_id:"+this.content_item_id);
        b.append(" >> content_item_class_id:"+this.content_item_class_id);
        b.append(" >> account_type:"+this.account_type);
        b.append(" >> websku:"+this.websku);
        return b.toString();
    }
}
