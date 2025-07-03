package com.autobots.CodingBat;

public class String1 {
    public static void main(String[] args) {

    }

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }

    public String extraEnd(String str) {
        return str.substring((str.length() - 2), (str.length())) +
                str.substring((str.length() - 2), (str.length())) +
                str.substring((str.length() - 2), (str.length()));
    }

    public String firstTwo(String str) {
        if (str.length() > 2) {
            return str.substring(0, 2);
        }
        return str;
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b) {
        String shortstr = "";
        String longstr = "";
        if (a.length() > b.length()) {
            shortstr = b;
            longstr = a;
        } else {
            shortstr = a;
            longstr = b;
        }
        return shortstr + longstr + shortstr;
    }

    public String nonStart(String a, String b) {
        return a.substring(1, a.length()) + b.substring(1, b.length());
    }

    public String left2(String str) {
        if (str.length() > 2) {
            return str.substring(2, str.length()) + str.substring(0, 2);
        }
        return str;
    }

    public String right2(String str) {
        if (str.length() > 2) {
            return str.substring(str.length() - 2, str.length()) + str.substring(0, str.length() - 2);
        }
        return str;
    }
//    theEnd("Hello", true) → "H"
//    theEnd("Hello", false) → "o"
//    theEnd("oh", true) → "o"

    public String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        }
        return str.substring(str.length() - 1, str.length());
    }
//    withouEnd2("Hello") → "ell"
//    withouEnd2("abc") → "b"
//    withouEnd2("ab") → ""

    public String withouEnd2(String str) {
        if (str.length() > 1) {
            return str.substring(1, str.length() - 1);
        }
        return "";
    }
//    middleTwo("string") → "ri"
//    middleTwo("code") → "od"
//    middleTwo("Practice") → "ct"

    public String middleTwo(String str) {
        if (str.length() > 2) {
            return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
        }

        return str;
    }
//    endsLy("oddly") → true
//    endsLy("y") → false
//    endsLy("oddy") → false

    public boolean endsLy(String str) {
        if (str.length() > 1) {
            if (str.substring(str.length() - 2, str.length()).equals("ly")) {
                return true;
            }
            return false;
        }
        if (str.length() < 1) {
            return false;

        }
        return false;
    }
//    nTwice("Hello", 2) → "Helo"
//    nTwice("Chocolate", 3) → "Choate"
//    nTwice("Chocolate", 1) → "Ce"

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n, str.length());
    }

    //    twoChar("java", 0) → "ja"
//    twoChar("java", 2) → "va"
//    twoChar("java", 3) → "ja"
    public String twoChar(String str, int index) {
        if (str.length() - 1 > index && index > 0) {
            return str.substring(index, index + 2);
        }
        return str.substring(0, 2);
    }

    //    middleThree("Candy") → "and"
//    middleThree("and") → "and"
//    middleThree("solving") → "lvi"
    public String middleThree(String str) {
        if (str.length() > 3) {
            return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
        }

        return str;
    }

    //    hasBad("badxx") → true
//    hasBad("xbadxx") → true
//    hasBad("xxbadxx") → false
    public boolean hasBad(String str) {
        return (str.length() >= 3 && str.substring(0, 3).equals("bad")) ||
                (str.length() >= 4 && str.substring(1, 4).equals("bad"));
    }

    //    atFirst("hello") → "he"
//    atFirst("hi") → "hi"
//    atFirst("h") → "h@"
    public String atFirst(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else if (str.length() >= 1) {
            return str.substring(0, 1) + "@";
        } else {
            return "@@";
        }
    }

    //    lastChars("last", "chars") → "ls"
//    lastChars("yo", "java") → "ya"
//    lastChars("hi", "") → "h@"
    public String lastChars(String a, String b) {
        if (a.length() < 1) {
            a = "@";
        }
        if (b.length() < 1) {
            b = "@";
        }

        return a.substring(0, 1) + b.substring(b.length() - 1, b.length());

    }

    public String conCat(String a, String b) {
        if (a.length() > 0 && b.length() > 0 && a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        } else {
            return a + b;
        }
    }

    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }

        String start = str.substring(0, str.length() - 2); // всё, кроме последних двух
        StringBuilder lastTwo = new StringBuilder(str.substring(str.length() - 2));
        lastTwo.reverse(); // переворачиваем последние два символа

        return start + lastTwo.toString();
    }

    public String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }
//    frontAgain("edited") → true
//    frontAgain("edit") → false
//    frontAgain("ed") → true
public boolean frontAgain(String str) {
    return (str.length()>=2 && str.substring(0,2).equals(str.substring(str.length()-2)));
}
//    minCat("Hello", "Hi") → "loHi"
//    minCat("Hello", "java") → "ellojava"
//    minCat("java", "Hello") → "javaello"
public String minCat(String a, String b) {
    int index = 0;
    if (b.length() > a.length()) {
        index = a.length();
    } else {
        index = b.length();
    }
    return a.substring(a.length() - index, a.length())
            + b.substring(b.length() - index, b.length());
}
    public String extraFront(String str) {
        if (str.length()>2){
            return str.substring(0,2)+str.substring(0,2)+str.substring(0,2);
        }else{
            return str+str+str;
        }
    }
    public String without2(String str) {
        if(str.length()>2&& str.substring(0,2).equals(str.substring(str.length()-2))){
            return str.substring(2);
        }else if(str.length()>2&& !str.substring(0,2).equals(str.substring(str.length()-2))){
            return str;
        }else if(str.length()==2){
            return "";
        }else{
            return str;
        }
    }
    public String deFront(String str) {
        if (str.length() >= 2) {
            String front = str.substring(0, 2);
            if (front.equalsIgnoreCase("ab")) {
                return str;
            } else if (front.substring(0, 1).equalsIgnoreCase("a")) {
                return str.substring(0, 1) + str.substring(2);
            } else if (front.substring(1, 2).equalsIgnoreCase("b")) {
                return str.substring(1);
            } else {
                return str.substring(2);
            }
        } else {
            return "";
        }
    }

    public String startWord(String str, String word) {
        if (str.length() >= word.length()) {
            int index = word.length();
            if (str.substring(1, index).equals(word.substring(1))) {
                return str.substring(0, index);
            } else {
                return "";
            }
        } else {
            return "";
        }
    }
    public String withoutX(String str) {
        if (str.length() == 0) {
            return str;
        }

        // Remove first 'x' if present
        if (str.startsWith("x")) {
            str = str.substring(1);
        }

        // Remove last 'x' if present and string is still not empty
        if (str.endsWith("x")) {
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }
    public String withoutX2(String str) {

        int len = str.length();

        if (len >= 2) {
            String result = "";

            if (str.charAt(0) != 'x') {
                result += str.charAt(0);
            }

            if (str.charAt(1) != 'x') {
                result += str.charAt(1);
            }

            result += str.substring(2);
            return result;

        } else if (len == 1) {
            return str.charAt(0) == 'x' ? "" : str;
        }
        return str; // length == 0


    }










}
