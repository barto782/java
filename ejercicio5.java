public class ejercicio5 {
    // Códigos de escape ANSI para colores de texto
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static void main(String[] args) {
        // Definir el horario de clases
        String[][] horario = {
            {"Lunes", RED + "Matemáticas" + RESET, GREEN + "Ciencias" + RESET, BLUE + "Inglés" + RESET},
            {"Martes", PURPLE + "Historia" + RESET, YELLOW + "Educación Física" + RESET, CYAN + "Arte" + RESET},
            {"Miércoles", RED + "Matemáticas" + RESET, GREEN + "Ciencias" + RESET, BLUE + "Inglés" + RESET},
            {"Jueves", PURPLE + "Historia" + RESET, YELLOW + "Educación Física" + RESET, CYAN + "Arte" + RESET},
            {"Viernes", RED + "Matemáticas" + RESET, GREEN + "Ciencias" + RESET, PURPLE + "Música" + RESET}
        };

        // Imprimir el horario de clases
        System.out.println("Horario de Clases:");
        for (int i = 0; i < horario.length; i++) {
            System.out.print(horario[i][0] + ": ");
            for (int j = 1; j < horario[i].length; j++) {
                System.out.print(horario[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
