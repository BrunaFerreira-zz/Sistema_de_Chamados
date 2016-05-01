/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import Persistencia.TecnicoDAO;
import entidade.Tecnico;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bruna
 */
public class ControleTecnicosTest {
    

    @Test
    public void testInserir() {
       ControleTecnicos controller = new ControleTecnicos();
       Tecnico tec = new Tecnico("Igor", 986574920);
       Tecnico tecNovo = controller.inserir(tec.getTelefone(), tec.getNome());
       Assert.assertTrue((tec.getTelefone()==tecNovo.getTelefone()) && 
               tec.getNome().equals(tecNovo.getNome()));
    }

    
}
