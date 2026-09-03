import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(
                "Edgard",
                "Ingeniería en Informática",
                30
        );

        estudiante.mostrarInformacion();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese carrera: ");
        String carrera = scanner.nextLine();
        System.out.println("Ingrese edad: ");
        int edad = scanner.nextInt();

        Estudiante estudianteUno = new Estudiante(nombre, carrera, edad);
        estudianteUno.mostrarInformacion();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Procesando estudiante " + i);}

        if (edad < 18) {
            System.out.println("Estudiante menor de edad.");
        } else if (edad < 25) {
            System.out.println("Estudiante joven aún.");
        } else {
            System.out.println("Estudiante viejo.");
        }
        int opcion = 4;
        while (opcion != 3) {

            System.out.println("=== SISTEMA DUOC ===");
            System.out.println("1. Mostrar estado");
            System.out.println("2. Procesar operación");
            System.out.println("3. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("Estado disponible.");
            } else if (opcion == 2) {
                System.out.println("Procesando operación...");
            } else if (opcion == 3) {
                System.out.println("Finalizando programa");
            }
        }
    }
}