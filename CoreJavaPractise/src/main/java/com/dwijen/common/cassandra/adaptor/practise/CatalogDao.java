package com.dwijen.common.cassandra.adaptor.practise;

/**
 * Created by dkirtan on 8/4/17.
 */
public class CatalogDao {
    public static final String GET_ITEM_SQL= "select * from catalog.item limit 10";
    public static final String GET_CONTENT_ITEM_SQL= "select * from catalog.content_item limit 10";
}
