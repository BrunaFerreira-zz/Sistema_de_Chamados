/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bruna
 */
public class ControladorPrincipalTest {
    ControladorPrincipal controller = new ControladorPrincipal();
   

    @Test
    public void testGetCtrEmpresa() {
        assertNotNull(controller.getCtrEmpresa());
    }


    @Test
    public void testGetCtrChamados() {
        assertNotNull(controller.getCtrChamados());
    }


    @Test
    public void testGetCtrClientes() {
        assertNotNull(controller.getCtrClientes());
    }

    @Test
    public void testGetCtrTecnicos() {
        assertNotNull(controller.getCtrTecnicos());
    }

    
}
