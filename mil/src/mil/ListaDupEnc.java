package mil;

class ListaDupEnc {
    Node sentinela;

    public ListaDupEnc() {
      
        sentinela = new Node(0);
        sentinela.setProx(sentinela);
        sentinela.setAnt(sentinela);
    }

    public void Ordem(int valor) {
        Node novoNode = new Node(valor);
        Node atual = sentinela.getProx();

  
        while (atual != sentinela && atual.getValor() < valor) {
            atual = atual.getProx();
        }

      
        novoNode.setProx(atual);
        novoNode.setAnt(atual.getAnt());
        atual.getAnt().setProx(novoNode);
        atual.setAnt(novoNode);
    }

    public void Subindo() {
        Node atual = sentinela.getProx();
        while (atual != sentinela) {
            System.out.print(atual.getValor() + " ");
            atual = atual.getProx();
        }
        System.out.println();
    }

    public void Descendo() {
        Node atual = sentinela.getAnt();
        while (atual != sentinela) {
            System.out.print(atual.getValor() + " ");
            atual = atual.getAnt();
        }
        System.out.println();
    }
}