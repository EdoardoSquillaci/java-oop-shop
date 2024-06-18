package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     Prodotto primoProdotto = new Prodotto("Primo Prodotto", "Descrizione primo prodotto", 180, 22);
	
     System.out.println(primoProdotto.getNome());
     System.out.println(primoProdotto.getDescrizione());
     System.out.println("Il prezzo Base è: "  +  primoProdotto.getPrezzo() +" €");
     System.out.println(primoProdotto.prezzoIva());
     System.out.println(primoProdotto.nomeEsteso());
     System.out.println("------------------------------------------------------------" );


     Prodotto secondoProdotto = new Prodotto("Secondo Prodotto", "Descrizione secondo prodotto", 1500, 22);
 	
     System.out.println(secondoProdotto.getNome() );
     System.out.println(secondoProdotto.getDescrizione());
     System.out.println("Il prezzo Base è: "  +  secondoProdotto.getPrezzo() +" €");
     System.out.println(secondoProdotto.prezzoIva());
     System.out.println(secondoProdotto.nomeEsteso());
     
     
     
	}

}
