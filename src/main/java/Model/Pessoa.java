package Model;


import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    String name;
    String cpf;
    String telefone;
    String dataNascimento;
    static boolean StatusSeguro;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean isStatusSeguro() {
        return StatusSeguro;
    }

    public void setStatusSeguro(boolean statusSeguro) {
        StatusSeguro = statusSeguro;
    }


    public Pessoa (String name, String cpf, String telefone, String StatusSeguro){

        this.name = name;
        this.cpf  = cpf;
        this.telefone = telefone;
        this.StatusSeguro = Boolean.parseBoolean(StatusSeguro);
    }
    public static boolean concluirSeguro(String name, String cpf, String telefone, boolean statusSeguro) {

       List<String> listaSeguros = new ArrayList<>();
         listaSeguros.add(name);
         listaSeguros.add(cpf);
         listaSeguros.add(telefone);

         try {
             if(statusSeguro = false) {
               listaSeguros.add(String.valueOf(statusSeguro));
             } else{
             System.out.println("O status do seguro esta ativo"+statusSeguro);
         }
         } catch (Exception e) {
            System.out.println("status do seguro inativo"+statusSeguro);
         }
        return StatusSeguro;
    }

}
