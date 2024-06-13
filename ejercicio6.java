public class Piramide {
    public static void main(String[] args) {
        int base = 9; // Número de asteriscos en la base de la pirámide

        for (int i = 1; i <= base; i += 2) {
            // Imprimir espacios en blanco para centrar la pirámide
            for (int j = 0; j < (base - i) / 2; j++) {
                System.out.print(" ");
            }

            // Imprimir asteriscos para formar la parte superior de la pirámide
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            // Cambiar de línea para la siguiente fila de la pirámide
            System.out.println();
        }
    }
}

