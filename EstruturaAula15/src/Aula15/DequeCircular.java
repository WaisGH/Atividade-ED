package Aula15;
import java.util.ArrayDeque;
import java.util.Deque;

class DequeCircular {
    private Deque<Pessoa> deque;

    public DequeCircular() {
        this.deque = new ArrayDeque<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        deque.add(pessoa);
    }

    public Pessoa removerPessoa() {
        return deque.poll();
    }

    public boolean estaVazio() {
        return deque.isEmpty();
    }

    public int tamanho() {
        return deque.size();
    }

    public Deque<Pessoa> getDeque() {
        return deque;
    }
}
