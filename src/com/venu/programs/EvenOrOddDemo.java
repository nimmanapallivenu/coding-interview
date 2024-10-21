package com.venu.programs;

import java.util.stream.IntStream;

public class EvenOrOddDemo {
    public static void main(String[] args) {

        //Event numbers 1 to 10

        System.out.println("Print Event number ---");
        for(int i=0;i<10;i++){
            if(i%2 ==0){
                System.out.println(i);
            }
        }

        System.out.println("Print 1 to 10 Odd Numbers---");
        // Print odd numbers 1 to 10

        for(int i=0;i<10;i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }

        // Stream
        System.out.println("Print event numbers using java 8 streams..");
        IntStream.range(0,10).filter(i -> i%2 ==0)
                .forEach(System.out::println);

    }
}
