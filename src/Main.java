import java.util.Scanner;

public class Main {

    //05. Constructores [PENDIENTE]
    //Crear una clase persona con los siguientes atributos
    //- nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura
    //- Se implmentaran varios constructores
    //    - Vacío
    //    - Con nombre, edad y sexo
    //    - con todos los atributos

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre");
        String nombre=sc.nextLine();

        System.out.println("Edad: ");
        int edad=sc.nextInt();
        sc.nextLine();

        System.out.println("Dni: ");
        String dni=sc.nextLine();

        System.out.println("Sexo: ");
        String sexo=sc.nextLine();

        System.out.println("Peso: ");
        float peso=sc.nextFloat();

        System.out.println("Altura: ");
        float altura=sc.nextFloat();
        Persona persona1 = new Persona(nombre,edad,dni,sexo,peso,altura);

        System.out.println(persona1.calcularIMC());

    }
}
