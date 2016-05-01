package entidade;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bruna
 */
public class ChamadoTest {

    Tecnico tecnicoA = new Tecnico("Igor", 986574920);
    Tecnico tecnicoB = new Tecnico("Robson", 986577654);
    Tecnico tecnicoC = new Tecnico("Lucas", 986578764);
    Pessoa p1 = new Pessoa("Clara", 25763457);
    Pessoa p2 = new Pessoa("Gabriel", 25736357);
    Pessoa p3 = new Pessoa("Andre", 25476357);
    Empresa emp1 = new Empresa(65375391, "Fibra");
    ClienteEmpresa CE1 = new ClienteEmpresa((Integer) 100, emp1, 1142345679, p1.getNome(), p1.getTelefone());
    ClienteEmpresa CE2 = new ClienteEmpresa((Integer) 134, emp1, 1142345764, p2.getNome(), p2.getTelefone());
    ClienteEmpresa CE3 = new ClienteEmpresa((Integer) 127, emp1, 1142345764, p3.getNome(), p3.getTelefone());
    Chamado chamadoRede = new Chamado((Integer)1002, "Rede AB desconectada",
            "Usuario nao consegue utilizar a rede em horario comercial", 3, tecnicoA,
            CE1, "WINDOWS", "64bits", "ADSL", "IU6000533637");

    Chamado chamadoBD = new Chamado("Acesso nao permitido ao Oracle",
            "Usuario nao tem permissao para acessar Banco de dados Oracle", 2, tecnicoB,
            CE2, "WINDOWS", "32bits", "Oracle");

    Chamado chamadoDesempenho = new Chamado("Software reinicia apos duas utilizacoes",
            "Usuario relata software ativar reiniciacao apos duas vezes utilizado",
            2, tecnicoC, CE3, "WINDOWS", "64bits", "Reiniciar", 30.9);

    @Test
    public void testGetTecnico() {
        assertEquals(chamadoRede.getTecnico(), tecnicoA);
        assertEquals(chamadoBD.getTecnico(), tecnicoB);
        assertEquals(chamadoDesempenho.getTecnico(), tecnicoC);
    }

    @Test
    public void testGetCodigo() {
        //assertEquals(chamadoRede.getCodigo(),1002);
    }

    @Test
    public void testSetCodigo() {
        chamadoRede.setCodigo(1006);
        assertEquals(chamadoRede.getCodigo(), 1006);
    }

    @Test
    public void testSetTecnico() {
        chamadoRede.setTecnico(tecnicoB);
        assertEquals(chamadoRede.getTecnico(), tecnicoB);
        chamadoBD.setTecnico(tecnicoA);
        assertEquals(chamadoBD.getTecnico(), tecnicoA);
        chamadoDesempenho.setTecnico(tecnicoC);
        assertEquals(chamadoDesempenho.getTecnico(), tecnicoC);
    }

    @Test
    public void testGetCliente() {
        assertEquals(chamadoRede.getCliente(), CE1);
        assertEquals(chamadoBD.getCliente(), CE2);
        assertEquals(chamadoDesempenho.getCliente(), CE3);
    }

    @Test
    public void testSetCliente() {
        chamadoRede.setCliente(CE2);
        assertEquals(chamadoRede.getCliente(), CE2);
        chamadoBD.setCliente(CE3);
        assertEquals(chamadoBD.getCliente(), CE3);
        chamadoDesempenho.setCliente(CE2);
        assertEquals(chamadoDesempenho.getCliente(), CE2);
    }

    @Test
    public void testGetStatus() {
        //Valor de status nao padronizado
        //Testando ENUM Status
        assertNotEquals(chamadoRede.getStatus(), Status.iniciado);        
        assertNotEquals(chamadoBD.getStatus(), Status.iniciado);
        assertNotEquals(chamadoDesempenho.getStatus(), Status.iniciado);
    }

