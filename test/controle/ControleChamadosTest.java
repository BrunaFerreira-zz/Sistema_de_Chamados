/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.Pessoa;
import entidade.RegistroChamado;
import entidade.Tecnico;
import entidade.TipoProblema;
import org.junit.Assert;

import org.junit.Test;

/**
 *
 * @author Bruna
 */
public class ControleChamadosTest {

    Tecnico tecnicoA = new Tecnico("Igor", 986574920);
    Tecnico tecnicoB = new Tecnico("Robson", 986577654);
    Tecnico tecnicoC = new Tecnico("Lucas", 986578764);
    Pessoa p1 = new Pessoa("Clara", 25763457);
    Pessoa p2 = new Pessoa("Gabriel", 25736357);
    Pessoa p3 = new Pessoa("Andre", 25476357);
    Empresa emp1 = new Empresa(65375391, "Fibra");
    ClienteEmpresa CE1 = new ClienteEmpresa((Integer) 100, emp1, 1142345679, p1.getNome(), p1.getTelefone());
    ClienteEmpresa CE2 = new ClienteEmpresa((Integer) 134, emp1, 1142345764, p2.getNome(), p2.getTelefone());
    ClienteEmpresa CE3 = new ClienteEmpresa((Integer) 127, emp1, 1142345764, p3.getNome(), p3.getTelefone());

    @Test
    public void testInserirChamadoRede() {
        Chamado chamadoRede = new Chamado((Integer) 1002, "Rede AB desconectada",
                "Usuario nao consegue utilizar a rede em horario comercial", 3, tecnicoA,
                CE1, "WINDOWS", "64bits", "ADSL", "IU6000533637");
        ControleChamados controleRede = new ControleChamados();
        chamadoRede = controleRede.InserirChamadoRede(chamadoRede.getTitulo(), chamadoRede.getDescricao(),
                chamadoRede.getPrioridade(), chamadoRede.getTecnico(), chamadoRede.getCliente(),
                chamadoRede.getSistemaOperacional(), chamadoRede.getVersaoSO(),
                chamadoRede.getTipoConexao(), chamadoRede.getEnderecoRede());
        Chamado novo = controleRede.buscaPeloCodigo(chamadoRede.getCodigo());
        Assert.assertTrue((chamadoRede.getTitulo().equals(novo.getTitulo()))
                && (chamadoRede.getDescricao().equals(novo.getDescricao()))
                && (chamadoRede.getPrioridade() == novo.getPrioridade())
                && (chamadoRede.getTecnico() == novo.getTecnico())
                && (chamadoRede.getCliente() == novo.getCliente())
                && (chamadoRede.getSistemaOperacional().equals(novo.getSistemaOperacional()))
                && (chamadoRede.getVersaoSO().equals(novo.getVersaoSO()))
                && (chamadoRede.getTipoConexao().equals(novo.getTipoConexao()))
                && (chamadoRede.getEnderecoRede().equals(novo.getEnderecoRede()))
        );

    }

    @Test
    public void testInserirChamadoBancoDeDados() {
        Chamado chamadoBD = new Chamado("Acesso nao permitido ao Oracle",
                "Usuario nao tem permissao para acessar Banco de dados Oracle", 2, tecnicoB,
                CE2, "WINDOWS", "32bits", "Oracle");
        ControleChamados controle = new ControleChamados();
        chamadoBD = controle.InserirChamadoBancoDeDados(chamadoBD.getTitulo(),
                chamadoBD.getDescricao(), chamadoBD.getPrioridade(),
                chamadoBD.getTecnico(), chamadoBD.getCliente(),
                chamadoBD.getSistemaOperacional(), chamadoBD.getVersaoSO(),
                chamadoBD.getBancoDeDados());
        Chamado novo = controle.buscaPeloCodigo(chamadoBD.getCodigo());
        Assert.assertTrue((chamadoBD.getTitulo().equals(novo.getTitulo()))
                && (chamadoBD.getDescricao().equals(novo.getDescricao()))
                && (chamadoBD.getPrioridade() == novo.getPrioridade())
                && (chamadoBD.getTecnico() == novo.getTecnico())
                && (chamadoBD.getCliente().equals(novo.getCliente()))
                && (chamadoBD.getSistemaOperacional().equals(novo.getSistemaOperacional()))
                && (chamadoBD.getVersaoSO().equals(novo.getVersaoSO()))
                && (chamadoBD.getBancoDeDados().equals(novo.getBancoDeDados()))
        );

    }

    @Test
    public void testInserirChamadoDesempenho() {
        Chamado chamadoDesempenho = new Chamado("Software reinicia apos duas utilizacoes",
                "Usuario relata software ativar reiniciacao apos duas vezes utilizado",
                2, tecnicoC, CE3, "WINDOWS", "64bits", "Reiniciar", 30.9);
        ControleChamados controle = new ControleChamados();
        chamadoDesempenho = controle.InserirChamadoDesempenho(chamadoDesempenho.getTitulo(),
                chamadoDesempenho.getDescricao(), chamadoDesempenho.getPrioridade(),
                chamadoDesempenho.getTecnico(), chamadoDesempenho.getCliente(),
                chamadoDesempenho.getSistemaOperacional(),
                chamadoDesempenho.getVersaoSO(), chamadoDesempenho.getOperacao(),
                chamadoDesempenho.getDuracaoOperacao());

        Chamado novo = controle.buscaPeloCodigo(chamadoDesempenho.getCodigo());
        Assert.assertTrue((chamadoDesempenho.getTitulo() == novo.getTitulo())
                && (chamadoDesempenho.getDescricao().equals(novo.getDescricao()))
                && (chamadoDesempenho.getPrioridade() == novo.getPrioridade())
                && (chamadoDesempenho.getTecnico() == novo.getTecnico())
                && (chamadoDesempenho.getCliente().equals(novo.getCliente()))
                && (chamadoDesempenho.getSistemaOperacional().equals(novo.getSistemaOperacional()))
                && (chamadoDesempenho.getVersaoSO().equals(novo.getVersaoSO()))
                && (chamadoDesempenho.getOperacao().equals(novo.getOperacao()))
                && (chamadoDesempenho.getDuracaoOperacao() == novo.getDuracaoOperacao())
        );
    }


}
