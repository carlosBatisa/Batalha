package batalha.modelo;



public class Heroi extends Personagem {
	
//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
	//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaa

public int calculoDano( Personagem heroi, Personagem monstro){

		//ATAQUE
		int dano = 0;
		int defesa = 0;
		for (int i= 1; i < heroi.ataque; i++){
			
		 dano += dado.nextInt(5) + 1;
			
		}
	//DEFESA 
		System.out.print("dano");
		System.out.println(dano);
		
		for(int j=1 ; j < monstro.defesa; j++){
			
			defesa += dado.nextInt(4) + 1; 
			
		}
		System.out.print("defesa");
		System.out.println(defesa);
		
		if (dano <= defesa){
			return 0;
		} else {
			return dano - defesa ;
		}
		
		
	}
	






}
