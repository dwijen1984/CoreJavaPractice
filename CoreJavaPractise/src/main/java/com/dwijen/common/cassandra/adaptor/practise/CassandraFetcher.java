package com.dwijen.common.cassandra.adaptor.practise;

/**
 * Created by dkirtan on 8/4/17.
 */

public enum CassandraFetcher {
    itemFetcher(ItemTable.class, CatalogDao.GET_ITEM_SQL),
    ContentItemFetcher(ContentItemTable.class, CatalogDao.GET_CONTENT_ITEM_SQL);



    private Class clazz;
    private String SQL_query;
    CassandraFetcher(Class clazz, String SQL_query){
        this.clazz= clazz;
        this.SQL_query = SQL_query;
    }

    public Class getClazz() {
        return clazz;
    }

    public String getSQL_query() {
        return SQL_query;
    }

}
