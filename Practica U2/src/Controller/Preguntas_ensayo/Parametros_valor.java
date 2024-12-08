package Controller.Preguntas_ensayo;

public class Parametros_valor {
    public static void modificarValor(int numero) {
        numero = 10; // Cambia el valor de 'numero', pero no afecta a la variable original
    }

    public static void main(String[] args) {
        int valor = 5;
        
        System.out.println("Valor antes de llamar a la función: " + valor);
        
        // Llamada a la función, pasando el valor de 'valor' como parámetro
        modificarValor(valor);
        
        // El valor de 'valor' no cambia porque se pasa por valor (copia)
        System.out.println("Valor después de llamar a la función: " + valor);
    }
}
