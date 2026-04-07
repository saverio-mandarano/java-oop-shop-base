### Esercizio: java-oop-shop-base

Nel progetto java-oop-shop, package org.lessons.java.shop, creare la classe Product che gestisce i prodotti dello shop.

Un prodotto è caratterizzato da:

- codice (numero intero)
- nome
- descrizione
- marca
- prezzo
- iva

Usare opportunamente costruttori, attributi, livelli di accesso (public, private), i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:

- alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
- il prodotto esponga un metodo per avere il prezzo base
- il prodotto esponga un metodo per avere il prezzo comprensivo di iva
- il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome

#

- esistano almeno due costruttori diversi
- il codice prodotto sia accessibile solo in lettura
- gli altri attributi siano accessibili sia in lettura che in scrittura

Nello stesso package aggiungere una classe Main con metodo main nella quale testare tutte le funzionalità della classe Prodotto.
