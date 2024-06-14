public class Meia extends Ingresso {


    public Meia(double preco) {
      super(preco * 0.5);
    }

    public void vender(int quantidade) {
      quantidadeVendida += quantidade;
      totalIngressosVendidos += quantidade;
    }

    public void imprimirValor() {
      System.out.println("Valor da meia entrada Planeta Brasil: R$" + preco);
    }
}