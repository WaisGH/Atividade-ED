package Aula15;

class Pessoa {
    private int id;
    private String sexo;
    private int idade;
    private boolean gestante;
    private boolean lactante;
    private boolean necessidadeEspecial;
    private int prioridade;

    public Pessoa(int id, String sexo, int idade, boolean gestante, boolean lactante, boolean necessidadeEspecial) {
        this.id = id;
        this.sexo = sexo;
        this.idade = idade;
        this.gestante = gestante;
        this.lactante = lactante;
        this.necessidadeEspecial = necessidadeEspecial;
        setPrioridade();
    }

    public int getPrioridade() {
        return prioridade;
    }

    private void setPrioridade() {
        if (gestante || lactante) {
            this.prioridade = 3;
        } else if (necessidadeEspecial) {
            this.prioridade = 2;
        } else if (idade >= 60) {
            this.prioridade = 1;
        } else {
            this.prioridade = 0;
        }
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Sexo: " + sexo + ", Idade: " + idade +
               ", Gestante: " + (gestante ? "Sim" : "Não") +
               ", Lactante: " + (lactante ? "Sim" : "Não") +
               ", Necessidade Especial: " + (necessidadeEspecial ? "Sim" : "Não") +
               ", Prioridade: " + prioridade;
    }
}

