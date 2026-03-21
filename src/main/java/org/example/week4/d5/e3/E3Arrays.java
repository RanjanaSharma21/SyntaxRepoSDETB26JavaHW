package org.example.week4.d5.e3;

public class E3Arrays {
    public static void main(String[] args) {
    char[] letters={'s','a','y','b','n','c','t','d','a','e','x'};
    for(int i=0;i<letters.length;){
        System.out.print(letters[i]);
        i+=2;
    }

       // char[] letters = {'s','a','y','b','n','c','t','d','a','e','x'};

        System.out.print(letters[0]);
        System.out.print(letters[2]);
        System.out.print(letters[4]);
        System.out.print(letters[6]);
        System.out.print(letters[8]);
        System.out.print(letters[10]);
    }
}