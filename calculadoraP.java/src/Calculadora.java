import java.util.*;

class Calculadora {
    public static int calcular(String expressao) {
    Stack<Integer> pilha = new Stack<>();
    String[] tokens = expressao.split(" ");
    for (String token : tokens) {
        if (isOperador(token)) {
            int operando2 = pilha.pop();
            int operando1 = pilha.pop();
            switch (token) {
                case "+":
                    pilha.push(operando1 + operando2);
                    break;
                case "-":
                    pilha.push(operando1 - operando2);
                    break;
                case "*":
                    pilha.push(operando1 * operando2);
                    break;
                case "/":
                    pilha.push(operando1 / operando2);
                    break;
            }
        } else if (!token.isEmpty()) {
            pilha.push(Integer.parseInt(token));
        }
    }
    return pilha.pop();
}

    private static boolean isOperador(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
}