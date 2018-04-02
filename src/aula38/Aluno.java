package aula38;

public class Aluno extends Pessoa {
	
	private String curso;
	private double[] notas;

	public Aluno() {
		super();
	}
	
	public Aluno(String nome, String endereco, String telefone, String curso, double[] notas) {
		super(nome, endereco, telefone);
		this.curso = curso;
		this.notas = notas;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double calcularMedia(){
		return 0;
	}

	public boolean isAprovado(){
		return true;
	}
	
	public String obterEndereco(){
		String end = "Endereço do Aluno: ";
		return end + this.getEndereco();
	}

	public void imprimirEndereco() {
		String studant = "Dados de Estudante: ";
		System.out.println(studant + super.obterEndereco());
		
	}
	
	public String toString(){
		String cursoImpresso = curso + "\n";
		for (double nota : notas){
			cursoImpresso += nota + " ";
		}
		return cursoImpresso;
	}
	
	

}
