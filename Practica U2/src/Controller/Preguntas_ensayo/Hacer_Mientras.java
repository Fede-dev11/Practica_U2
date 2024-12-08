package Controller.Preguntas_ensayo;
import java.util.Scanner;
public class Hacer_Mientras {
    
    public void descuento_edad() {
        Scanner sc = new Scanner(System.in);
        
        boolean bandera = false; // Bandera para controlar el ciclo
        int edad = 0;
        Double valor_pagar = 0.0;
        do {
            System.out.println("Ingrese el valor de su compra:");
            double compra = sc.nextDouble();
            System.out.println("Ingrese su edad:");
            edad= sc.nextInt();
            //Fernando Patiño
            if (edad >= 65) {
                bandera = true; // Si el número es mayor que 10, salir del ciclo
                valor_pagar = compra * 0.5;
                System.out.println("Usted tiene un descuento de 50%");
                System.out.println("Por lo tanto el valor a pagar por su compra es de: "+valor_pagar);
            } else {
                System.out.println("No tiene descuento");
            }
        } while (!bandera); // Continuar mientras la bandera sea FALSA
        
        System.out.println("El número ingresado es: " + edad);
    }
    //Fernando Patiño
}


