package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     Prodotto primoProdotto = new Prodotto("Primo Prodotto", "Descrizione primo prodotto", 180, 22);
	
     System.out.println(primoProdotto.nome );
     System.out.println(primoProdotto.descrizione);
     System.out.println("Il prezzo Base è: "  +  primoProdotto.prezzo +" €");
     System.out.println(primoProdotto.prezzoIva());
     System.out.println(primoProdotto.nomeEsteso());
     System.out.println("------------------------------------------------------------" );


     Prodotto secondoProdotto = new Prodotto("Secondo Prodotto", "Descrizione secondo prodotto", 1500, 22);
 	
     System.out.println(secondoProdotto.nome );
     System.out.println(secondoProdotto.descrizione);
     System.out.println("Il prezzo Base è: "  +  secondoProdotto.prezzo +" €");
     System.out.println(secondoProdotto.prezzoIva());
     System.out.println(secondoProdotto.nomeEsteso());
     
     
     
	}

}
