//package Aulas33a36;
//
//public class testeContatos {
//
//	public static void main(String[] args) {
//		
//		Endereco enderecoT = new Endereco();
//		enderecoT.setLogradouro("Rua DF");
//		enderecoT.setNumero("1212");
//		enderecoT.setCompletemento("casa 5");
//		enderecoT.setBairro("San Jose");
//		enderecoT.setCidade("Poa");
//		enderecoT.setEstado("RS");
//		enderecoT.setCep("60000-000");
//		
//		Telephone telefone4 = new Telephone("trabalho", "86", "4332545");
//		
//		Telephone telefone1 = new Telephone("Casa", "1", "2344234");		 
//		
//		Telephone telefone2 = new Telephone("celular", "34", "r234324");		 
//		
//		Telephone[] telefones = new Telephone[3];
//		telefones[0] = telefone1;
//		telefones[1] = telefone2;
//		telefones[2] = telefone4;
//		
//		
//		Contatos contato = new Contatos();
//		contato.setNome("Alyne");
//		contato.setEndereco(enderecoT);
//		contato.setTelephones(telefones);
////		
////		//Print Console:
////		System.out.println(contato.getNome());
////		
////		if (contato != null && contato.getTelephones() != null);{
////			for (Telephone t : contato.getTelephones()){
////				System.out.println(t.getDdd() + " " + t.getNumero());
////			}
////		}
////		
////		if ((contato != null && contato.getEndereco() != null)){
////			System.out.println(contato.getEndereco().getLogradouro());
////		}
////		
//		
//		for(Telephone telefone : telefones){
//			System.out.println(telefone);
//		}
//		
//		System.out.println(enderecoT.toString());
//	}
//	
//	
//}
