package br.inatel.cdg;

public class MockAtendimentoService implements AtendimentoService {

    @Override
    public String busca(int id) {
        switch (id) {
            case 1:
                return AtendimentoConst.ATENDIMENTO_JOAO;
            case 2:
                return AtendimentoConst.ATENDIMENTO_CHRIS;
            case 3:
                return AtendimentoConst.ATENDIMENTO_ROBSON;
            default:
                return AtendimentoConst.ATENDIMENTO_INEXISTENTE;
        }
    }
}

