package Refeitorio;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class Refeitorio {
    private Queue<Object> filaAcessoRefeitorio;

    public Refeitorio() {
        filaAcessoRefeitorio = new LinkedList<>();
    }

    public void adicionarPessoa(Object pessoa) {
        filaAcessoRefeitorio.add(pessoa);
    }

    public void imprimirFila() {
        for (Object pessoa : filaAcessoRefeitorio) {
            if (pessoa instanceof Aluno) {
                Aluno aluno = (Aluno) pessoa;
                System.out.println("Aluno: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula() + ", Curso: " + aluno.getCurso());
            } else if (pessoa instanceof Professor) {
                Professor professor = (Professor) pessoa;
                System.out.println("Professor: " + professor.getNome() + ", SIAPE: " + professor.getSiape() + ", Titulação: " + professor.getTitulacao());
            } else if (pessoa instanceof TecnicoAdministrativo) {
                TecnicoAdministrativo tecnico = (TecnicoAdministrativo) pessoa;
                System.out.println("Técnico Administrativo: " + tecnico.getNome() + ", SIAPE: " + tecnico.getSiape());
            }
        }
    }

    public static void main(String[] args) {
        Refeitorio refeitorio = new Refeitorio();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar Aluno");
            System.out.println("2 - Adicionar Professor");
            System.out.println("3 - Adicionar Técnico Administrativo");
            System.out.println("4 - Imprimir lista");
            
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do aluno:");
                    String nomeAluno = scanner.nextLine();
                    System.out.println("Digite a matrícula do aluno:");
                    int matriculaAluno = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o curso do aluno:");
                    String cursoAluno = scanner.nextLine();
                    refeitorio.adicionarPessoa(new Aluno(matriculaAluno, nomeAluno, cursoAluno));
                    break;
                case 2:
                    System.out.println("Digite o nome do professor:");
                    String nomeProfessor = scanner.nextLine();
                    System.out.println("Digite o SIAPE do professor:");
                    int siapeProfessor = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite a titulação do professor:");
                    String titulacaoProfessor = scanner.nextLine();
                    refeitorio.adicionarPessoa(new Professor(siapeProfessor, nomeProfessor, titulacaoProfessor));
                    break;
                case 3:
                    System.out.println("Digite o nome do técnico administrativo:");
                    String nomeTecnico = scanner.nextLine();
                    System.out.println("Digite o SIAPE do técnico administrativo:");
                    int siapeTecnico = scanner.nextInt();
                    scanner.nextLine(); 
                    refeitorio.adicionarPessoa(new TecnicoAdministrativo(siapeTecnico, nomeTecnico));
                    break;
                case 4:
                    System.out.println("Imprimindo a lista:");
                    refeitorio.imprimirFila();
                    break;
                case 0:
                    System.out.print("Finalizando o programa");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        refeitorio.imprimirFila();
        scanner.close();
    }
    
}