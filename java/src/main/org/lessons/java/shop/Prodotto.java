package org.lessons.java.shop;

import java.util.Random;

//codice (numero intero) , nome , descrizione , prezzo , iva


public class Prodotto {

private int codiceProdotto;

private String nome;

private String descrizione;

private double prezzo;

private int iva;

public Prodotto(String nome,String descrizione, double prezzo ,int iva) {
	
    int valoreMinimo = 11111;
	
	int valoreMassimo = 99999;
	
	
    Random codiceRandom = new Random();
	 
    this.codiceProdotto = codiceRandom.nextInt(valoreMassimo - valoreMinimo);	
	this.nome=nome;
	this.descrizione=descrizione;
	this.prezzo=prezzo;
	this.iva=iva;
}

protected int getCodiceProdotto() {
	
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


	
}
