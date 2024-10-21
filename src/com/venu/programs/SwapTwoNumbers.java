package com.venu.programs;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        // Integer

        int a = 10;
        int b = 20;
        System.out.println("Before Swap a=" + a );
        System.out.println("Before Swap b=" + b );
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap a=" + a );
        System.out.println("After Swap b=" + b );


        // Double
        Double x =12.09d;
        Double y= 32.09;
        System.out.println("Before Swap x=" + x );
        System.out.println("Before Swap y=" + y );
        x =  x+y;
        y=  x-y;
        x= x-y;
        System.out.println("After Swap x=" + x );
        System.out.println("After Swap y" + y );


        // String

        String name1= "Hello";
        String name2= "Word";
        System.out.println("Before Swap name1=" + name1);
        System.out.println("Before Swap name2= " + name2 );
        name1=name1.concat(name2);
        name2=name1.substring(0,name1.length()-name2.length());
        name1=name1.substring(name2.length());
        System.out.println("After Swap name1=" + name1);
        System.out.println("After Swap name2= " + name2 );



    }
}
