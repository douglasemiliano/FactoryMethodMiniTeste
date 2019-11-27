package br.ufpb.miniteste.aps;

public class Main {
	
	public static void main(String[] args) {
		FactoryCarro fabrica = new FactoryCarro();
		String marca = "Honda";
		int ano = 2019;
		Carro carro = fabrica.criarCarro(marca, ano);
		
		System.out.println(carro.getMarca()+ " " + carro.getAno());
	}

}
