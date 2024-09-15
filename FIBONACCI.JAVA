import java.util.Scanner;

class fibonacci{
    public static void main(String[] args){
    int n, a = 0, b = 1, i = 2;
    Scanner prompt = new Scanner(System.in);
    System.out.println("Número de termos: ");
    n = prompt.nextInt();

    while(i<n){
        i = i +1;
        System.out.print(a + ", " + b + ", ");
        a = a + b;
        b = a + b;
        i = i + 2;
    }
    if (i == n)
        System.out.print(a + "," +b);
    else
        System.out.print(a);
    }
}   