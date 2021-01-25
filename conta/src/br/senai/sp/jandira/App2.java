package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App2 {

		public static void main(String[] args) {
			
//			Cria��o do Cliente
			Cliente pedro = new Cliente();
			pedro.setNome("Pedro Lanches");
			pedro.setCpf("400.028.922/45");
			pedro.setTelefone("(11)92550-8270");
			pedro.setCep("06686012");
			
//			Criar conta do Pedro
			Conta contaDoPedro = new Conta();
			contaDoPedro.setTitular(pedro);
			contaDoPedro.depositar(100);
			contaDoPedro.setNumero("2706-7");
			
			System.out.println(contaDoPedro.getTitular().getTelefone());
			System.out.println(contaDoPedro.getTitular().getNome());
			contaDoPedro.getTitular().setNome("Pedro Takakara");
			System.out.println(contaDoPedro.getTitular().getNome());
			System.out.println(pedro.getNome());
		}
}
