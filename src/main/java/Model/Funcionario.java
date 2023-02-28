package Model;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Cliente {

    int id;
    int matricula;
    String departamento;
    String dataAdimissao;
    boolean statusFuncionario;

    public Funcionario(String name, String cpf, String telefone, boolean StatusSeguro, int id, String matricula, String departamento, String dataAdimissao, String statusFuncionario) {
        super(name, cpf, telefone, StatusSeguro);
        this.id = id;
        this.matricula = Integer.parseInt(matricula);
        this.departamento = departamento;
        this.dataAdimissao = dataAdimissao;
        this.statusFuncionario = Boolean.parseBoolean(statusFuncionario);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDataAdimissao() {
        return dataAdimissao;
    }

    public void setDataAdimissao(String dataAdimissao) {
        this.dataAdimissao = dataAdimissao;
    }

    public boolean isStatusFuncionario() {
        return statusFuncionario;
    }

    public void setStatusFuncionario(boolean statusFuncionario) {
        this.statusFuncionario = statusFuncionario;
    }

    public String  ConsultarSeguro(int id,String matricula,String departamento,String dataAdimissao,boolean statusFuncionario){

        if(contratarSeguro(01,"teste@gmail.com","(11) 960676148","solteiro")) {
            List<String> ListaFuncionario = new ArrayList<>();
            ListaFuncionario.get(id);
            ListaFuncionario.get(Integer.parseInt(email));
            ListaFuncionario.get(Integer.parseInt(celular));
            ListaFuncionario.get(Integer.parseInt((estadoCivil)));
            System.out.println("Seguro Ativo");
        }else{
            Cliente.concluirSeguro("gustavo","44971219846","(11) 960676148",false);
           System.out.println("Realize a contratração do Seguro");
        }
        return String.valueOf(Cliente.concluirSeguro("teste","44971219846","(11) 960676148",false));
    }

}
