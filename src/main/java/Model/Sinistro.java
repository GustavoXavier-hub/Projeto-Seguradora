package Model;

import java.util.ArrayList;
import java.util.List;

public class Sinistro extends Veiculo {


    //comentario tipos de sinistro
    //pequena monta-sao acidentes considerados com impactos leves como reparo ou troca de peças de 0 a 20 pontos
    //media monta-sao acidentes que envolvem acidentes batidas mais fortes que causam danos ainda reparaveis 21 a 30 pontos
    //grande-monta-sao acidentes aqueles em que o veículo não pode ser recuperado ou reparado mais de 30 pontos
    String tipoSinistro;
    boolean acionamentoSeguro;

    //batidas e acidentes ,roubo e furto ,causas naturais ,danos a terceiros em acidentes.
    String Motivo;
    int id;
    int ValorSinistro;

    public Sinistro(String placa, String marca, String cor, String documento, String tipoVeiculo, String tipoSinistro, boolean acionamentoSeguro, String motivo, int valorSinistro, int id) {
        super(placa, marca, cor, documento, tipoVeiculo);
        this.tipoSinistro = tipoSinistro;
        this.acionamentoSeguro = acionamentoSeguro;
        Motivo = motivo;
        this.id = id;
        ValorSinistro = valorSinistro;
    }

    public String getTipoSinistro() {
        return tipoSinistro;
    }

    public void setTipoSinistro(String tipoSinistro) {
        this.tipoSinistro = tipoSinistro;
    }

    public boolean isAcionamentoSeguro() {
        return acionamentoSeguro;
    }

    public void setAcionamentoSeguro(boolean acionamentoSeguro) {
        this.acionamentoSeguro = acionamentoSeguro;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String motivo) {
        Motivo = motivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValorSinistro() {
        return ValorSinistro;
    }

    public void setValorSinistro(int valorSinistro) {
        ValorSinistro = valorSinistro;
    }

    public  String AcionamentoSeguro(int id, String tipoSinistro, String Motivo, int  valorSinistro){

        List<String> listaSinistro = new ArrayList<>();
         try {
             if(valorSinistro >=20){
                 listaSinistro.add(tipoSinistro);
                 listaSinistro.add(Motivo);
                 listaSinistro.add(String.valueOf(valorSinistro));
             }
         }
         catch (Exception e) {
             System.out.println("o tipo de sinistro e pequena monta"+valorSinistro);
         }
         try {
             if(valorSinistro >=21){
                 listaSinistro.add(tipoSinistro);
                 listaSinistro.add(Motivo);
                 listaSinistro.add(String.valueOf(valorSinistro));
             }
         }
         catch (Exception e){
             System.out.println("o tipo de sinistro e media monta"+valorSinistro);
         }
        try {
            if(valorSinistro >=30){
                listaSinistro.add(tipoSinistro);
                listaSinistro.add(Motivo);
                listaSinistro.add(String.valueOf(valorSinistro));
            }
        }
        catch (Exception e){
            System.out.println("o tipo de sinistro e grande monta"+valorSinistro);
        }

        return listaSinistro.get(valorSinistro);
    }

}
