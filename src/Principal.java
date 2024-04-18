
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int opcion = 0;
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        String menu = """
                        **************************************
                        Sea bienvenido
                        1) Dólar =>> Peso argentino
                        2) Peso argentino =>> Dólar
                        3) Dólar =>> Real brasileño
                        4) Real brasileño =>> Dólar
                        5) Dólar =>> Peso colombiano
                        6) Peso colombiano =>> Dólar
                        7) Salir
                        Elija una opcion válida
                        **************************************
                """;
        System.out.println(menu);
        Scanner teclado = new Scanner(System.in);


        try{
            var numeroMoneda = Integer.valueOf(lectura.nextLine());
            Moneda moneda = consulta.buscaMoneda(numeroMoneda);
            System.out.println(moneda);
        } catch (NumberFormatException e) {
            System.out.println("Moneda no encontrada "+e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicación.");
        }
    }
}



