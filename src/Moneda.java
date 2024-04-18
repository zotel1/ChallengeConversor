public record Moneda (int ARS,
                      int BOB,
                      int BRL,
                      int CLP,
                      int COP,
                      int USD){

    public double convertir(double cantidad) {
        int opcion = 0;
        switch (opcion) {
            case 1:
                return cantidad * USD;
            case 2:
                return cantidad / ARS;
            case 3:
                return cantidad * USD;
            case 4:
                return cantidad / BRL;
            case 5:
                return cantidad * USD;
            case 6:
                return cantidad / COP;
            default:
                throw new IllegalArgumentException("Eija una opcion valida.");
        }
    }


}