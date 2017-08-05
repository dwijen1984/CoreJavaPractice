package com.dwijen.java.practice;

/**
 * Created by dkirtan on 4/27/17.
 */
public class SpecificRsultsetWrapperSecond<BeanT> extends CommonRsultsetWrapper<BeanTypeTwo> {

    @Override
    public BeanTypeTwo mapRow(ReultSetT res) {
        BeanTypeTwo beanTypeOne = new BeanTypeTwo();
        beanTypeOne.setKey(res.getRset().getValue());
        return beanTypeOne;
    }
}
