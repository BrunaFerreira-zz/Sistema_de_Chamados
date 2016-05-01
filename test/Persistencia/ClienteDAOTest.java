/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.Pessoa;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Bruna
 */
public class ClienteDAOTest {

    @Test
    public void testValidarCPF() {
        ClienteDAO clienteDAO = new ClienteDAO();
        Empresa emp1 = new Empresa(23674374, "Santander");
        Pessoa p1 = new Pessoa("Clara", 25763457);
        ClienteEmpresa ce = new ClienteEmpresa((Integer) 100, emp1, 1142345679, p1.getNome(), p1.getTelefone());
        clienteDAO.put(ce);
        boolean status = clienteDAO.validarCPF(1142345679);
        Assert.assertFalse(status);
    }

    @Test
    public void testGet() {
        ClienteDAO clienteDAO = new ClienteDAO();
        Empresa emp1 = new Empresa(65375391, "Fibra");
        Pessoa p3 = new Pessoa("Andre", 25476357);
        ClienteEmpresa Ce3 = new ClienteEmpresa((Integer) 127, emp1, 1142345764, 
                p3.getNome(), p3.getTelefone());
        clienteDAO.put(Ce3);
        Assert.assertTrue(clienteDAO.voltaCashCliente().size()>0);
    }

    @Test
    public void testPersit() {
        Pessoa p1 = new Pessoa("Clara", 25763457);
        Empresa emp1 = new Empresa(65375391, "Fibra");
        ClienteEmpresa ce2 = new ClienteEmpresa((Integer) 100, emp1, 1142345679, p1.getNome(), p1.getTelefone());
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.put(ce2);
        ClienteEmpresa ce3 = clienteDAO.get(ce2.getCpf());
        Assert.assertTrue((ce2.getCodigo()==ce3.getCodigo())&&
                (ce2.getCpf()==ce3.getCpf())&&
                (ce2.getTelefone()==ce3.getTelefone())&&
                (ce2.getNome().equals(ce3.getNome())&&
                (ce2.getEmpresa().getNumeroContrato() == ce3.getEmpresa().getNumeroContrato())&&
                (ce2.getEmpresa().getNomeEmpresa().equals(ce3.getEmpresa().getNomeEmpresa()))));
    }

}
