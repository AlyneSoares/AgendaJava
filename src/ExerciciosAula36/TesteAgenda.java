package ExerciciosAula36;

import exerciciosAula36.Telefone;

public class TesteAgenda {
	public static void main(String[] args) {

		Agenda agenda = new Agenda("Clientes");

		Contato pessoa1 = new Contato("Bruno");
		Contato pessoa2 = new Contato("Kalel");
		Contato pessoa3 = new Contato("Diana");

		agenda.addContato(0, pessoa1);
		agenda.addContato(1, pessoa2);
		agenda.addContato(2, pessoa3);
		
		pessoa1.addEmail("B@a.com");
		pessoa3.addEmail("d@mail.com.br");
		
		Telefone pessoa2Tel1 = new Telefone("Celular", "51", "99999");
		Telefone pessoa2Tel2 = new Telefone("Casa", "51", "8888");
		Telefone pessoa2Tel3 = new Telefone("Trabalho", "51", "7777");
		
		pessoa2.addTelefone(0, pessoa2Tel1);
		pessoa2.addTelefone(1, pessoa2Tel2);
		pessoa2.addTelefone(2, pessoa2Tel3);
		
		
		System.out.println(agenda);
		
	}

}
