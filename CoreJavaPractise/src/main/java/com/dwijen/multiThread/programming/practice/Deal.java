package com.dwijen.multiThread.programming.practice;

/**
 * Created by dkirtan on 7/19/17.
 */
public class Deal {
    private String DealStatus;

    Deal(String DealStatus){
        this.DealStatus = DealStatus;
    }

    public String getDealStatus() {
        return DealStatus;
    }

    public void setDealStatus(String dealStatus) {
        DealStatus = dealStatus;
    }
}
