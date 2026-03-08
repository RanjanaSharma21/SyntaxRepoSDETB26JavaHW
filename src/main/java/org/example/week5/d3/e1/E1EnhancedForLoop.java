package org.example.week5.d3.e1;

public class E1EnhancedForLoop {
    public static void main(String[] args) {
     int [] arr=new int[11];
      for(int i=0;i<arr.length;i++){
          arr[i]=i+2025;
      }
      for(int year:arr){
          System.out.println(year);
      }
    }
}
