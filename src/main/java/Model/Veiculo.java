package Model;

import java.util.ArrayList;
import java.util.List;

public class Veiculo {

    String placa;
    String marca;
    String cor;
    String Documento;
    String TipoVeiculo;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String documento) {
        Documento = documento;
    }

    public String getTipoVeiculo() {
        return TipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        TipoVeiculo = tipoVeiculo;
    }

    public Veiculo(String placa, String marca, String cor, String documento, String tipoVeiculo) {
        this.placa = placa;
        this.marca = marca;
        this.cor = cor;
        Documento = documento;
        TipoVeiculo = tipoVeiculo;
    }

    public String AdicionarCorVeiculo(String cor) {
        List<String> ListaCor = new ArrayList<String>();
        ListaCor.add(String.valueOf(cor));
        return  ListaCor.toString();
    }

    public String AdicionarDocumento(String documento) {
        List<String> Documento = new ArrayList<String>();
        Documento.add(String.valueOf(documento));
        return Documento.toString();
    }
}
