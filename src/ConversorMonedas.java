public class ConversorMonedas {
    public void obtenerValorConvertido(double valorDeApi, double ingresarValor, String monedaDeApi, String monedaActual) {
        double resultado = Math.round(valorDeApi * ingresarValor);
        double resultadoFormateado = Math.round((resultado * 10000.0000) / 10000.0000);

        System.out.println("El valor " + ingresarValor + "[" + monedaDeApi + "] corresponde al valor final de =>> " + resultadoFormateado + "[" + monedaActual + "]");
    }
    public void obtenerValorCentavo(double valorDeApi, double ingresarValor, String monedaDeApi, String monedaActual) {
            double resultado = Math.round(valorDeApi * ingresarValor);

            double centavosDeDolar = resultado * 100;
            int cwntavosRedondeados = (int) Math.round(centavosDeDolar);

        System.out.println("El valor " + ingresarValor + "[" + monedaDeApi + "] corresponde al valor final de =>> " + centavosDeDolar + " centavos de dólar [" + monedaActual + "]");

    }

    //public void obtenerValorDividido(double valorDeApi, double ingresarValor, String monedaDeApi, String monedaActual) {
      //  double resultadodiv = valorDeApi / ingresarValor;
        //System.out.println("El valor " + ingresarValor + "[" + monedaDeApi + "] corresponde al valor final de =>> " + Math.round((resultadodiv * 100.0) / 100.0)    + "[" + monedaActual + "]");
//    }
}