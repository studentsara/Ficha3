package exer1;

import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria("Joao", new Date ());
		ContaBancaria conta2 = new ContaBancaria("Pedro", 250);
		ContaBancaria conta3 = new ContaBancaria("Jojo", new Date());
		ContaBancaria conta4 = new ContaBancaria("Sara", 5000);
		
		conta4.depositar(10_000);
		conta4.levantar(1000);
		System.out.println(conta4.getInformacaoConta() + "\n");
		
		
		conta3.depositar(1500);
		conta3.levantar(10000);
		System.out.println(conta3.getInformacaoConta());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
