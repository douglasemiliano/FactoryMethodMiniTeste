package br.ufpb.miniteste.aps;

public class FactoryCarro {
	
	public Carro criarCarro (String marca, int ano) {
		if (marca.equals("Fiat"))
			return new Fiat(ano);
		else if (marca.equals("Honda"))
			return new Honda(ano);
		return null;
	}

}
