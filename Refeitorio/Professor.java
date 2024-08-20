package Refeitorio;

class Professor {
    private int siape;
    private String nome;
    private String titulacao;

    public Professor(int siape, String nome, String titulacao) {
        this.siape = siape;
        this.nome = nome;
        this.titulacao = titulacao;
    }
    public int getSiape() {
        return siape;
    }

    public String getNome() {
        return nome;
    }

    public String getTitulacao() {
        return titulacao;
    }
    public void setSiape(int siape) {
        this.siape = siape;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}