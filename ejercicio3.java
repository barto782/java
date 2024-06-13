public class ejercicio3 {
    public static void main(String[] args) {
        String[] palabrasIngles = {"computer", "student", "cat", "penguin", "machine", "nature", "light", "green", "book", "pyramid"};
        String[] palabrasEspanol = {"ordenador", "alumno/a", "gato", "pingüino", "máquina", "naturaleza", "luz", "verde", "libro", "pirámide"};

        // Imprimir las palabras en inglés y su traducción al español
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-12s %s%n", palabrasIngles[i], palabrasEspanol[i]);
        }
    }
}
