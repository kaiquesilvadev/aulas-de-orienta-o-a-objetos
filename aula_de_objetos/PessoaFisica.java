package aula_de_objetos;

public class PessoaFisica extends testeCliente {
	private String cpf;

	public PessoaFisica(String nomeCliente, String nacionalidade, String sexo, double altura, int idade,
			String proficao, String cargo) {
		super(nomeCliente, nacionalidade, sexo, altura, idade);
		this.cpf = proficao;
	}

	public String getProficao() {
		return cpf;
	}

	public void setProficao(String proficao) {
		this.cpf = proficao;
	}
	public void inprima() {
		System.out.println(" cliente "+getNomeCliente()+"\n nacionalidade "+getNacionalidade()+"\nsexo "+getSexo()+"\naltura "+getAltura()+"\nidade "+getIdade()+"profição"+cpf);
	}
}
