package com.autobots.CodingBat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Functional1 {
    public static void main(String[] args) {
        String [] string1={"ax", "bb", "cx"};

        System.out.println(noX(Arrays.asList(string1)));

    }
    public List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }
    public List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        return nums;
    }
    public List<String> addStar(List<String> strings) {
        strings.replaceAll(s -> s+"*");
        return strings;
    }
    public List<String> copies3(List<String> strings) {
        strings.replaceAll(s -> s+s+s);
        return strings;
    }
    public List<String> moreY(List<String> strings) {
        strings.replaceAll(s -> "y"+s+"y");
        return strings;
    }
    public List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n -> (n + 1) * 10);
        return nums;
    }
    public List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n -> n%10);
        return nums;
    }

    public List<String> lower(List<String> strings) {
        strings.replaceAll(s -> s.toLowerCase());
        return strings;
    }
    public static List<String> noX(List<String> strings) {
       return strings.stream()
                .map(s -> s.replace("x", ""))
                .collect(Collectors.toList());

    }

}


