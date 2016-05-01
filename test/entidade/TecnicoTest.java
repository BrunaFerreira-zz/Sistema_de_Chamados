
package entidade;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bruna
 */
public class TecnicoTest {
    
    Tecnico tec1 = new Tecnico("Igor", 986574920);
    
    
    @Test
    public void testToString() {
        assertEquals(tec1.getNome(),"Igor");
    }
    
}
