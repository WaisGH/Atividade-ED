package Refeitorio;

class TecnicoAdministrativo {
    private int siape;
    private String nome;

    public TecnicoAdministrativo(int siape, String nome) {
        this.siape = siape;
        this.nome = nome;
    }
    public int getSiape() {
        return siape;
    }
    public String getNome() {
        return nome;
    }
    public void setSiape(int siape) {
        this.siape = siape;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
}