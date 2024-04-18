import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;




public class ConsultaMoneda {
    public Moneda buscaMoneda(int numeroDeMoneda){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/0d788d47253393059542af54/latest/" + numeroDeMoneda);

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