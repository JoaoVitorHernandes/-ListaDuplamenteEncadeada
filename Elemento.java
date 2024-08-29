class Elemento<T> {
    T valor;
    Elemento<T> proximo;
    Elemento<T> anterior;

    public Elemento(T valor) {
        this.valor = valor;
        this.proximo = null;
        this.anterior = null;
    }
}