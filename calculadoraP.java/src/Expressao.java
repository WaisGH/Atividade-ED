import java.util.*;

class Expressao {
    private static boolean isOperador(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private static int precedencia(char operador) {
        switch (operador) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }

    public static String infixoParaPosfixo(String infixo) {
        StringBuilder posfixo = new StringBuilder();
        Stack<Character> pilha = new Stack<>();

        for (char c : infixo.toCharArray()) {
            if (Character.isDigit(c)) {
                posfixo.append(c).append(' ');
            } else if (isOperador(c)) {
                while (!pilha.isEmpty() && precedencia(c) <= precedencia(pilha.peek())) {
                    posfixo.append(pilha.pop()).append(' ');
                }
                pilha.push(c);
            } else if (c == '(') {
                pilha.push(c);
            } else if (c == ')') {
                while (!pilha.isEmpty() && pilha.peek() != '(') {
                    posfixo.append(pilha.pop()).append(' ');
                }
                if (!pilha.isEmpty() && pilha.peek() != '(') {
                    return "Expressão inválida";
                } else {
                    pilha.pop();
                }
            }
        }

        while (!pilha.isEmpty()) {
            posfixo.append(pilha.pop()).append(' ');
        }

        return posfixo.toString().trim();
    }

    public static String infixoParaPrefixo(String infixo) {
        infixo = new StringBuilder(infixo).reverse().toString();
        infixo = infixo.replace('(', '#').replace(')', '(').replace('#', ')');
        String posfixo = infixoParaPosfixo(infixo);
        return new StringBuilder(posfixo).reverse().toString();
    }

    public static String posfixoParaInfixo(String posfixo) {
        Stack<String> pilha = new Stack<>();

        for (char c : posfixo.toCharArray()) {
            if (Character.isDigit(c)) {
                pilha.push(Character.toString(c));
            } else if (isOperador(c)) {
                String operando1 = pilha.pop();
                String operando2 = pilha.pop();
                String expressao = "(" + operando2 + c + operando1 + ")";
                pilha.push(expressao);
            }
        }

        return pilha.pop();
    }

    public static String prefixoParaInfixo(String prefixo) {
    Stack<String> pilha = new Stack<>();

    for (int i = prefixo.length() - 1; i >= 0; i--) {
        char c = prefixo.charAt(i);
        if (Character.isDigit(c)) {
            pilha.push(Character.toString(c));
        } else if (isOperador(c)) {
            if (pilha.isEmpty()) {
                return "Expressão inválida"; // Return an error message if the stack is empty
            }
            String operando1 = pilha.pop();
            if (pilha.isEmpty()) {
                return "Expressão inválida"; // Return an error message if the stack is empty
            }
            String operando2 = pilha.pop();
            String expressao = "(" + operando1 + c + operando2 + ")";
            pilha.push(expressao);
        }
    }

    if (pilha.size() != 1) {
        return "Expressão inválida"; // If there's more than one element in the stack, the expression is not valid
    }

    return pilha.pop();
}
}