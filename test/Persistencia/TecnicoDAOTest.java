/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidade.Tecnico;
import java.util.HashMap;
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
public class TecnicoDAOTest {

    @Test
    public void testGerarCodigo() {
        TecnicoDAO tecDAO = new TecnicoDAO();
        int valor = tecDAO.voltaCashTecnico().size()+1;
        assertEquals(tecDAO.gerarCodigo(),valor);
    }

    @Test
    public void testGet() {
        Tecnico tec1 = new Tecnico("Igor", 986574920);
        TecnicoDAO tecDAO = new TecnicoDAO();
        Assert.assertTrue(tecDAO.voltaCashTecnico().size()>0);  
    }

    @Test
    public void testPersit() {
        Tecnico tec1 = new Tecnico("Igor", 986574920);
        TecnicoDAO tecDAO = new TecnicoDAO();
        tecDAO.put(tec1);
        Tecnico novo = tecDAO.get(tecDAO.gerarCodigo()-1);
        assertTrue(((tec1.getTelefone() == novo.getTelefone())) && (tec1.getNome().equals(novo.getNome())));
        
    }
    
}
