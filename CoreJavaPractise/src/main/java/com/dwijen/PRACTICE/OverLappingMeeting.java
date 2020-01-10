package com.dwijen.PRACTICE;

import org.junit.Test;

import java.util.*;

public class OverLappingMeeting {

    public void FindOverLap(int[][] meetigns){

        int[] worikingHours = new int[9];

        for(int i =0 ; i< meetigns.length;i++){
                int start = meetigns[i][0];
                int end = meetigns[i][1];
                while(start <end) {
                    worikingHours[start -8]++;
                    start++;
                }
        }

        for(int i =0;i< 9; i++){
            if(worikingHours[i] > 1){
                System.out.println("OverLap between :"+(i+9));
            }
        }
    }

    @Test
    public void testOverLap(){
        int[][] meetings = {{9,10}, {13,16},{14,16}};
        FindOverLap(meetings);
    }

    @Test
    public void sortedSchedule(){
        Meeting m1 = new Meeting(); m1.startTime = 11; m1.endTime = 13;
        Meeting m2 = new Meeting(); m2.startTime = 9; m2.endTime = 10;
        Meeting m3 = new Meeting(); m3.startTime = 2; m3.endTime = 4;
        List<Meeting> lst = new ArrayList<>(); lst.add(m1); lst.add(m2);lst.add(m3);
        sortMeetings(lst);
        System.out.println(lst);
    }

    public List<Meeting> sortMeetings(List<Meeting> lst){
        Collections.sort(lst, new Comparator<Meeting>() {
            @Override
            public int compare(Meeting o1, Meeting o2) {
                return o1.startTime - o2.startTime;
            }
        });
        return lst;
    }
    public class Meeting{
        private int startTime; private int endTime;

        public int getStartTime() {
            return startTime;
        }

        public void setStartTime(int startTime) {
            this.startTime = startTime;
        }

        public int getEndTime() {
            return endTime;
        }

        public void setEndTime(int endTime) {
            this.endTime = endTime;
        }

        @Override
        public String toString() {
            return "Meeting{" +
                    "startTime=" + startTime +
                    ", endTime=" + endTime +
                    '}';
        }
    }
}
