package aula_de_objetos;

public class testeCliente {
	private String nomeCliente;
	private String nacionalidade;
	private String sexo;
	private double altura;
	private int idade;
	public testeCliente(String nomeCliente, String nacionalidade, String sexo, double altura, int idade) {
		super();
		this.nomeCliente = nomeCliente;
		this.nacionalidade = nacionalidade;
		this.sexo = sexo;
		this.altura = altura;
		this.idade = idade;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	//eprimir na tela
	public void imprimirInfo(){
		System.out.println(" cliente "+nomeCliente+"\n nacionalidade "+nacionalidade+"\nsexo "+sexo+"\naltura "+altura+"\nidade "+idade);
	}
}
