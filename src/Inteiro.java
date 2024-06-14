public class Inteiro extends Ingresso {

    

    public Inteiro(double preco) {
      super(preco);
    } 

    public void vender(int quantidade) {
      quantidadeVendida += quantidade;
      totalIngressosVendidos += quantidade;
    }

    public void imprimirValor() {
      System.out.println("Valor do ingresso inteiro: R$" + preco);
    }
}