
package entidade;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bruna
 */
public class PessoaTest {
    
    Pessoa p1 = new Pessoa("Renata", 24802340);

    @Test
    public void testGetNome() {
        assertEquals(p1.getNome(), "Renata");
    }

    @Test
    public void testSetNome() {
        p1.setNome("Leila");
        assertEquals(p1.getNome(), "Leila");
    }

    @Test
    public void testGetTelefone() {
        assertEquals(p1.getTelefone(), 24802340);
    }

    @Test
    public void testSetTelefone() {
        p1.setTelefone(24802324);
        assertEquals(p1.getTelefone(), 24802324);
    }
    
}
