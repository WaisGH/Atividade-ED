//356

import java.util.Scanner;

class Aluno {
    String nome;
    int pr1;
    int pr2;
    int media;
    String situacao;

    void calcularMedia() {
        this.media = Math.round((this.pr1 + this.pr2) / 2.0f);
    }

    void determinarSituacao() {
        this.situacao = this.media >= 6 ? "AP" : "RP";
    }
}

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno[] alunos = new Aluno[5];

        for (int i = 0; i < 5; i++) {
            alunos[i] = new Aluno();
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            alunos[i].nome = scanner.nextLine();

            System.out.println("Digite a nota PR1 do aluno " + (i + 1) + ":");
            alunos[i].pr1 = scanner.nextInt();

            System.out.println("Digite a nota PR2 do aluno " + (i + 1) + ":");
            alunos[i].pr2 = scanner.nextInt();

            alunos[i].calcularMedia();
            alunos[i].determinarSituacao();

            scanner.nextLine();
        }

        imprimirAlunos(alunos);

        scanner.close();
    }

    static void imprimirAlunos(Aluno[] alunos) {
        System.out.println("\nNome\tPR1\tPR2\tMédia\tSituação");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.nome + "\t" + aluno.pr1 + "\t" + aluno.pr2 + "\t" + aluno.media + "\t" + aluno.situacao);
        }
    }
}