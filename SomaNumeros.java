import java.util.Scanner;

 class SomaNumeros {
  public static void main(String[] args) {
  Scanner prompt = new Scanner(System.in);
  int n, num = 0, soma = 0, i = 0;
  
    System.out.print("Quantos numeros a serem somados: ");
     n = prompt.nextInt();
      while(i<n) {
        i = i + 1;
        System.out.println("Entre com o numero");

        num = prompt.nextInt();
        soma = soma + num;
      }
    System.out.println("A soma da:" +soma);
  }
}