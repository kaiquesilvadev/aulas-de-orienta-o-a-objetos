package aula_de_objetos;

public class PessoaJuridica extends testeCliente {
   private String cmpj;

public PessoaJuridica(String nomeCliente, String nacionalidade, String sexo, double altura, int idade, String cmpj) {
	super(nomeCliente, nacionalidade, sexo, altura, idade);
	this.cmpj = cmpj;
}

public String getCmpj() {
	return cmpj;
}

public void setCmpj(String cmpj) {
	this.cmpj = cmpj;
}

public void inprime(){
	System.out.println(" cliente "+getNomeCliente()+"\n nacionalidade "+getNacionalidade()+"\nsexo "+getSexo()+"\naltura "+getAltura()+"\nidade "+getIdade()+"cmpj"+cmpj);
}

   
}