    @Test
    public void testSetStatus() {

        //Testando todos os status enumerados
        chamadoRede.setStatus("em_atendimento");
        assertNotEquals(chamadoRede.getStatus(), Status.em_atendimento);
        chamadoBD.setStatus("encerrado");
        assertNotEquals(chamadoBD.getStatus(), Status.encerrado);
        chamadoDesempenho.setStatus("aguardando_resposta_do_usuario");
        assertNotEquals(chamadoDesempenho.getStatus(), Status.aguardando_resposta_do_usuario);
        chamadoRede.setStatus("sem_solucao");
        assertNotEquals(chamadoRede.getStatus(), Status.sem_solucao);

    }

    @Test
    public void testGetTipoProblema() {
        //Testando tipos de problemas Enumerados
        // Tipos declarados padrao diferentes dos enumerados
        assertNotEquals(chamadoRede.getTipoProblema(), TipoProblema.ProblemaDeRede);
        assertNotEquals(chamadoBD.getTipoProblema(), TipoProblema.ProblemaBancoDeDados);
        assertNotEquals(chamadoDesempenho.getTipoProblema(), TipoProblema.ProblemaDesempenho);
    }

    @Test
    public void testSetTipoProblema() {
        //Testando tipos de problemas Enumerados
        chamadoRede.setTipoProblema("ProblemaDeRede");
        assertNotEquals(chamadoRede.getTipoProblema(), TipoProblema.ProblemaDeRede);
        chamadoBD.setTipoProblema("ProblemaBancoDeDados");
        assertNotEquals(chamadoBD.getTipoProblema(), TipoProblema.ProblemaBancoDeDados);
        chamadoDesempenho.setTipoProblema("ProblemaDesempenho");
        assertNotEquals(chamadoDesempenho.getTipoProblema(), TipoProblema.ProblemaDesempenho);
    }

    @Test
    public void testGetData() {
        assertNull(chamadoRede.getData(), null);
        assertNull(chamadoBD.getData(), null);
        assertNull(chamadoDesempenho.getData(), null);

    }

    @Test
    public void testSetData() {
        chamadoRede.setData("01/08/2015");
        assertEquals(chamadoRede.getData(), "01/08/2015");
        chamadoBD.setData("10/10/2000");
        assertEquals(chamadoBD.getData(), "10/10/2000");
        chamadoDesempenho.setData("10/10/2013");
        assertEquals(chamadoDesempenho.getData(), "10/10/2013");
    }

    @Test
    public void testGetHora() {
        assertNull(chamadoRede.getHora(),null);
        assertNull(chamadoBD.getHora(),null);
        assertNull(chamadoDesempenho.getHora(), null);
    }

    @Test
    public void testSetHora() {
        chamadoRede.setHora("11:54:37");
        assertEquals(chamadoRede.getHora(), "11:54:37");
        chamadoBD.setHora("19:18:34");
        assertEquals(chamadoBD.getHora(), "19:18:34");
        chamadoDesempenho.setHora("14:10:45");
        assertEquals(chamadoDesempenho.getHora(), "14:10:45");
    }

    @Test
    public void testGetTitulo() {
        assertEquals(chamadoRede.getTitulo(), "Rede AB desconectada");
        assertEquals(chamadoBD.getTitulo(), "Acesso nao permitido ao Oracle");
        assertEquals(chamadoDesempenho.getTitulo(), "Software reinicia apos duas utilizacoes");
    }

    @Test
    public void testSetTitulo() {
        chamadoRede.setTitulo("Rede C4 desconectada");
        assertEquals(chamadoRede.getTitulo(), "Rede C4 desconectada");
        chamadoBD.setTitulo("Inacessivel ao Oracle");
        assertEquals(chamadoBD.getTitulo(), "Inacessivel ao Oracle");
        chamadoDesempenho.setTitulo("Reiniciacao apos duas utilizacoes");
        assertEquals(chamadoDesempenho.getTitulo(), "Reiniciacao apos duas utilizacoes");
    }

