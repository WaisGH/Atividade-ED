package homer;

public class TestaLista {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.inserir("Homer");
        lista.inserir("Marge");
        lista.exibir();

        lista.esvaziar();
        lista.exibir();

        lista.inserir("Homer");
        lista.inserirNaPosicao("Bart", 0);
        lista.inserirNaPosicao("Moll", 1);
        lista.exibir();

        lista.esvaziar();
        lista.exibir();

        lista.inserir("Homer");
        lista.inserir("Bart");
        lista.inserirNoInicio("Lisa");
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());
        lista.esvaziar();
        lista.exibir();

        lista.inserir("Homer");
        lista.inserir("Maggie");
        lista.inserirNaPosicao("Bart", 0);
        lista.inserirNaPosicao("Marge", 1);
        lista.exibir();
        System.out.println("Lisa está na lista? " + lista.estaNaLista("Lisa"));

        lista.esvaziar();
        lista.exibir();

        lista.inserir("Homer");
        lista.inserir("Bart");
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());

        String[] nomes = {"Marge", "Homer", "Bart", "Maggie"};
        boolean todosPresentes = true;
        for (String nome : nomes) {
            if (!lista.estaNaLista(nome)) {
                todosPresentes = false;
                break;
            }
        }
        System.out.println("Todos estão na lista? " + todosPresentes);
        System.out.println("Tamanho da lista: " + lista.tamanho());

        lista.esvaziar();
        lista.exibir();

                lista.inserirNoInicio("Homer");
        lista.inserirNoInicio("Bart");
        lista.inserir("Marge");
        lista.inserirNaPosicao("Maggie", 1);
        lista.inserirNoInicio("Ned Flanders");
        lista.inserir("Sr. Burns");
        lista.exibir();

        lista.remover(lista.fim.valor);
        lista.exibir();

        No removido = lista.inicio.proximo;
        lista.remover(removido.valor);
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());

        String[] nomesVerificar = {"Marge", "Homer", "Bart", "Maggie"};
        boolean todosNaLista = true;
        for (String nome : nomesVerificar) {
            if (!lista.estaNaLista(nome)) {
                todosNaLista = false;
                break;
            }
        }
        System.out.println("Todos estão na lista? " + todosNaLista);
        System.out.println("Tamanho da lista: " + lista.tamanho());

        lista.remover(lista.inicio.valor);
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());

        boolean todosNaLista2 = true;
        for (String nome : nomesVerificar) {
            if (!lista.estaNaLista(nome)) {
                todosNaLista2 = false;
                break;
            }
        }
        System.out.println("Todos estão na lista? " + todosNaLista2);
        System.out.println("Tamanho da lista: " + lista.tamanho());

        lista.esvaziar();
        lista.exibir();
    }
}