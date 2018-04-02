package ExerciciosAula36;

import exerciciosAula36.Telefone;

public class Contato {

	private String nome;
	private String email;
	private Telefone[] telefones;

	public Contato(String nomeDoContato){
		this.nome = nomeDoContato;
		this.telefones = new Telefone[3];
	}

	public void addEmail(String endEletronico){
		this.email = endEletronico;
	}

	public void addTelefone(int index, Telefone telefone){
		this.telefones[index] = telefone; 
	}

	public String toString(){
		String print = nome;
		if (email != null){
			print += " e-mail: " + email + "\n";
		}
		for(Telefone telefone: telefones){
			if(telefone != null){
				print += telefone + "\n";
			}
		}
		return print;
	}
}
