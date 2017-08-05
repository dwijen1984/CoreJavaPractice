package com.dwijen.java.practice;

import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dkirtan on 4/27/17.
 */
public class ResulSetCaller {

    public static void main(String args[]){

/*        DummyResuleSet dummy = new DummyResuleSet() ;
        dummy.setValue("Check1");
        ReultSetT res = new ReultSetT(dummy);
        CommonRsultsetWrapper<BeanTypeOne> commonRsultsetWrapper = new CommonRsultsetWrapper<BeanTypeOne>() {
            @Override
            public BeanTypeOne mapRow(ReultSetT res) {
                BeanTypeOne beanTypeOne = new BeanTypeOne();
                beanTypeOne.setKey(res.getRset().getValue());
                return beanTypeOne;
            }
        };
        CommonRsultsetWrapper<BeanTypeTwo> commonRsultsetWrapper2 = new SpecificRsultsetWrapperSecond();
        BeanTypeOne beanTypeOne = commonRsultsetWrapper.mapRow(res);
        BeanTypeTwo beanTypeTwo = commonRsultsetWrapper2.mapRow(res);
        System.out.println("---------"+beanTypeOne.getKey());
        System.out.println("---------"+beanTypeOne.getValue());
        System.out.println("---------");
        System.out.println("---------"+beanTypeTwo.getKey());
        System.out.println("---------"+beanTypeTwo.getValue());*/


        List<Integer> intList = new ArrayList<Integer>();
        intList.add(100);intList.add(101);intList.add(102);intList.add(103);//intList.add(105);
        StringBuffer sb = new StringBuffer();
        int loop = 0;
        for(Integer integerValue :intList){
            sb.append("'"+new DecimalFormat("0000000").format(integerValue)+"'");
            loop++;
            if(intList.size()> loop){
                sb.append(",");
            }
        }
/*        String str = new DecimalFormat("00000000").format(a);*/
        System.out.println(sb.toString());
    }
}
