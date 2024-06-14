class Social extends Ingresso {

    private double desconto;

    public Social(double preco, double desconto) {
      super(preco * desconto);
      this.desconto = desconto;
    }
    public void vender(int quantidade) {
      quantidadeVendida += quantidade;
      totalIngressosVendidos += quantidade;
    }  

    public void imprimirValor() {
      System.out.println("Valor da entrada social - Planeta Brasil: R$" + preco + " (Desconto de" + (1 -desconto) * 100 + "% devido ao 1kg de alimento perecível doado)");
    }
}  