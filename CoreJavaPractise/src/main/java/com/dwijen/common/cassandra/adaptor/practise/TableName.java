package com.dwijen.common.cassandra.adaptor.practise;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by dkirtan on 7/28/17.
 */
@Retention(RUNTIME) @Target({TYPE})
public @interface TableName {
    String tableName();
}
