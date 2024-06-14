public class Ingresso {

    protected double preco;
    protected int quantidadeVendida = 0;
    protected static int totalIngressosVendidos = 0;
  
    public Ingresso(){};
  
    public Ingresso(double preco) {
      this.preco = preco;
    }
    public double getPreco() {
      return preco;
    }
  
    public void setPreco(double preco) {
      this.preco = preco;
    }
  
    public void imprimirValor() {
      System.out.println("Preço do ingresso selecionado: " + preco);
    }
  
    public int getQuantidadeVendida() {
      return quantidadeVendida;
    }
  
    public static int getTotalIngressosVendidos() {
      return totalIngressosVendidos;
    }
  
  public void vender(int quantidade) {
      
      throw new UnsupportedOperationException("Unimplemented method 'vender'");
  }
  }