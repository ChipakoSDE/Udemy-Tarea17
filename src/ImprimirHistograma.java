import java.util.Scanner;

public class ImprimirHistograma {
    public static void main(String[] args) {
        int[] a = new int[12];
        String[] b = new String[6];
        Scanner s = new Scanner(System.in);

        volver:
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un número entero entre 1 y 6: ");
            a[i] = s.nextInt();
            if (a[i] < 1 || a[i] > 6) {
                System.out.println("Por favor ingrese un número dentro del rango indicado");
                i--;
                continue volver;
            }
        }

        for (int i = 0; i < b.length; i++) {
            int aux = i + 1;
            String histograma = aux + ": ";
            for (int j = 0; j < a.length; j++) {
                if (aux == a[j]){
                    histograma += "*";
                }
            }
            b[i] = histograma;
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        }

}

