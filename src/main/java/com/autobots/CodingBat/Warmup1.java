package com.autobots.CodingBat;

import static java.lang.Math.abs;

public class Warmup1 {public static void main(String[] args) {
    System.out.println(sleepIn(false, true));
    System.out.println(monkeyTrouble(true, false));
    System.out.println(sumDouble(5, 5));
    System.out.println(diff21(22));
    System.out.println(parrotTrouble(true, 24));



}

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }


    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;

    }

    public static int sumDouble(int a, int b) {
        if (a != b) {
            return a + b;
        } else return (a + b) * 2;

    }

    public static int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        }
        return (n - 21) * 2;
    }

    public static boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)) {
            return true;
        } else {
            return false;

        }
    }
    public boolean makes10(int a, int b){
        if(a==10 ||b==10||(a+b==10)){
            return true;
        }else {
            return false;
        }
    }
    public boolean nearHundred(int n) {
        if(abs(100-n)<=10||(abs(200-n)<=10)){
            return true;
        }else{
            return false;
        }
    }
    public boolean posNeg(int a, int b, boolean negative) {
        return (a>0&&b<0 && !negative)||(b>0&&a<0 && !negative)||(a<0&&b<0 && negative)? true:false;//тут можно тру фолс опустиьт

    }
    public String notString(String str) {
        return (str.startsWith ("not")?str: "not ".concat(str));

    }
    public String missingChar(String str, int n) {
        StringBuilder sb = new StringBuilder(str);
        return sb.deleteCharAt(n).toString();
    }
    public String frontBack(String str) {
        if(str.length() < 2) return str;
        return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);

    }
    public String front3(String str) {
        return (str.length()>=3)?
                str.substring(0,3).concat(str.substring(0,3)).concat(str.substring(0,3)):
                str.concat(str).concat(str);

    }
    public String backAround(String str) {
        String r=str.substring(str.length()-1);

        return (str.length()>2)? r+str+r: str+str+str;

    }
    public boolean or35(int n) {
        if ((n%3==0)||(n%5==0)){
            return true;
        }else{
            return false;
        }

    }
    public String front22(String str) {
        return (str.length() >= 2)? str.substring(0,2) + str + str.substring(0,2) : str+str+str;
    }
    public boolean startHi(String str) {
        return (str.startsWith("hi")) ? true : false;
    }
    public boolean hasTeen(int a, int b, int c) {
        return ((a>=13&&a<=19)||(b>=13&&b<=19)||(c>=13&&c<=19));
    }
    public boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);
        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }
    public String delDel(String str) {
        if (str.length()>=4 && str.substring(1, 4).equals("del")) {

            return str.substring(0, 1) + str.substring(4);
        }

        return str;


    }
    public boolean mixStart(String str) {
        return (str.length()>=3 && str.substring(1,3).equals("ix"));
    }
    public String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0)=='o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1)=='z') {
            result = result + str.charAt(1);
        }

        return result;
    }
    public int intMax(int a, int b, int c) {
        int max=a;
        int[] nums={a,b,c};
        for (int i=0;i< nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
    public int close10(int a, int b) {
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
    public boolean in3050(int a, int b) {
        if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
            return true;
        }
        if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
            return true;
        }
        return false;

    }
    public boolean in1020(int a, int b) {
        if( (a>=10&& a<=20)||(b>=10&& b<=20)){
            return true;
        }else{
            return false;
        }
    }
    public boolean icyHot(int temp1, int temp2) {
        if((temp1<0&& temp2>100)||(temp2<0&& temp1>100)){
            return true;
        }else{
            return false;
        }

    }
    public int max1020(int a, int b) {

        if((a>=10 && a<=20)&&(b>=10 && b<=20)){
            if(a>b){
                return a;
            }
            else{
                return b;
            }}else if((a>=10 && a<=20)&&!(b>=10 && b<=20)){
            return a;
        }
        else if(!(a>=10 && a<=20)&&(b>=10 && b<=20)){
            return b;
        }
        else{
            return 0;
        }
    }
    public int max1020_(int a, int b) {

        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Knowing a is bigger, just check a first
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }
    public boolean lastDigit(int a, int b) {
        if(a%10==b%10){
            return true;
        }else{
            return false;
        }
    }
    public String everyNth(String str, int n) {
        String result="";
        for (int i = 0; i < str.length(); i=i+n) {
            result=result+str.charAt(i);


        }
        return result;
    }
    public String endUp(String str) {

        if(str.length()<4){
            return str.toUpperCase();
        }else {
            String str2=str.substring(str.length()-3,str.length()).toUpperCase();
            String str1=str.substring(0,str.length()-3);
            return str1+str2;
        }
    }
}
