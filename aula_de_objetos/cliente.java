package aula_de_objetos;

public class cliente {

	public static void main(String[] args) {
		testeCliente cliente1 =new testeCliente("joao ","BR","masculino",1.70,23);
		
		testeCliente cliente2 =  new testeCliente("kaique","BR","masculino",1.80,24);
		
		cliente2.imprimirInfo();
		cliente1.imprimirInfo();
	}

}
