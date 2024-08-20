package Lista;

public class Lista {
    public static void main(String[] args) {
        Fila fila = new Fila(10);

        fila.filaC("João");
        fila.filaC("Akai");
        fila.filaC("Wais");
        fila.filaC("Wicolly");
        fila.filaC("Maria");
        fila.filaC("Rafa");
        fila.filaC("Arthur");
        fila.filaC("Yuuki");
        fila.filaC("Argentine");
        fila.filaC("anti-digimon");

        while (!fila.vazio()) {
            for (int i = 0; i < fila.tamanho; i++) {
                System.out.print("|" + fila.elementos[i] + "|");
            }
            System.out.println();

            fila.filaV();
        }
    }
}