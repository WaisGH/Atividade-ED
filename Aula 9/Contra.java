import java.util.Stack;
public class Contra {
    public static void main(String[] args) {
        String input = "ESTE EXERCICIO E MUITO FACIL";
        System.out.println(reverso(input));
    }

    public static String reverso(String input) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                stack.push(input.charAt(i));
            } else {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
                if (i != input.length() - 1 && input.charAt(i + 1) != ' ') {
                    result.append(' ');
                }
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString().trim();
    }
}