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

        if (edad >= 18) {
            System.out.println("Acceso autorizado");
        }else{
            System.out.println("Acceso restringido");
        }


    }
}