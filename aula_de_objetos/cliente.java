package aula_de_objetos;

public class cliente {

	public static void main(String[] args) {
		testeCliente cliente1 =new testeCliente("joao ","BR","masculino",1.70,23);
		
		testeCliente cliente2 =  new testeCliente("kaique","BR","masculino",1.80,24);
		
		PessoaJuridica cliente4 = new PessoaJuridica("luana","BR","feminino",1.60, 70,"234723756237");
		PessoaJuridica cliente3 = new PessoaJuridica("lucas","BR","masculino",1.90, 25,"734752654");
		cliente2.imprimirInfo();
		cliente1.imprimirInfo();
		cliente3.imprimirInfo();
		cliente4.imprimirInfo();
	}

}
