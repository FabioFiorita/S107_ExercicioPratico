package br.inatel.cdg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteBuscaAtendimento {
    AtendimentoService atendimentoService;
    BuscaAtendimento buscaAtendimento;

    @Before
    public void setUp() {
        atendimentoService = new MockAtendimentoService();
        buscaAtendimento = new BuscaAtendimento(atendimentoService);
    }

    @After
    public void tearDown() {
        atendimentoService = null;
        buscaAtendimento = null;
    }

    @Test
    public void testeBuscaJoao() {
        Atendimento atendimento = buscaAtendimento.busca(1);
        assertEquals(atendimento.getNomeProfessor(), "João");
        assertEquals(atendimento.getHorarioAtendimento(), "Quinta-Feira - 10:00");
        assertEquals(atendimento.getPeriodo(), "Integral");
    }

    @Test
    public void testeBuscaChris() {
        Atendimento atendimento = buscaAtendimento.busca(2);
        assertEquals(atendimento.getNomeProfessor(), "Chris");
        assertEquals(atendimento.getHorarioAtendimento(), "Segunda-Feira - 17:30");
        assertEquals(atendimento.getPeriodo(), "Noturno");
    }

    @Test
    public void testeBuscaRobson() {
        Atendimento atendimento = buscaAtendimento.busca(3);
        assertEquals(atendimento.getNomeProfessor(), "Robson");
        assertEquals(atendimento.getHorarioAtendimento(), "Terça-Feira - 17:30");
        assertEquals(atendimento.getPeriodo(), "Noturno");
    }

    @Test
    public void testeBuscaInexistente() {
        Atendimento atendimento = buscaAtendimento.busca(4);
        assertEquals(atendimento.getNomeProfessor(), "Inexistente");
        assertEquals(atendimento.getHorarioAtendimento(), "Inexistente");
        assertEquals(atendimento.getPeriodo(), "Inexistente");
    }

    @Test
    public void testeBuscaZero() {
        Atendimento atendimento = buscaAtendimento.busca(0);
        assertEquals(atendimento.getNomeProfessor(), "Inexistente");
        assertEquals(atendimento.getHorarioAtendimento(), "Inexistente");
        assertEquals(atendimento.getPeriodo(), "Inexistente");
    }

    @Test
    public void testeBuscaNegativo() {
        Atendimento atendimento = buscaAtendimento.busca(-1);
        assertEquals(atendimento.getNomeProfessor(), "Inexistente");
        assertEquals(atendimento.getHorarioAtendimento(), "Inexistente");
        assertEquals(atendimento.getPeriodo(), "Inexistente");
    }
}
