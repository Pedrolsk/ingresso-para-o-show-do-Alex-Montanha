import java.io.IOException;
import java.util.Scanner;

public class Tela {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Logger logger = null;

    try {
      logger = new Logger("log.txt");
      System.out.println("Arquivo de log criado em: " + logger.getFilePath());

      System.out.println("Digite o tipo do ingresso/entrada desejado: ");
      logger.log("Digite o tipo do ingresso/entrada desejado: ");
      System.out.println("1 - Inteiro");
      logger.log("1 - Inteiro");
      System.out.println("2 - Meia");
      logger.log("2 - Meia");
      System.out.println("3 - Social");
      logger.log("3 - Social");

      int tipoIngresso = sc.nextInt();
      logger.log("Tipo de ingresso escolhido: " + tipoIngresso);

      System.out.println("Digite a quantidade de ingresso/entrada desejado: ");
      logger.log("Digite a quantidade de ingresso/entrada desejado: ");
      int quantidade = sc.nextInt();
      logger.log("Quantidade de ingressos escolhida: " + quantidade);

      Ingresso ingresso = null;
      switch (tipoIngresso) {
        case 1:
          ingresso = new Inteiro(100.0);
          break;
        case 2:
          ingresso = new Meia(100.0);
          break;
        case 3:
          ingresso = new Social(100.0, 0.9);
          break;
        default:
          String msg = "O tipo de ingresso desejado é inválido no nosso sistema";
          System.out.println(msg);
          logger.log(msg);
          break;
      }

      if (ingresso != null) {
        ingresso.vender(quantidade);
        ingresso.imprimirValor();
        String msg1 = "Quantidade de ingressos/meias vendidos: " + quantidade;
        System.out.println(msg1);
        logger.log(msg1);

        String msg2 = "Total de ingressos/meias vendidos: " + Ingresso.getTotalIngressosVendidos();
        System.out.println(msg2);
        logger.log(msg2);
      }

    } catch (IOException e) {
      System.err.println("Erro ao inicializar o logger: " + e.getMessage());
    } finally {
      if (logger != null) {
        logger.close();
      }
      sc.close();
    }
  }
}