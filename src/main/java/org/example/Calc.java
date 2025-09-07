package org.example;

public class Calc {

    public static int run(String expression){

        String[] parts = expression.split("\\+");
        for(int i = 0 ; i < parts.length; i++){ //공백제거
            parts[i] = parts[i].trim();
        }
        int left = Integer.parseInt(parts[0]);
        int right = Integer.parseInt(parts[1]);

        return left + right;
    }
}
