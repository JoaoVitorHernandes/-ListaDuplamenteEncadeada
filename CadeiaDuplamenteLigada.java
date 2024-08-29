public class CadeiaDuplamenteLigada<T> {
    private Elemento<T> inicio;
    private Elemento<T> fim;
    private int comprimento;

    public CadeiaDuplamenteLigada() {
        this.inicio = null;
        this.fim = null;
        this.comprimento = 0;
    }

    public void inserirInicio(T valor) {
        Elemento<T> novoElemento = new Elemento<>(valor);
        if (inicio == null) {
            inicio = novoElemento;
            fim = novoElemento;
        } else {
            novoElemento.proximo = inicio;
            inicio.anterior = novoElemento;
            inicio = novoElemento;
        }
        comprimento++;
    }

    public void inserirFim(T valor) {
        Elemento<T> novoElemento = new Elemento<>(valor);
        if (fim == null) {
            inicio = novoElemento;
            fim = novoElemento;
        } else {
            fim.proximo = novoElemento;
            novoElemento.anterior = fim;
            fim = novoElemento;
        }
        comprimento++;
    }

    public T removerInicio() {
        if (inicio == null) {
            return null;
        }
        T valor = inicio.valor;
        inicio = inicio.proximo;
        if (inicio != null) {
            inicio.anterior = null;
        } else {
            fim = null;
        }
        comprimento--;
        return valor;
    }

    public T removerFim() {
        if (fim == null) {
            return null;
        }
        T valor = fim.valor;
        fim = fim.anterior;
        if (fim != null) {
            fim.proximo = null;
        } else {
            inicio = null;
        }
        comprimento--;
        return valor;
    }

    public boolean estaVazia() {
        return comprimento == 0;
    }

    public int obterComprimento() {
        return comprimento;
    }

    public void imprimirCadeia() {
        Elemento<T> atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void imprimirReverso() {
        Elemento<T> atual = fim;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.anterior;
        }
        System.out.println();
    }
}