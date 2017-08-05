package com.dwijen.java.practice;

/**
 * Created by dkirtan on 4/27/17.
 */
public interface ResultSetWrapper<ReultSetType, BeanT> {
     BeanT mapRow(ReultSetType res);
}
