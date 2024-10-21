package com.venu.programs;

public class ReverseNumberDemo {

    public static void main(String[] args) {

        System.out.println(reverse(123));
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        int out = 0;
        int input = x < 0 ? -x : x;
        while (input != 0) {
            out = out * 10 + input%10;
            input = input / 10;
        }
        return x < 0 ? -out : out;
    }
}
