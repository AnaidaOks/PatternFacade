package org.example;

public class BinOps {
    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
        int first = Integer.parseInt(a, 2);
        int second = Integer.parseInt(b, 2);
        System.out.println("Nums: " + first + ", " + second);
        System.out.println("Sum: " + (first +second));
        return Integer.toBinaryString(first + second);
    }

    public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/

        int first = Integer.parseInt(a, 2);
        int second = Integer.parseInt(b, 2);
        System.out.println("Nums: " + first + ", " + second);
        System.out.println("Mult: " + (first * second));
        return Integer.toBinaryString(first * second);
    }
}
