import java.util.Scanner;

class mdc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        int mdc = calculaMDC(a, b);
        System.out.println("O MDC de " + a + " e " + b + " é: " + mdc);
    }

    public static int calculaMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
