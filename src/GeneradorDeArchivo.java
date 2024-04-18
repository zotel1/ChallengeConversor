import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GeneradorDeArchivo {
    public void guardarJson(Moneda moneda) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter(moneda.ARS()+ moneda.BOB()+ moneda.BRL()+ moneda.CLP()+ moneda.USD()+ moneda.COP()+ ".json");
        escritura.write(gson.toJson(moneda));
        escritura.close();
    }
}