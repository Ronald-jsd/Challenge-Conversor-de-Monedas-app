package consultaApi;

import com.google.gson.Gson;
import modelRecord.Moneda;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    /*Metodo buscar moneda utilizando API*/
    public Moneda buscaMoneda(String moneda) {
        String url = "https://v6.exchangerate-api.com/v6/4f05c9c14a871ba8166f42f9/latest/";
        //direccion completa del codigo de la moneda
        URI direccion = URI.create( url + moneda.toUpperCase()  );

        //creacion del cliente http y construccion de la solicitud http(GET default)
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

                try {
                    //Enviando la solicitud al servidor y espera respuesta
                    HttpResponse<String> response  = client.send(request, HttpResponse.BodyHandlers.ofString());
                    //retornar la  respuesta json obtenida convertida en un objeto tipo Moneda
                    return new Gson().fromJson(response.body(), Moneda.class  );
                }catch (Exception e) {
                    throw new RuntimeException("No se encontro");
                }
    }
}
