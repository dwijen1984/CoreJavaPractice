package com.dwijen.common.cassandra.adaptor.practise;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by dkirtan on 7/28/17.
 */
public class ResultSetMapper {
    public static void main(String[] args) {

        PreparedStatement preparedStatement = null;
        try {
            // Step 1: "Load" the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Step 2: Establish the connection to the database
            String url = "jdbc:mysql://env01:11332/catalog";
            Connection conn = DriverManager.getConnection(url, "shc_read", "shc_read");

            // preparedStatement = conn.prepareStatement("select * from catalog.item limit 10");
            ResultSet rs = null;
            for (CassandraFetcher ca : CassandraFetcher.values()) {
                Object o = ca.getClazz().newInstance();
                rs = conn.prepareStatement(ca.getSQL_query()).executeQuery();
                ca.getClazz().getSimpleName();
                Collection<TableFormat> collectionItems = new ArrayList<>();
                while (rs.next()) {
                    Object obj = pouplateValue(ca.getClazz(), rs);
                    TableFormat tb = (TableFormat) obj;
                    collectionItems.add(tb);
                }
                collectionItems.forEach(System.out::println);
            }
        } catch (Exception e) {
            System.err.println("D'oh! Got an exception!");
            System.err.println(e.getMessage());
        }
    }



    public static <T> T pouplateValue(Class<T> clazz, ResultSet rs) throws IllegalAccessException, InstantiationException, SQLException {
        T obj = clazz.newInstance();
        for (Field m : clazz.getDeclaredFields()) {
            if (m.isAnnotationPresent(FieldName.class)) {
                // This is where we set the data in the real Object
                m.set(obj, rs.getObject(m.getName()));
            }
        }
        return obj;
    }

}
