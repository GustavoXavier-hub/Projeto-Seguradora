package Model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    int id;
    String endereco;
    String email;
    String celular;
    String estadoCivil;

    public Cliente(String name, String cpf, String telefone, boolean StatusSeguro) {
        super(name, cpf, telefone, String.valueOf(StatusSeguro));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

     public boolean contratarSeguro(int id, String email, String celular, String estadoCivil){

        List<String> ListaCliente = new ArrayList<String>();
        ListaCliente.add(String.valueOf(id));
        ListaCliente.add(String.valueOf(email));
        ListaCliente.add(String.valueOf(celular));
        ListaCliente.add(String.valueOf(estadoCivil));
        return (Pessoa.concluirSeguro("gustavo","44971219846","(11) 960676148",true));
     }
}
