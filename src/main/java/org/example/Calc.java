package org.example;

public class Calc {


    public static int run(String expression) {

        String[] parts = expression.split(" ");
        System.out.println(parts);

        if (parts.length > 3) {
            int partial = 0;
            if (parts[1].equals("+")) {
                partial = add(parts);
            } else if (parts[1].equals("-")) {
                partial = minus(parts);
            } else if (parts[1].equals("*")){
                partial = multiply(parts);
            }
            StringBuilder nextExpression = new StringBuilder();
            nextExpression.append(partial);
            for (int i = 3; i < parts.length; i++) {
                nextExpression.append(" ").append(parts[i]);
            }
            return run(nextExpression.toString());
        }

        int left = Integer.parseInt(parts[0]);
        int right = Integer.parseInt(parts[2]);

        if (parts[1].equals("+")) return left + right;
        if (parts[1].equals("-")) return left - right;
        if (parts[1].equals("*")) return left * right;

        return 0;
    }

    private static int add(String[] parts) {
        int left = Integer.parseInt(parts[0]);
        int right = Integer.parseInt(parts[2]);

        return left + right;
    }

    private static int minus(String[] parts) {
        int left = Integer.parseInt(parts[0]);
        int right = Integer.parseInt(parts[2]);

        return left - right;
    }

    private static int multiply(String[] parts) {
        int left = Integer.parseInt(parts[0]);
        int right = Integer.parseInt(parts[2]);

        return left * right;
    }


}

