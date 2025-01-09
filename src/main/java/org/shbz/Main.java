package org.shbz;

public class Main {
    public static void main(String[] args) {

        Main m = new Main();

        System.out.println(m.add(10,10));
        System.out.println(m.substract(20,10));

    }
    public int add(int x,int y){
        return x+y;
    }
    public int substract(int x,int y){
        return x-y;
    }

}