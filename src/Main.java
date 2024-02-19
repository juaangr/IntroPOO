import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        //Scanner miScanner = new Scanner(System.in);

        //String nombredelescaner;
        Persona persona1 = new Persona("Juan", 11);

        String nombrePersona = persona1.getNombre();
        System.out.println("El nombre de la persona1 es: " + nombrePersona);

        System.out.println("La edad de la persona1 es: " + persona1.getEdad());

        //Vamos a cambiar el nombre a persona1
        persona1.setNombre("Carlos");

        System.out.println("El nombre cambiado a Carlos de persona1 es: " + persona1.getNombre());

    }

}