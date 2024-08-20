package Lista;

class Fila {
    String[] elementos;
    int tamanho;

    public Fila(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void inicializar(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void filaC(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            System.out.print("A fila está cheia.");
        }
    }

    public String filaV() {
        if (this.tamanho > 0) {
            String elemento = this.elementos[0];
            this.tamanho--;

            for (int i = 0; i < this.tamanho; i++) {
                this.elementos[i] = this.elementos[i + 1];
            }

            return elemento;
        } else {
            System.out.println("A fila está vazia.");
            return null;
        }
    }

    public boolean vazio() {
        return this.tamanho == 0;
    }

    public void Lista(int i) {
    }
}
