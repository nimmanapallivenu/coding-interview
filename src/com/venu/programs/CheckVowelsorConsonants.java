package com.venu.programs;

import java.util.Arrays;
import java.util.List;

public class CheckVowelsorConsonants {

   static List<Character> VOWELS[] = new List[]{Arrays.asList('a', 'e', 'i', 'o', 'u')};

    public static void main(String[] args) {
        System.out.println("A is Vowel ? = " +isVowel('A'));
        System.out.println("h is Vowel ? = " +isVowel('h'));
        System.out.println("r is Vowel ? = " +isVowel('r'));

    }

 private static boolean isVowel(char input){
     switch (input){
         case 'a':
         case 'e':
         case 'i':
         case 'o':
         case 'u':
             return true;
         default:return false;
     }
 }



}
