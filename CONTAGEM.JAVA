import java.util.Scanner;

class contagem {
  public static void main(String[] args) {
    Scanner prompt = new Scanner(System.in);
    int nota, cont = 0, i = 0;
    System.out.println("Quantidade de Alunos: ");
    int n = prompt.nextInt();

    while (i < n) {
      i = i + 1;
      System.out.println("Nota  do Aluno: " + i);
      nota = prompt.nextInt();
      if (nota < 50) {
        cont = cont + 0;
      } else {
        cont = cont + 1;
      }
    }

    System.out.println("Sao " + n + "alunos");
    System.out.println("Sao " + cont + "aprovados");

    prompt.close();
  }
}