package desafioproffissional.projeto;

import Model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);


		//teste classe veiculo
		Veiculo MeuCarro = new Veiculo("rrr","rrrr","azul","555","carro");
		MeuCarro.AdicionarCorVeiculo("azul");

		//teste classe pessoa
		Pessoa  pessoa = new Pessoa("xavier","334444","33333","33333");
		pessoa.setName("Gustavo");
		pessoa.setCpf("44971219846");
		pessoa.setTelefone("(11) 96067-6148");
		pessoa.setStatusSeguro(true);

		//teste classe Sinistro
		Sinistro sinistro = new Sinistro("fff","honda","azul","ffff","carro","PequenaPonta",true,"acidente",45,01);
		sinistro.setId(01);
		sinistro.setPlaca("444555");
		sinistro.setDocumento("344444");
		sinistro.setMotivo("batidaCarro");
		sinistro.setTipoSinistro("pequenaMonta");
		sinistro.setValorSinistro(20);

		//teste classe cliente
		Cliente Cliente01 = new Cliente("xavier","334444","33333",false);
		Cliente01.setName("Gustavo");
		Cliente01.setCpf("449712198");
		Cliente01.setTelefone("(11) 96067-6148");
		Cliente01.setStatusSeguro(true);

		Cliente01.contratarSeguro(01,"teste@gmail.com","(11) 96067-6148","solteiro");

		// teste classe Funcionario
		Funcionario Funcionario01 = new Funcionario("gustavo","444444","55555",true,01,"fffff","RH","24/08/2010","ativo");
		Funcionario01.setName("Gustavo");
		Funcionario01.setCpf("449712198");
		Funcionario01.setTelefone("(11) 96067-6148");
		Funcionario01.setStatusSeguro(true);
		Funcionario01.setId(01);
		Funcionario01.setMatricula(23333);
		Funcionario01.setDepartamento("RH");
		Funcionario01.setDataAdimissao("24/06/2023");
		Funcionario01.setStatusFuncionario(true);
	}

}
