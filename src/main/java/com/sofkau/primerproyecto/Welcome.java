package com.sofkau.primerproyecto;

//Importación de la clase Scanner
import java.util.Scanner;

public final class Welcome {

    public static void main(String[] args) {
        //Declarar de variables
        String nameUser;
        String cellularPhone;
        Integer age;

        //Instaciar una nueva clase de Scanner
        Scanner scanner = new Scanner(System.in);

        //Solicitar entrada de datos y guardar en variables
        System.out.println("Ingrese nombre de usuario: ");
        nameUser = scanner.nextLine();
        System.out.println("Ingrese Telefono celular: ");
        cellularPhone = scanner.nextLine();
        System.out.println("Ingrese su edad");
        age = scanner.nextInt();

        //Salida
        System.out.println("Bienvenido señor " +nameUser+", es un placer para nosotros contar con una persona de " + age + " años.\n" +
                "\n" +
                "Próximamente nos comunicaremos con usted al numero "+ cellularPhone+".\n" +
                "\n" +
                "Feliz día");

    }
}
