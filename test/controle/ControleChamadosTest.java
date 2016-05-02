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
import entidade.Status;
import entidade.Tecnico;

import org.junit.Test;
import static org.junit.Assert.*;

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
    Chamado chamadoRede = new Chamado((Integer)1002, "Rede AB desconectada",
            "Usuario nao consegue utilizar a rede em horario comercial", 3, tecnicoA,
            CE1, "WINDOWS", "64bits", "ADSL", "IU6000533637");
    
    @Test
    public void testAlterarChamado() {
        chamadoRede.setStatus( "encerrado");
        assertEquals(chamadoRede.getStatus(),"encerrado");
        chamadoRede.setCausaProblema( "Nao autorizado.");
        assertEquals(chamadoRede.getCausaProblema(),"Nao autorizado.");
        chamadoRede.setSolucaoProblema( "Solicitar autorizacao.");
        assertEquals(chamadoRede.getSolucaoProblema(),"Solicitar autorizacao.");
        
    }
    @Test
    public void testInserirChamadoRede() {
        
    }

    @Test
    public void testInserirChamadoBancoDeDados() {
       
    }

    @Test
    public void testInserirChamadoDesempenho() {
        
    }

    @Test
    public void testInserirRegistroChamado() {
        
    }

    @Test
    public void testCadastrarChamado() {
       
    }

    @Test
    public void testFecharTela() {
        
    }

    @Test
    public void testVoltaChamadoCodigo() {
        
    }

    @Test
    public void testSetChamadoAlterado() {
       
    }

    @Test
    public void testGetChamadoAlterado() {
        
    }

    @Test
    public void testEmitirRelatorios() {
       
    }

    @Test
    public void testBuscaPeloCodigo() {
        
    }

    @Test
    public void testRetornaDetalhesChamado() {
       
    }


    @Test
    public void testAbrirRelatorio() {
        
    }

    @Test
    public void testFecharTelaAlteracao() {
       
    }

    @Test
    public void testValidarQtdChamados() {
       
    }
    
}
