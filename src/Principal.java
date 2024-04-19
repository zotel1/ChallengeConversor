import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0;

        Scanner lectura = new Scanner(System.in);
        ConversorMonedas conversor = new ConversorMonedas();
        ConsultaMoneda consulta = new ConsultaMoneda();


        while(opcion != 7){
            String menu =
            """
                        **************
                        Sea bienvenido
                        1) Dólar =>> Peso argentino
                        2) Peso argentino =>> Dólar
                        3) Dólar =>> Real brasileño
                        4) Real brasileño =>> Dólar
                        5) Dólar =>> Boliviano boliviano
                        6) Boliviano boliviano =>> Dólar
                        7) Salir
                        Elija una opcion válida
                        **************
                """;
            System.out.println(menu);
            opcion = lectura.nextInt();
            if (opcion != 7) {
                System.out.println("Ingrese el valor que desea convertir: ");
                int ingresaValor = lectura.nextInt();
                if (opcion == 1 ) {
                    double valorDeApi  = consulta.buscaMoneda("USD").conversion_rates().ARS;
                    conversor.obtenerValorConvertido(valorDeApi, ingresaValor, "USD","ARS");
                } else if (opcion == 2) {
                    double valorDeApi = consulta.buscaMoneda("ARS").conversion_rates().USD;
                    conversor.obtenerValorDividido(valorDeApi, ingresaValor, "ARS", "USD");
                } else if (opcion == 3) {
                    double valorDeApi = consulta.buscaMoneda("USD").conversion_rates().BRL;
                    conversor.obtenerValorConvertido(valorDeApi, ingresaValor,"BRL", "USD");
                } else if (opcion == 4) {
                    double valorDeApi = consulta.buscaMoneda("BRL").conversion_rates().USD;
                    conversor.obtenerValorDividido(valorDeApi, ingresaValor, "BRL", "USD");
                } else if (opcion == 5) {
                    double valorDeApi = consulta.buscaMoneda("USD").conversion_rates().BOB;
                    conversor.obtenerValorConvertido(valorDeApi, ingresaValor, "COP", "USD");
                } else if (opcion == 6) {
                    double valorDeApi = consulta.buscaMoneda("BOB").conversion_rates().USD;
                    conversor.obtenerValorDividido(valorDeApi, ingresaValor, "COP", "USD");
                }
            }}}}