package principalConsola;

import consultaApi.ConsultaMoneda;
import modelRecord.Moneda;

import java.util.Scanner;

public class ConversorApp {
    static ConsultaMoneda consulta = new ConsultaMoneda();
    private static double resultado;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        do{

            try {
                mostrarMenu();
                opcion = Integer.parseInt(teclado.nextLine());
                if(opcion == 7){
                    System.out.println("Saliendo de la app...");
                    break;
                }else if(opcion >=1 && opcion <=7) {

                    System.out.println("Digite el valor a convertir");

                       double valor = teclado.nextDouble();
                       double resultado = 0;
                       switch (opcion) {
                           case 1 -> resultado = valor * obtenerValor("USD", "ARS");
                           case 2 -> resultado = valor * obtenerValor("ARS", "USD");
                           case 3 -> resultado = valor * obtenerValor("USD", "BRL");
                           case 4 -> resultado = valor * obtenerValor("BRL", "USD");
                           case 5 -> resultado = valor * obtenerValor("USD", "COP");
                           case 6 -> resultado = valor * obtenerValor("COP", "USD");
                           default -> System.out.println("Opcion incorrecta");
                       }
                       System.out.println("**********************************************");
                       System.out.println("Resultado: " + resultado);
                       System.out.println("**********************************************");


                   }else {
                    System.out.println("Opcion incorrecta");
                    System.out.println("------------------------------------");
                }

        } catch(Exception e){
            System.out.println("Opcion invalida");
            System.out.println("Error: " + e.getMessage());
            teclado.next();
            System.out.println("------------------------------------");
        }

    }while(true);
        teclado.close();
    }

    static void mostrarMenu(){
        System.out.print(
                """
                        *Escoja una opción de conversión*
                        1. Dolar a Peso Argentino
                        2. Peso Argentino a Dolar
                        3. Dolar a Real Brasileño
                        4. Real Brasileño a Dolar
                        5. Dolar a Peso Colombiano
                        6. Peso Colombiano a Dolar 
                        7. Salir
                        ****************************
                        """);
    }

    //Metodo para consultar el valor de conversión de una moneda base a otra
    public static double obtenerValor(String baseMoneda , String destino) {

        //Consultar las tasas de conversión desde la API
        Moneda moneda = consulta.buscaMoneda(baseMoneda);
        //verificar conversion
        if (moneda.conversion_rates() != null && !moneda.conversion_rates().isEmpty()) {
           System.out.println("Tasas de conversión de " + baseMoneda + " a " + destino + ":");
            //Obtener el valor de conversión hacia la moneda destino
            //Ejemplo: USD a COP  o COP a USD
            Double tasa = moneda.conversion_rates().get(destino.toUpperCase());
            return tasa;
        } else {
            System.out.println("No se encontraron tasas de conversión.");
        }
        return 0;
    }
}
