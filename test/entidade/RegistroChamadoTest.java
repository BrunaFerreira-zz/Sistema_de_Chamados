/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bruna
 */
public class RegistroChamadoTest {

    Tecnico tecnicoA = new Tecnico("Igor", 986574920);
    Tecnico tecnicoB = new Tecnico("Robson", 986577654);
    
    Pessoa p1 = new Pessoa("Clara", 25763457);
    Pessoa p2 = new Pessoa("Gabriel", 25736357);
    
    Empresa emp1 = new Empresa(65375391, "Fibra");
    ClienteEmpresa CE1 = new ClienteEmpresa((Integer) 100, emp1, 1142345679, p1.getNome(), p1.getTelefone());
    ClienteEmpresa CE2 = new ClienteEmpresa((Integer) 134, emp1, 1142345764, p2.getNome(), p2.getTelefone());

    Chamado chamadoRede = new Chamado( 1002, "Rede AB desconectada",
            "Usuario nao consegue utilizar a rede em horario comercial", 3, tecnicoA,
            CE1, "WINDOWS", "64bits", "ADSL", "IU6000533637");

    Chamado chamadoBD = new Chamado("Acesso nao permitido ao Oracle",
            "Usuario nao tem permissao para acessar Banco de dados Oracle", 2, tecnicoB,
            CE2, "WINDOWS", "32bits", "Oracle");

    RegistroChamado regChamado = new RegistroChamado("Acesso a Rede",chamadoRede,chamadoRede.getTecnico());

    @Test
    public void testGetCodigo() {
       assertEquals(regChamado.getCodigo(),null);
    }

    @Test
    public void testSetCodigo() {
        regChamado.setCodigo(5);
        assertEquals(regChamado.getCodigo(),(Integer)5);
    }
    
    @Test
    public void testGetChamado() {
       assertSame(regChamado.getChamado(),chamadoRede);
    }

    @Test
    public void testSetChamado() {
        regChamado.setChamado(chamadoBD);
        assertSame(regChamado.getChamado(),chamadoBD);
    }

    @Test
    public void testGetHora() {
       assertNull(regChamado.getHora(),null);
    }

    @Test
    public void testSetHora() {
        regChamado.setHora("15:43:34");
        assertEquals(regChamado.getHora(),"15:43:34");
    }

    @Test
    public void testGetData() {
        assertNull(regChamado.getData(),null);
    }

    @Test
    public void testSetData() {
        regChamado.setHora("01/05/2016");
        assertEquals(regChamado.getHora(),"01/05/2016");
    }

    @Test
    public void testGetAssunto() {
        assertEquals(regChamado.getAssunto(),"Acesso a Rede");
    }

    @Test
    public void testSetAssunto() {
        regChamado.setAssunto("Acesso a BD");
        assertEquals(regChamado.getAssunto(),"Acesso a BD");
    }

    @Test
    public void testGetTecnico() {
        assertEquals(regChamado.getTecnico(), tecnicoA);
    }

    @Test
    public void testSetTecnico() {
        regChamado.setTecnico(tecnicoB);
        assertEquals(regChamado.getTecnico(), tecnicoB);
    }

}
