public class Ejercicio7 {
    public static void main(String[] args) {
        int niveles = 5;  // Puedes cambiar este valor para crear pirámides de diferentes tamaños
        piramideHueca(niveles);
    }

    public static void piramideHueca(int n) {
        if (n < 1) {
            System.out.println("El número de niveles debe ser mayor a 0");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println("*");
            } else if (i == n - 1) {
                for (int j = 0; j < 2 * n - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                System.out.print("*");
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}

