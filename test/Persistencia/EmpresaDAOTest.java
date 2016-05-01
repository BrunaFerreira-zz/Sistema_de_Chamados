/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidade.Empresa;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bruna
 */
public class EmpresaDAOTest {

    @Test
    public void testPersit() {
        Empresa emp1 = new Empresa(23674374, "Santander");
        EmpresaDAO empDAO = new EmpresaDAO();
        empDAO.put(emp1);

        Collection<Empresa> empresas = empDAO.getEmpresas();
        Empresa nova = null;
        for (Empresa empresa1 : empresas) {
            if ((emp1.getNomeEmpresa().equals(empresa1.getNomeEmpresa())) && (emp1.getNumeroContrato() == empresa1.getNumeroContrato())) {
                nova = empresa1;
            }
        }
        Assert.assertTrue(((emp1.getNomeEmpresa().equals(nova.getNomeEmpresa())) && (emp1.getNumeroContrato() == nova.getNumeroContrato())));

    }

    @Test
    public void testGetEmpresas() {
        EmpresaDAO empDAO = new EmpresaDAO();
        Assert.assertTrue(empDAO.voltaEmpresa().size()>0);
    }

}
