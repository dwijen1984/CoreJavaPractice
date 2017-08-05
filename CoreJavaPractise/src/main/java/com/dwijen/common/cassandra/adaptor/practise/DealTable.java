package com.dwijen.common.cassandra.adaptor.practise;

/**
 * Created by dkirtan on 7/28/17.
 */
@TableName(tableName = "shard")
public class DealTable {

    @FieldName(fieldName = "shard_id")
    String shard_id;

}
