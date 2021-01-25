package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Conta;

import br.senai.sp.jandira.model.Cliente;

public class App {

	public static void main(String[] args) {

		
		Conta contaDaAnaJulia = new Conta();
		Conta contaDoJoao = new Conta();
		
//		contaDaAnaJulia.setTitular("Ana Julia");
		contaDaAnaJulia.setNumero("111-98");
		contaDaAnaJulia.setTipoDaConta("Banana");
		contaDaAnaJulia.setAtiva(true);
		contaDaAnaJulia.setChequeEspecial(200);
		contaDaAnaJulia.depositar(100);
		contaDaAnaJulia.mostrarSaldoDaConta();
		contaDaAnaJulia.depositar(30);
		contaDaAnaJulia.mostrarSaldoDaConta();
		contaDaAnaJulia.sacar(50);
		contaDaAnaJulia.mostrarSaldoDaConta();
		contaDaAnaJulia.sacar(500);
		contaDaAnaJulia.mostrarSaldoDaConta();
		contaDaAnaJulia.sacar(50);
		contaDaAnaJulia.mostrarSaldoDaConta();
		contaDaAnaJulia.sacar(80);
		contaDaAnaJulia.mostrarSaldoDaConta();
		contaDaAnaJulia.depositar(100);
		contaDaAnaJulia.mostrarSaldoDaConta();
		
		double valorSaldo = contaDaAnaJulia.getSaldo();
		
		System.out.println("****"+ valorSaldo);
		System.out.println("Nome do(a) titular: " + contaDaAnaJulia.getTitular());
		System.out.println("Conta: " + contaDaAnaJulia.getNumero());
		System.out.println("Tipo: " + contaDaAnaJulia.getTipoDaConta());
		System.out.println("Situa��o: " + contaDaAnaJulia.isAtiva());
		System.out.println("Cheque especial: " + contaDaAnaJulia.getChequeEspecial());
		
		Cliente cliente = new Cliente();
	}
	
}
