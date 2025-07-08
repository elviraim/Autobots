package com.autobots.CodingBat;

import java.util.Arrays;
import java.util.List;

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
    public int[] rotateLeft3(int[] nums) {
        return new int[] { nums[1], nums[2], nums[0] };
    }
    public int[] reverse3(int[] nums) {
        return new int[] { nums[2], nums[1], nums[0] };
    }
    public int[] maxEnd3(int[] nums) {
        int max=0;
        if(nums[0]>nums[2]){
            max=nums[0];
        }else{
            max=nums[2];
        }

        return new int[]{max,max,max};
    }
    public int sum2(int[] nums) {
        int sum=0;
        if(nums.length>=2){
            sum=nums[0]+nums[1];
        } else if(nums.length==1){
            sum=nums[0];
        }else{
            sum=0;
        }
        return sum;
    }
    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1],b[1]};
    }
    public int[] makeEnds(int[] nums) {
        if(nums.length>1){
            return new int[]{nums[0],nums[nums.length-1]};
        }else{
            return new int[]{nums[0],nums[0]};
        }
    }
    public boolean has23(int[] nums) {
        List<Integer> list = Arrays.asList(nums[0], nums[1]);
        return list.contains(2) || list.contains(3);
    }
    public boolean no23(int[] nums) {
        List<Integer> list = Arrays.asList(nums[0], nums[1]);
        return !(list.contains(2) || list.contains(3));
    }
    public int[] makeLast(int[] nums) {
        int[] result = new int[nums.length * 2]; // создаём массив нужной длины, заполненный нулями
        result[result.length - 1] = nums[nums.length - 1]; // копируем последний элемент
        return result;
    }
    public boolean double23(int[] nums) {
        if (nums.length != 2) {
            return false;
        }
        return (nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3);
    }
    public int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==2&&nums[i+1]==3){
                nums[i+1]=0;
            }
        }
        return nums;

    }
    public int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1) {
            count++;
        }
        if (b.length > 0 && b[0] == 1) {
            count++;
        }
        return count;
    }
    public int[] biggerTwo(int[] a, int[] b) {
        int sum=a[0]+a[1];
        int sum1=b[0]+b[1];
        if (sum>=sum1){
            return a;
        }else{
            return b;
        }
    }
    public int[] makeMiddle(int[] nums) {
        return new int[]{nums[nums.length/2-1],nums[nums.length/2]};
    }
    public int[] plusTwo(int[] a, int[] b) {
        return new int[] { a[0], a[1], b[0], b[1] };
    }
    public int[] swapEnds(int[] nums) {
        if (nums.length >= 2) {
            int temp = nums[0];
            nums[0] = nums[nums.length - 1];
            nums[nums.length - 1] = temp;
        }
        return nums;
    }
    public int[] midThree(int[] nums) {
        if(nums.length>3){
            return new int[]{nums[(nums.length-1)/2-1],nums[(nums.length-1)/2],
                    nums[(nums.length-1)/2+1]};
        }else{
            return nums;
        }
    }
    public int maxTriple(int[] nums) {
        if(nums.length>=3){
            int first=nums[0];
            int middle=nums[(nums.length-1)/2];
            int last=nums[nums.length-1];
            int[] ints = {first, middle, last};
            int max=0;
            for (int i = 0; i < ints.length; i++) {
                if(ints[i]>max){
                    max=ints[i];
                }
            }
            return max;
        }else{
            return nums[0];
        }
    }
    public int[] frontPiece(int[] nums) {
        if(nums.length>2){
            return new int []{nums[0],nums[1]};
        }else{
            return nums;
        }
    }
    public boolean unlucky1(int[] nums) {
        if(nums.length>=2){
            return ((nums[0]==1&& nums[1]==3)||(nums[1]==1&& nums[2]==3)||
                    (nums[nums.length-2]==1&& nums[nums.length-1]==3));

        }else{
            return false;
        }
    }
    public int[] make2(int[] a, int[] b) {
        int[] result = new int[2]; // результирующий массив длиной 2
        int index = 0;

        // Добавляем элементы из массива a, пока не заполним result
        for (int i = 0; i < a.length && index < 2; i++) {
            result[index] = a[i];
            index++;
        }

        // Если не хватило элементов из a, добавляем из b
        for (int i = 0; i < b.length && index < 2; i++) {
            result[index] = b[i];
            index++;
        }

        return result;
    }
    public int[] front11(int[] a, int[] b) {
        if(a.length>=1&&b.length>=1){
            return new int[]{a[0],b[0]};
        }else if(a.length==0&&b.length>=1){
            return new int[]{b[0]};
        }else if (a.length>=1 && b.length==0){
            return new int[]{a[0]};
        }else{return new int[]{};

        }}












}
