package org.example;

public class Calc {



    public static int run(String expression){

        String[] parts = expression.split(" ");
        System.out.println(parts);

        int left = Integer.parseInt(parts[0]);
        int right = Integer.parseInt(parts[2]);

        if(parts[1].equals("+")) return left + right;
        if(parts[1].equals("-")) return left - right;


        return left + right;
    }
}
