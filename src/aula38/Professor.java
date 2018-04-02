package aula38;

public class Professor extends Pessoa {
	private String departamento;
	private String curso;
	private double salario;

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}


	public double calcularSalarioLiquido(){
		return 0;
	}
	
	public String obterEndereco(){
		String end = "Endereço do Professor: ";
		return end + this.getEndereco();
	}

	@Override
	public void imprimirEndereco() {
		String prof = "Dados do Professor: ";
		System.out.println(prof + this.obterEndereco());
		
	}

}
