
package entidade;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bruna
 */
public class ClienteEmpresaTest {
    
    
    Pessoa p1 = new Pessoa("Clara", 25763457);
    Empresa emp1 = new Empresa(65375391,"Fibra");
    ClienteEmpresa CE = new ClienteEmpresa((Integer)100,emp1,1142345679,p1.getNome(), p1.getTelefone());

    
    @Test
    public void testGetCodigo() {
        assertEquals(CE.getCodigo(),(Integer)100);
    }
    
    @Test
    public void testSetCodigo() {
        CE.setCodigo(108);
        assertEquals(CE.getCodigo(),(Integer)108);
    }

    @Test
    public void testGetCpf() {
        assertEquals(CE.getCpf(),1142345679L);
    }

    @Test
    public void testSetCpf() {
        CE.setCpf(43527284843L);
        assertEquals(CE.getCpf(),43527284843L);
    }

    @Test
    public void testGetEmpresa() {
        assertEquals(CE.getEmpresa(),emp1);
    }

    @Test
    public void testToString() {
        assertEquals(CE.toString(),"Contrato: " + CE.getEmpresa().getNumeroContrato()
                     + " - Nome Empresa:" + CE.getEmpresa().getNomeEmpresa() + " - Cliente: "
                + CE.getCpf() + " - " + CE.getNome());
    }
}
