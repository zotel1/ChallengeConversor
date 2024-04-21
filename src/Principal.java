import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0;

        Scanner lectura = new Scanner(System.in);
        ConversorMonedas conversor = new ConversorMonedas();
        ConsultaMoneda consulta = new ConsultaMoneda();


        try{
            while(opcion != 7){
            String menu =
            """
                        ***********************************************************************
                                                   Sea bienvenido
                                                   
                                            1) Dólar =>> Peso argentino
                                            2) Peso argentino =>> Dólar
                                            3) Dólar =>> Real brasileño
                                            4) Real brasileño =>> Dólar
                                            5) Dólar =>> Boliviano boliviano
                                            6) Boliviano boliviano =>> Dólar
                                            7) Salir
                                            
                        ***********************************************************************
                """;
            System.out.println(menu);
            opcion = lectura.nextInt();
            if (opcion < 1 || opcion > 7){
                System.out.println("Elija una opcion válida.\n");
            } else if (opcion != 7 ) {
                System.out.println("Ingrese el valor que desea convertir: ");
                int ingresaValor = lectura.nextInt();
                if (opcion == 1 ) {
                    double valorDeApiUSD  = consulta.buscaMoneda("USD").conversion_rates().ARS;
                    conversor.obtenerValorConvertido(valorDeApiUSD, ingresaValor, "USD","ARS");
                } else if (opcion == 2) {
                    double valorDeApiARS = consulta.buscaMoneda("ARS").conversion_rates().USD;
                        conversor.obtenerValorConvertido(valorDeApiARS, ingresaValor, "ARS", "USD");
                } else if (opcion == 3) {
                    double valorDeApiUSD = consulta.buscaMoneda("USD").conversion_rates().BRL;
                    conversor.obtenerValorConvertido(valorDeApiUSD, ingresaValor,"USD", "BRL");
                } else if (opcion == 4) {
                    double valorDeApiBRL = consulta.buscaMoneda("BRL").conversion_rates().USD;
                    conversor.obtenerValorConvertido(valorDeApiBRL, ingresaValor, "BRL", "USD");
                } else if (opcion == 5) {
                    double valorDeApiUSD = consulta.buscaMoneda("USD").conversion_rates().BOB;
                    conversor.obtenerValorConvertido(valorDeApiUSD, ingresaValor, "USD", "BOB");
                } else  {
                    double valorDeApiBOB = consulta.buscaMoneda("BOB").conversion_rates().USD;
                    conversor.obtenerValorConvertido(valorDeApiBOB, ingresaValor, "BOB", "USD");
                }}
            }
            } catch ( NumberFormatException e ){
            System.out.println("Error: Ingrese un número válido. ");
        } catch (RuntimeException e) {
            System.out.println("Error inesperado: " +e.getMessage());
            System.out.println("Finalizando la aplicación.");
    }}}