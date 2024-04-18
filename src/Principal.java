import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int opcion = 0;
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        String menu = """
                        **************
                        Sea bienvenido
                        1) Dólar =>> Peso argentino
                        2) Peso argentino =>> Dólar
                        3) Dólar =>> Real brasileño
                        4) Real brasileño =>> Dólar
                        5) Dólar =>> Peso colombiano
                        6) Peso colombiano =>> Dólar
                        7) Salir
                        Elija una opcion válida
                        **************
                """;

        while(opcion != 7){
            System.out.println(menu);
            try{
                opcion = Integer.valueOf(lectura.nextLine());
                if(opcion == 7){
                    break;
                }
                Moneda moneda = consulta.buscaMoneda(opcion);
                System.out.println("Ingrese la cantidad que desea convertir");
                double cantidad = Double.valueOf(lectura.nextLine());
                double resultado = moneda.convertir(opcion, cantidad);
                System.out.println("El resultado de la conversion es: " + resultado);
                if (opcion == 1 | opcion == 2 ) {
                    System.out.println("Ingrese la cantidad para comparar:");
                    double cantidadComparar = Double.valueOf(lectura.nextLine());
                    double resultadoComparar = moneda.convertir(cantidadComparar);
                    System.out.println("El resultado de la comparación es: " + resultadoComparar);
                }
            } catch (NumberFormatException e) {
                System.out.println("Moneda no encontrada "+e.getMessage());
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.println("Finalizando la aplicación.");
            }
        }
    }
}