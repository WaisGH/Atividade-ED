package Aula15;

import java.util.*;

public class PostoSaude {
    public static void main(String[] args) {
        DequeCircular filaAtendimento = new DequeCircular();
        List<Pessoa> naoAtendidas = new ArrayList<>();
        Random rand = new Random();

        int totalAtendidos = 0;
        int pessoasPorGrupo = 1;

        for (int i = 0; i < 100; i++) {
            boolean gestante = (i % 10 == 1);
            boolean lactante = (i % 10 == 2);
            boolean necessidadeEspecial = (i % 10 == 0);
            String sexo = (rand.nextInt(2) == 0) ? "M" : "F";
            int idade = rand.nextInt(100);
            
            Pessoa pessoa = new Pessoa(i + 1, sexo, idade, gestante, lactante, necessidadeEspecial);
            filaAtendimento.adicionarPessoa(pessoa);
        }


        while (totalAtendidos < 100 && !filaAtendimento.estaVazio()) {
            int atendidosNoGrupo = 0;
            int pessoasAAtenderNoGrupo = Math.min(pessoasPorGrupo, 100 - totalAtendidos);

            List<Pessoa> grupo = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                if (!filaAtendimento.estaVazio()) {
                    grupo.add(filaAtendimento.removerPessoa());
                }
            }

            grupo.sort(Comparator.comparingInt(Pessoa::getPrioridade).reversed());

            for (Pessoa pessoa : grupo) {
                if (atendidosNoGrupo < pessoasAAtenderNoGrupo) {
                    System.out.println("Atendido: " + pessoa);
                    atendidosNoGrupo++;
                    totalAtendidos++;
                } else {
                    naoAtendidas.add(pessoa);
                }
            }

            pessoasPorGrupo++;
        }


        System.out.println("\nPessoas não atendidas:");
        for (Pessoa pessoa : naoAtendidas) {
            System.out.println(pessoa);
        }
    }
}
