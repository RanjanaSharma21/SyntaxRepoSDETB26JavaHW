package org.example.week5.d3.e3;

public class E3Break {
    public static void main(String[] args) {

    double[]temp={36.5,37.0,37.5,38.0,39.5,40.0,40.5};
    for(double t:temp) {
        if (t < 39.5) {
            System.out.println("Temperature is normal: "+t+"°C");
        }
        else{
            System.out.println("Critical temperature reached: "+t+"°C. Stopping monitoring.");
            break;}
    }
    }
}
