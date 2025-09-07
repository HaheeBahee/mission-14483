package org.example;

public class Calc {


    public static int run(String expression) {

        //공백 기준으로 분리
        String[] parts = expression.split(" ");

        //항이 3개 이상인 경우
        if (parts.length > 3) {
            int partial = 0;
            if (parts[1].equals("+")) {
                partial = add(parts);
            } else if (parts[1].equals("-")) {
                partial = minus(parts);
            } else if (parts[1].equals("*")) {
                partial = multiply(parts);
            }
            StringBuilder nextExpression = new StringBuilder();
            nextExpression.append(partial);
            for (int i = 3; i < parts.length; i++) {
                nextExpression.append(" ").append(parts[i]);
            }
            return run(nextExpression.toString()); //새로 만든 식을 다시 run()에 넘겨 재귀 호출
        }

        //base case : 항이 정확히 3개인 경우
        int left = Integer.parseInt(parts[0]);
        int right = Integer.parseInt(parts[2]);

        if (parts[1].equals("+")) return left + right;
        if (parts[1].equals("-")) return left - right;
        if (parts[1].equals("*")) return left * right;

        return 0;
    }


    //더하기
    private static int add(String[] parts) {
        int left = Integer.parseInt(parts[0]);
        int right = Integer.parseInt(parts[2]);

        return left + right;
    }

    //빼기
    private static int minus(String[] parts) {
        int left = Integer.parseInt(parts[0]);
        int right = Integer.parseInt(parts[2]);

        return left - right;
    }

    //곱하기
    private static int multiply(String[] parts) {
        int left = Integer.parseInt(parts[0]);
        int right = Integer.parseInt(parts[2]);

        return left * right;
    }


}

