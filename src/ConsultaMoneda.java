import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;




public class ConsultaMoneda {
    public Monedas buscaMoneda(String base_code){
       try {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/0d788d47253393059542af54/latest/" + base_code);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri((direccion))
                .build();

        HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        Gson gson = new Gson();
        return gson.fromJson(response.body(), Monedas.class);
        } catch ( IOException | InterruptedException e) {
            throw new RuntimeException(("No se encontro esa Moneda."));
        }
    }
}