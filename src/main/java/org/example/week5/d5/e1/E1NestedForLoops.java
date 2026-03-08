package org.example.week5.d5.e1;

public class E1NestedForLoops {
    public static void main(String[] args) {

        int[][]numbers={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12}
                       };

         for(int[]mynumber:numbers){
             for(int no:mynumber){
                 System.out.print(no+" ");

             }
             System.out.println();
         }
    }
}
