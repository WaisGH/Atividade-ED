package mil;

public class Node {
    private int valor;
    private Node prox;
    private Node ant;

    public Node(int valor) {
        this.valor = valor;
        this.prox = this.ant = null;
    }

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Node getProx() {
		return prox;
	}

	public void setProx(Node prox) {
		this.prox = prox;
	}

	public Node getAnt() {
		return ant;
	}

	public void setAnt(Node ant) {
		this.ant = ant;
	}
    
}
