package homer;

class ListaDuplamenteEncadeada {
    No inicio;
    No fim;

    ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    void inserir(String valor) {
        No novoNo = new No(valor);
        if (this.inicio == null) {
            this.inicio = novoNo;
            this.fim = novoNo;
        } else {
            this.fim.proximo = novoNo;
            novoNo.anterior = this.fim;
            this.fim = novoNo;
        }
    }

    void inserirNoInicio(String valor) {
        No novoNo = new No(valor);
        if (this.inicio == null) {
            this.inicio = novoNo;
            this.fim = novoNo;
        } else {
            novoNo.proximo = this.inicio;
            this.inicio.anterior = novoNo;
            this.inicio = novoNo;
        }
    }

    void inserirNaPosicao(String valor, int posicao) {
        if (posicao == 0) {
            inserirNoInicio(valor);
            return;
        }

        No novoNo = new No(valor);
        No atual = this.inicio;
        int indice = 0;

        while (atual != null && indice < posicao - 1) {
            atual = atual.proximo;
            indice++;
        }

        if (atual != null) {
            novoNo.proximo = atual.proximo;
            if (atual.proximo != null) {
                atual.proximo.anterior = novoNo;
            }
            atual.proximo = novoNo;
            novoNo.anterior = atual;

            if (novoNo.proximo == null) {
                this.fim = novoNo;
            }
        }
    }

    void remover(String valor) {
        No atual = this.inicio;

        while (atual != null) {
            if (atual.valor.equals(valor)) {
                if (atual.anterior != null) {
                    atual.anterior.proximo = atual.proximo;
                } else {
                    this.inicio = atual.proximo;
                }

                if (atual.proximo != null) {
                    atual.proximo.anterior = atual.anterior;
                } else {
                    this.fim = atual.anterior;
                }
                break;
            }
            atual = atual.proximo;
        }
    }

    void esvaziar() {
        this.inicio = null;
        this.fim = null;
    }

    boolean estaNaLista(String valor) {
        No atual = this.inicio;
        while (atual != null) {
            if (atual.valor.equals(valor)) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    int tamanho() {
        int tamanho = 0;
        No atual = this.inicio;
        while (atual != null) {
            tamanho++;
            atual = atual.proximo;
        }
        return tamanho;
    }

    void exibir() {
        No atual = this.inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}
