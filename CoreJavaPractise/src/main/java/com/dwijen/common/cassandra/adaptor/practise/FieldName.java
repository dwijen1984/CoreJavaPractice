package com.dwijen.common.cassandra.adaptor.practise;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by dkirtan on 7/28/17.
 */
@Retention(RUNTIME) @Target({FIELD})
public @interface FieldName {
    String fieldName();

}
