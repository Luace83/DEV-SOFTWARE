import java.util.Arrays;

public class QuicksortSimples {
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        quicksort(array, 0, array.length - 1);
        System.out.println("Array ordenado: " + Arrays.toString(array));
    }

    public static void quicksort(int[] arr, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particiona(arr, inicio, fim);
            quicksort(arr, inicio, pivo - 1);
            quicksort(arr, pivo + 1, fim);
        }
    }

    public static int particiona(int[] arr, int inicio, int fim) {
        int pivo = arr[fim];
        int i = (inicio - 1);
        for (int j = inicio; j < fim; j++) {
            if (arr[j] < pivo) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[fim];
        arr[fim] = temp;
        return i + 1;
    }
}
