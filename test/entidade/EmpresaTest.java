package entidade;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bruna
 */
public class EmpresaTest {
    
    Empresa emp1 = new Empresa(23674374,"Santander");


    @Test
    public void testGetNumeroContrato() {
        assertEquals(emp1.getNumeroContrato(),23674374);
    }

    @Test
    public void testSetNumeroContrato() {
        emp1.setNumeroContrato(24873498);
        assertEquals(emp1.getNumeroContrato(), 24873498);
    }

    @Test
    public void testGetNomeEmpresa() {
        assertEquals(emp1.getNomeEmpresa(),"Santander");
    }

    @Test
    public void testSetNomeEmpresa() {
        emp1.setNomeEmpresa("Bradesco");
        assertEquals(emp1.getNomeEmpresa(),"Bradesco"); 
    }

    @Test
    public void testToString() {
        assertEquals(emp1.toString(),emp1.getNumeroContrato()+" - "+emp1.getNomeEmpresa());
    }
    
}
