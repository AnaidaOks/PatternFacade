package org.example;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println("Binary sum: " + bins.sum("11001010001", "101010001101"));
        System.out.println("Binary mult: " + bins.mult("110110", "10101"));
    }
}