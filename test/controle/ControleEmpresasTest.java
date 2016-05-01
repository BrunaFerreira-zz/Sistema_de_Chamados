/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Empresa;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Bruna
 */
public class ControleEmpresasTest {
    
 
    @Test
    public void testValidar() {
       ControleEmpresas controle = new ControleEmpresas();
       Empresa emp1 = new Empresa(28474642,"Banco do Brasil"); 
       Assert.assertTrue(controle.checar(emp1.getNumeroContrato(), emp1.getNomeEmpresa()));
    }

    @Test
    public void testInserir() {
        ControleEmpresas controle = new ControleEmpresas();
        Empresa emp1 = new Empresa(28787692,"Unibanco");
        controle.inserir(emp1.getNumeroContrato(), emp1.getNomeEmpresa());
        Empresa nova = controle.retorna(28787692,"Unibanco");
        Assert.assertTrue((nova.getNomeEmpresa().equals(emp1.getNomeEmpresa()))&&
                (nova.getNumeroContrato()==emp1.getNumeroContrato()));
    }

}
