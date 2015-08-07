package batalha.teste;

import batalha.modelo.Heroi;
import batalha.modelo.Monstro;

public class Teste {

	public static void main(String[] args)  {
		Heroi h1 = new Heroi();
		Monstro m1 = new Monstro();
		
		h1.ataque = 5;
		m1.defesa = 4;
		
		for (int i= 1; i < 20; i++){
			
		System.out.println(h1.calculoDano(h1,m1));
		
			
		}
		
	}
	
	}
