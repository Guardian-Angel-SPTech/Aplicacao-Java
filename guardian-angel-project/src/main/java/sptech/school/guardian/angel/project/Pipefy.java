/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.school.guardian.angel.project;

import com.google.protobuf.Message;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.MessageFormat;

/**
 *
 * @author aluno
 */
public class Pipefy {

    public static void criarCards(String nomeComponente, Integer quantidade, String func) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.pipefy.com/graphql"))
                .header("accept", "application/json")
                .header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJ1c2VyIjp7ImlkIjozMDIwODAyNDQsImVtYWlsIjoibHVpcy5udW5lc0BzcHRlY2guc2Nob29sIiwiYXBwbGljYXRpb24iOjMwMDIxNDI1MH19.ib-5cnqvW9NHv5rzehMgfaxIGE3iGxOsuBGs8CLAGvgQcoBBBYeC6up3lMwD-ymn5SCmZAIJnQ9Qp_ZoggN-DQ")
                .header("Content-Type", "application/json")
                .method("POST", HttpRequest.BodyPublishers.ofString("{\"query\":\"mutation{ createCard( input:    { pipe_id: \\\"302636936\\\" fields_attributes: "
                            + "[          {field_id: \\\"qual_o_assunto_do_seu_pedido\\\", field_value: \\\"Uso de "+ nomeComponente +" a cima dos "+quantidade +"% com o funcionario "+func+"\\\"}          "
                        
                            + "{field_id: \\\"informa_es_do_solicitante\\\", field_value: \\\"606696122\\\"}            "
                        
                            + "{field_id: \\\"tipo\\\", field_value: \\\"Nivel elevado de "+nomeComponente+"\\\"}              "
                        
                            + "{field_id: \\\"mais_informa_es\\\", field_value: \\\"O computador do funcionario "+ func + " está com mais de "+quantidade+ "% cheque as condições de seu computador \\\"} ] } )            "
                        
                            + "{clientMutationId card {id title }}}\"}" ))
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        criarCards("Ram", 70, "func");
    }
}
