package com.autobots.CodingBat;

public class Array1 {
    public static void main(String[] args) {

    }
    public boolean firstLast6(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length; i++){
            if (nums[0]==6||nums[nums.length-1]==6) {

                count++;
            }
        }
        if(count>0){
            return true;
        }
        return false;
    }

    public boolean sameFirstLast(int[] nums) {
        if(nums.length>=2&&nums[0]==nums[nums.length-1]){
            return true;
        }else if (nums.length==1){
            return true;
        }else{
            return false;
        }
    }
    public int[] makePi() {
        return new int[] {3, 1, 4};
    }




}
