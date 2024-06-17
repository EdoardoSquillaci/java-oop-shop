package org.lessons.java.shop;

import java.util.Random;

//codice (numero intero) , nome , descrizione , prezzo , iva


public class Prodotto {

private int codiceProdotto;

 protected String nome;

protected String descrizione;

protected double prezzo;

protected int iva;

public Prodotto(String nome,String descrizione, double prezzo ,int iva) {
	
    int valoreMinimo = 11111;
	
	int valoreMassimo = 99999;
	
	
    Random codiceRandom = new Random();
	
    //assegno i valori alle variabili
    
    
    this.codiceProdotto = codiceRandom.nextInt(valoreMassimo - valoreMinimo);	
	this.nome=nome;
	this.descrizione=descrizione;
	this.prezzo=prezzo;
	this.iva=iva;
}

public int getCodiceProdotto() {
	
	return codiceProdotto;
}



public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getDescrizione() {
	return descrizione;
}

public void setDescrizione(String descrizione) {
	this.descrizione = descrizione;
}

public double getPrezzo() {
	return prezzo;
}

public void setPrezzo(int prezzo) {
	this.prezzo = prezzo;
}



public int getIva() {
	
	return iva;
}

public void setIva(int iva) {
	this.iva = iva;
	
	
}

public String nomeEsteso() {
	
	String nomeEsteso = codiceProdotto + " - " + nome;
	return nomeEsteso;
	
}

public String prezzoIva() {
	
	String prezzoIva = prezzo + (prezzo * iva)/100+ "€ / prezzo finale";
	
	return prezzoIva;
	
}


//alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
//il codice prodotto sia accessibile solo in lettura
//gli altri attributi siano accessibili sia in lettura che in scrittura
//il prodotto esponga un metodo per avere il prezzo base
//il prodotto esponga un metodo per avere il prezzo comprensivo di iva
//il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome

//costruttore
	


	
}
