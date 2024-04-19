public class ConversorMonedas {
    public void obtenerValorConvertido(double valorDeApi, double ingresarValor, String monedaDeApi, String monedaActual) {
        double resultado = Math.round(valorDeApi * ingresarValor);
        System.out.println("El valor " + ingresarValor + "[" + monedaDeApi + "] corresponde al valor final de =>> " + resultado + "[" + monedaActual + "]" );}

    public void obtenerValorDividido(double valorDeApi, double ingresarValor, String monedaDeApi, String monedaActual) {
        double resultado = Math.round(valorDeApi / ingresarValor);
        System.out.println("El valor " + ingresarValor + "[" + monedaDeApi + "] corresponde al valor final de =>> " + resultado + "[" + monedaActual + "]");
    }}