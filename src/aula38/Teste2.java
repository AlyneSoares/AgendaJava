package aula38;

public class Teste2 {

	public static void main(String[] args) {

		// O modificador 'abstract' impede a classe Pessoa de ser instanciada
		//		Pessoa pessoa = new Pessoa();   
//		Pessoa aluno = new Aluno();
//		Pessoa professor = new Professor();
//
//		//		pessoa.setEndereco("rua 1, n 1");
//		aluno.setEndereco("Rua 2 , n 2");
//		professor.setEndereco("rua 3, n 3");
//
//		System.out.println(professor.obterEndereco());
//		aluno.imprimirEndereco();
//
		Aluno aluno1 = new Aluno();
		aluno1.setCurso("Java Basico");
		double[] notas = {10, 9 , 8, 7};
		aluno1.setNotas(notas);
		

		System.out.println(aluno1.toString());
		
		
		
	
	}
}
