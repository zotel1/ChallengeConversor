public class ConversorMonedas {
    public void obtenerValorConvertido(double valorDeApi, double ingresarValor, String monedaDeApi, String monedaActual) {
        double resultado = (valorDeApi * ingresarValor);
        double resultadoRedondeado = Math.round(resultado * 10000.0) / 10000.0;

        System.out.println("El valor " + ingresarValor + "[" + monedaDeApi + "] corresponde al valor final de =>> " + resultadoRedondeado + "[" + monedaActual + "]");

    }
}