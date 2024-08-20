import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a expressão:");
        String expressao = scanner.nextLine();
        System.out.println("Digite a notação (infixo, posfixo, prefixo):");
        String notacao = scanner.nextLine();

        String expressaoInfixa;
        switch (notacao) {
            case "infixo":
                expressaoInfixa = expressao.replaceAll("", " ").trim();
                break;
            case "posfixo":
                String expressaoPosfixa = Expressao.infixoParaPosfixo(expressao);
                expressaoInfixa = Expressao.posfixoParaInfixo(expressaoPosfixa).replaceAll("", " ").trim();
                break;
            default:
                expressaoInfixa = Expressao.prefixoParaInfixo(expressao).replaceAll("", " ").trim();
        }

        int resultado = Calculadora.calcular(Expressao.infixoParaPosfixo(expressaoInfixa));

        System.out.println("Resultado: " + resultado);
        System.out.println("Expressão infixa: " + expressaoInfixa);
        System.out.println("Expressão pós-fixa: " + Expressao.infixoParaPosfixo(expressaoInfixa.replaceAll(" ", "")));
        System.out.println("Expressão pré-fixa: " + Expressao.infixoParaPrefixo(expressaoInfixa.replaceAll(" ", "")));
    }
}
//( 5 * ( ( ( 9 + 8 ) * ( 4 * 6 ) ) + 7 ) )
//5 9 8 + 4 6 * * 7 + *
//* 5 + * + 9 8 * 4 6 7