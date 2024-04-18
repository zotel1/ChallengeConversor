import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;




public class ConsultaMoneda {
    public Moneda buscaMoneda(int opcion){
        String codigoMoneda;
        switch (opcion){
            case 1:
            case 2:
                codigoMoneda = "ARS";
                break;
            case 3:
            case 4:
                codigoMoneda = "BRL";
                break;

            case 5:
            case 6:
                codigoMoneda = "COP";
                break;
            default:
                throw new IllegalArgumentException("Elija una opcion valida.");
        }
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/0d788d47253393059542af54/latest/" + codigoMoneda);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri((direccion))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException(("No se encontro esa Moneda."));
        }
    }
}