package homer;

class No {
    String valor;
    No anterior;
    No proximo;

    No(String valor) {
        this.valor = valor;
        this.anterior = null;
        this.proximo = null;
    }
}