    @Test
    public void testGetDescricao() {
        assertEquals(chamadoRede.getDescricao(), "Usuario nao consegue utilizar a rede em horario comercial");
        assertEquals(chamadoBD.getDescricao(), "Usuario nao tem permissao para acessar Banco de dados Oracle");
        assertEquals(chamadoDesempenho.getDescricao(), "Usuario relata software ativar reiniciacao apos duas vezes utilizado");
    }

    @Test
    public void testSetDescricao() {
        chamadoRede.setDescricao("Usuario nao consegue utilizar a rede C4.");
        assertEquals(chamadoRede.getDescricao(), "Usuario nao consegue utilizar a rede C4.");
        chamadoBD.setDescricao("Usuario nao tem permissao para acessar Banco de dados Oracle 5.2.");
        assertEquals(chamadoBD.getDescricao(), "Usuario nao tem permissao para acessar Banco de dados Oracle 5.2.");
        chamadoDesempenho.setDescricao("Usuario solicita troca de maquina.");
        assertEquals(chamadoDesempenho.getDescricao(), "Usuario solicita troca de maquina.");
    }

    @Test
    public void testGetPrioridade() {
        assertEquals(chamadoRede.getPrioridade(), 3);
        assertEquals(chamadoBD.getPrioridade(), 2);
        assertEquals(chamadoDesempenho.getPrioridade(), 2);
    }

    @Test
    public void testSetPrioridade() {
        chamadoRede.setPrioridade(5);
        assertEquals(chamadoRede.getPrioridade(), 5);
        chamadoBD.setPrioridade(4);
        assertEquals(chamadoBD.getPrioridade(), 4);
        chamadoDesempenho.setPrioridade(3);
        assertEquals(chamadoDesempenho.getPrioridade(), 3);
    }

    @Test
    public void testGetSistemaOperacional() {
        //Testando Sistema Operacionais Enumerados
        assertNotEquals(chamadoRede.getSistemaOperacional(), SistemaOperacional.WINDOWS);
        assertNotEquals(chamadoBD.getSistemaOperacional(), SistemaOperacional.WINDOWS);
        assertNotEquals(chamadoDesempenho.getSistemaOperacional(), SistemaOperacional.WINDOWS);
    }

    @Test
    public void testSetSistemaOperacional() {
        //Testando Sistema Operacionais Enumerados
        //Tipos diferentes, String é diferente de enum
        chamadoRede.setSistemaOperacional("LINUX");
        assertNotEquals(chamadoRede.getSistemaOperacional(), SistemaOperacional.LINUX);
        chamadoBD.setSistemaOperacional("LINUX");
        assertNotEquals(chamadoBD.getSistemaOperacional(), SistemaOperacional.LINUX);
        chamadoDesempenho.setSistemaOperacional("LINUX");
        assertNotEquals(chamadoDesempenho.getSistemaOperacional(), SistemaOperacional.LINUX);
    }

    @Test
    public void testGetVersaoSO() {
        assertEquals(chamadoRede.getVersaoSO(), "64bits");
        assertEquals(chamadoBD.getVersaoSO(), "32bits");
        assertEquals(chamadoDesempenho.getVersaoSO(), "64bits");
    }

    @Test
    public void testSetVersaoSO() {
        chamadoRede.setVersaoSO("Debian");
        assertEquals(chamadoRede.getVersaoSO(), "Debian");
        chamadoBD.setVersaoSO("Debian");
        assertEquals(chamadoBD.getVersaoSO(), "Debian");
        chamadoDesempenho.setVersaoSO("Debian");
        assertEquals(chamadoDesempenho.getVersaoSO(), "Debian");
    }

    @Test
    public void testGetBancoDeDados() {
        //Testando Banco de Dados enumerados
        //Um é String, o outro do tipo BancoDeDados
        assertNotSame(chamadoBD.getBancoDeDados(), BancoDeDados.Oracle);
    }

