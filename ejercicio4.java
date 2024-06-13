public class ejercicio4 {
    public static void main(String[] args) {
        // Definir el horario de clases
        String[][] horario = {
            {"Lunes", "Matemáticas", "Ciencias", "Inglés"},
            {"Martes", "Historia", "Educación Física", "Arte"},
            {"Miércoles", "Matemáticas", "Ciencias", "Inglés"},
            {"Jueves", "Historia", "Educación Física", "Arte"},
            {"Viernes", "Matemáticas", "Ciencias", "Música"}
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
