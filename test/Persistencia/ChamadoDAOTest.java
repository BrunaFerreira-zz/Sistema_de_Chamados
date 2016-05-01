/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.Pessoa;
import entidade.RegistroChamado;
import entidade.Tecnico;
import java.util.Collection;
import org.junit.Assert;

import org.junit.Test;

/**
 *
 * @author Bruna
 */
public class ChamadoDAOTest {

    @Test
    public void testGerarCodigo() {
        ChamadoDAO chamadoDAO = new ChamadoDAO();
        Assert.assertEquals(chamadoDAO.getChamados().size(), chamadoDAO.gerarCodigo() - 1);
    }

    @Test
    public void testGerarCodigoRegistroChamado() {
        ChamadoDAO chamadoDAO = new ChamadoDAO();
        Assert.assertEquals(chamadoDAO.getRegistros().size(), chamadoDAO.gerarCodigoRegistroChamado() - 1);
    }

    @Test
    public void testGetChamados() {
        ChamadoDAO chamadoDAO = new ChamadoDAO();
        Tecnico tecnicoA = new Tecnico("Igor", 986574920);
        Pessoa p1 = new Pessoa("Clara", 25763457);
        Empresa emp1 = new Empresa(65375391, "Fibra");
        ClienteEmpresa CE1 = new ClienteEmpresa((Integer) 100, emp1, 1142345679, p1.getNome(), p1.getTelefone());
        Chamado chamadoRede = new Chamado((Integer) 1002, "Rede AB desconectada",
                "Usuario nao consegue utilizar a rede em horario comercial", 3, tecnicoA,
                CE1, "WINDOWS", "64bits", "ADSL", "IU6000533637");
        chamadoDAO.put(chamadoRede);
        Assert.assertTrue(chamadoDAO.getChamados().size()>0);
    }

    @Test
    public void testGetRegistros() {
        ChamadoDAO chamadoDAO = new ChamadoDAO();
        Tecnico tecnicoA = new Tecnico("Igor", 986574920);
        Pessoa p1 = new Pessoa("Clara", 25763457);
        Empresa emp1 = new Empresa(65375391, "Fibra");
        ClienteEmpresa CE1 = new ClienteEmpresa((Integer) 100, emp1, 1142345679, p1.getNome(), p1.getTelefone());
        Chamado chamadoRede = new Chamado((Integer) 1002, "Rede AB desconectada",
                "Usuario nao consegue utilizar a rede em horario comercial", 3, tecnicoA,
                CE1, "WINDOWS", "64bits", "ADSL", "IU6000533637");
        
        RegistroChamado regChamado = new RegistroChamado("Acesso a Rede",chamadoRede,chamadoRede.getTecnico());
        chamadoDAO.putRegistro(regChamado);
        Assert.assertTrue(chamadoDAO.getRegistros().size()>0);
    }

}
