package br.inatel.cdg;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaAtendimento {
    AtendimentoService atendimentoService;

    public BuscaAtendimento(AtendimentoService atendimentoService) {
        this.atendimentoService = atendimentoService;
    }

    public Atendimento busca(int id) {
        String atendimentoJSON = atendimentoService.busca(id);

        JsonObject jsonObject = JsonParser.parseString(atendimentoJSON).getAsJsonObject();

        Atendimento aux = new Atendimento(jsonObject.get("nomeDoProfessor").getAsString(),
                jsonObject.get("horarioDeAtendimento").getAsString(),
                jsonObject.get("periodo").getAsString());

        return aux;
    }

}
