package org.example.week5.d3.e6;

public class E6Continue {
    public static void main(String[] args) {
    String[]items={"Item1","Out of Stock","Item2","Item3","Out of Stock","Item4"};
    for(String item:items){
        if(item.equals("Out of Stock")){
            continue;
        }else{
            System.out.println("Processing "+ item);
        }

    }

    }
}
