package com.dwijen.java.practice;

/**
 * Created by dkirtan on 4/27/17.
 */
public class SpecificRsultsetWrapper<BeanT> extends CommonRsultsetWrapper<BeanTypeOne> {

    @Override
    public BeanTypeOne mapRow(ReultSetT res) {
        BeanTypeOne beanTypeOne = new BeanTypeOne();
        beanTypeOne.setKey(res.getRset().getValue());
        return beanTypeOne;
    }
}