    @Test
    public void testSetBancoDeDados() {
        //Testando Banco de Dados enumerados
        //Tipos diferentes String diferente de enum
        chamadoBD.setBancoDeDados("MySql");
        assertNotEquals(chamadoBD.getBancoDeDados(), BancoDeDados.MySql);
        chamadoBD.setBancoDeDados("SqlServer");
        assertNotEquals(chamadoBD.getBancoDeDados(), BancoDeDados.SqlServer);
    }

    @Test
    public void testGetCausaProblema() {
        assertNull(chamadoRede.getCausaProblema(), null);
        assertNull(chamadoBD.getCausaProblema(), null);
        assertNull(chamadoDesempenho.getCausaProblema(), null);
    }

    @Test
    public void testSetCausaProblema() {
        chamadoRede.setCausaProblema("Sem permissao de acesso.");
        assertEquals(chamadoRede.getCausaProblema(), "Sem permissao de acesso.");
        chamadoBD.setCausaProblema("Incompatibilidade de versao");
        assertEquals(chamadoBD.getCausaProblema(), "Incompatibilidade de versao");
        chamadoDesempenho.setCausaProblema("Fio solto.");
        assertEquals(chamadoDesempenho.getCausaProblema(), "Fio solto.");

    }

    @Test
    public void testGetSolucaoProblema() {
        assertNull(chamadoRede.getSolucaoProblema(), null);
        assertNull(chamadoBD.getSolucaoProblema(), null);
        assertNull(chamadoDesempenho.getSolucaoProblema(), null);
    }

    @Test
    public void testSetSolucaoProblema() {
        chamadoRede.setSolucaoProblema("Solicitar acesso.");
        assertEquals(chamadoRede.getSolucaoProblema(), "Solicitar acesso.");
        chamadoBD.setSolucaoProblema("Instalar arquivo de compatibilidade.");
        assertEquals(chamadoBD.getSolucaoProblema(), "Instalar arquivo de compatibilidade.");
        chamadoDesempenho.setSolucaoProblema("Substituir fio.");
        assertEquals(chamadoDesempenho.getSolucaoProblema(), "Substituir fio.");
    }

    @Test
    public void testGetTipoConexao() {
        //Testano tipos de conexões enumeradas
        //Nao sao Iguais
        assertNotSame(chamadoRede.getTipoConexao(), TipoConexao.ADSL);
    }

    @Test
    public void testSetTipoConexao() {
        //Testano tipos de conexões enumeradas
        chamadoRede.setTipoConexao("CaboModen");
        assertNotEquals(chamadoRede.getTipoConexao(), TipoConexao.CaboModen);
        chamadoRede.setTipoConexao("Outra");
        assertNotEquals(chamadoRede.getTipoConexao(), TipoConexao.Outra);
        chamadoRede.setTipoConexao("Radio");
        assertNotEquals(chamadoRede.getTipoConexao(), TipoConexao.Radio);
    }

    @Test
    public void testGetEnderecoRede() {
        assertEquals(chamadoRede.getEnderecoRede(), "IU6000533637");
    }

    @Test
    public void testSetEnderecoRede() {
        chamadoRede.setEnderecoRede("IU5000876476");
        assertEquals(chamadoRede.getEnderecoRede(), "IU5000876476");
    }

    @Test
    public void testGetOperacao() {
        assertEquals(chamadoDesempenho.getOperacao(), "Reiniciar");

    }

    @Test
    public void testSetOperacao() {
        chamadoDesempenho.setOperacao("Formatar");
        assertEquals(chamadoDesempenho.getOperacao(), "Formatar");
    }

    @Test
    public void testGetDuracaoOperacao() {
        assertEquals(chamadoDesempenho.getDuracaoOperacao(), 30,9);
    }

    @Test
    public void testSetDuracaoOperacao() {
        chamadoDesempenho.setDuracaoOperacao(16.9);
        assertEquals(chamadoDesempenho.getDuracaoOperacao(), 16,9);
    }

    @Test
    public void testEquals() {
        Chamado ChamadoDesempenho  ;
        //assertEquals(chamadoRede.getCodigo()!=chamadoDesempenho.getCodigo(), false);
    }

}
