public static void main(String[] args) {
    CadeiaDuplamenteLigada<Integer> cadeia = new CadeiaDuplamenteLigada<>();

    cadeia.inserirInicio(10);
    cadeia.inserirInicio(20);
    cadeia.inserirFim(30);
    cadeia.inserirFim(40);

    System.out.println("Cadeia do início ao fim:");
    cadeia.imprimirCadeia();

    System.out.println("Cadeia do fim ao início:");
    cadeia.imprimirReverso();

    System.out.println("Removendo elementos");
    System.out.println("Elemento removido do início: " + cadeia.removerInicio());
    System.out.println("Elemento removido do fim: " + cadeia.removerFim());

    System.out.println("Cadeia após remoções:");
    cadeia.imprimirCadeia();

    System.out.println("A cadeia está vazia? " + cadeia.estaVazia());

    System.out.println("Comprimento da cadeia: " + cadeia.obterComprimento());

    System.out.println("Removendo todos os elementos");
    cadeia.removerInicio();
    cadeia.removerFim();

    System.out.println("Cadeia após remover todos os elementos:");
    cadeia.imprimirCadeia();

    System.out.println("A cadeia está vazia agora? " + cadeia.estaVazia());
    System.out.println("Tentando remover de uma cadeia vazia");
    System.out.println("Elemento removido do início: " + cadeia.removerInicio());
    System.out.println("Elemento removido do fim: " + cadeia.removerFim());

    cadeia.inserirFim(50);
    cadeia.inserirInicio(60);
    cadeia.inserirFim(70);

    System.out.println("Cadeia após re-inserções:");
    cadeia.imprimirCadeia();
    cadeia.imprimirReverso();
    System.out.println("Comprimento da cadeia após inserir novamente: " + cadeia.obterComprimento());
}