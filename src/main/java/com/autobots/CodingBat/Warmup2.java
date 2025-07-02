package com.autobots.CodingBat;

import static java.lang.Math.abs;

public class Warmup2 {

    public static void main(String[] args) {
        System.out.println(close10(2,5));;

    }

    public static int  close10(int a, int b) {
        int c;
        int d;
        c=abs(10-a);
        d=abs(10-b);

        if(c<d){
            return a;
        }else if(c==d){
            return 0;
        }else{
            return b;
        }

    }
    public String stringTimes(String str, int n) {
        String result = "";
        for (int i=0; i<n; i++) {
            result = result + str;
        }
        return result;
    }
    public String frontTimes(String str, int n) {

        String result = "";
        for (int i=0; i<n; i++) {
            if(str.length()>=3){
                result = result + str.substring(0,3);
            }else{
                result = result + str.substring(0,str.length());
            }
        }
        return result;
    }
    int countXX(String str) {
        int count = 0;
        for (int i=0; i<str.length()-1; i++) {
            if (str.substring(i, i+2).equals("xx")) count++;
        }
        return count;
    }

    boolean doubleX(String str) {
        int index = str.indexOf("x");
        // Если "x" не найден вообще или он последний символ — сразу false
        if (index == -1 || index + 1 >= str.length()) {
            return false;
        }
        return str.charAt(index + 1) == 'x';
    }
    public String stringBits(String str) {
        String result="";
        for (int i = 0; i < str.length(); i=i+2) {
            result=result+str.charAt(i);

        }
        return result;
    }
    //    stringSplosion("Code") → "CCoCodCode"
//    stringSplosion("abc") → "aababc"
//    stringSplosion("ab") → "aab"
    public String stringSplosion(String str) {
        String result="";
        for (int i = 0; i < str.length(); i++) {
            result=result+str.substring(0,i+1);

        }
        return result;
    }

    //    ast2("hixxhi") → 1
//    last2("xaxxaxaxx") → 1
//    last2("axxxaaxx") → 2
    public int last2(String str) {
        if (str.length() < 2) return 0;
        String end = str.substring(str.length()-2);
        int count = 0;
        for (int i=0; i<str.length()-2; i++) {
            String sub = str.substring(i, i+2);
            if (sub.equals(end)) {  // Use .equals() with strings
                count++;
            }
        }

        return count;
    }
    public boolean arrayFront9(int[] nums) {
        int end = nums.length;
        if (end > 4) end = 4;

        for (int i=0; i<end; i++) {
            if (nums[i] == 9) return true;
        }

        return false;
    }
    public int arrayCount9(int[] nums) {
        int count=0;
        for(int n: nums){
            if (n==9){
                count++;
            }
        }
        return count;
    }
    public boolean array123(int[] nums) {
        for (int i=0; i < (nums.length-2); i++) {
            if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
        }
        return false;
    }
    public int stringMatch(String a, String b) {
  // Figure which string is shorter.
        int len = Math.min(a.length(), b.length());
        int count = 0;

        // Look at both substrings starting at i
        for (int i=0; i<len-1; i++) {
            String aSub = a.substring(i, i+2);
            String bSub = b.substring(i, i+2);
            if (aSub.equals(bSub)) {  // Use .equals() with strings
                count++;
            }
        }

        return count;
    }

    public String stringX(String str) {
        String result = "";
        for (int i=0; i<str.length(); i++) {
            // Only append the char if it is not the "x" case
            if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
                result = result + str.charAt(i); // result = result + str.substring(i, i+1)
            }
        }
        return result;
    }
//altPairs("kitten") → "kien"
//    altPairs("Chocolate") → "Chole"
//    altPairs("CodingHorror") → "Congrr"

    public String altPairs(String str) {
        String result = "";

        // Run i by 4 to hit 0, 4, 8, ...
        for (int i=0; i<str.length(); i += 4) {
            // Append the chars between i and i+2
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            result = result + str.substring(i, end);
        }

        return result;
    }
    public String stringYak(String str) {
        String result ="";
        for (int i=0; i<str.length(); i++) {
            if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k'){
                i=i+2;
            }else{
                result=result+str.charAt(i);
            }
        }
        return result;
    }
    //array667([6, 6, 2]) → 1
//array667([6, 6, 2, 6]) → 1
//array667([6, 7, 2, 6]) → 1
    public int array667(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length-1;i++){
            if(nums[i]==6&&nums[i+1]==6||nums[i+1]==7)
                count++;
        }
        return count;
    }
    public boolean noTriples(int[] nums) {
        int count=0;
        for(int i=0; i<(nums.length-2);i++){
            int first=nums[i];
            if(nums[i+1]== first && nums[i+2]==first){

                return false;

            }
        }

        return true;
    }
//Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, //followed by the value plus 5, followed by the value minus 1. Additionally //the 271 counts even if the "1" differs by 2 or less from the correct value.

    //has271([1, 2, 7, 1]) → true
//has271([1, 2, 8, 1]) → false
//has271([2, 7, 1]) → true
    public boolean has271(int[] nums) {

        for(int i=0; i<(nums.length-2); i++){
            int first=nums[i];
            if(nums[i+1]==first+5 && (Math.abs(nums[i+2]-(first-1)))<=2){
                return true;
            }

        }
        return false;

    }




}
