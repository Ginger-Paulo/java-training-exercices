package io.robusta.hand.solution;

import io.robusta.hand.Card;
import io.robusta.hand.CardColor;
import io.robusta.hand.interfaces.IDeckGenerator;

public class DeckGenerator implements IDeckGenerator {

	@Override
	public Deck generate() {
		Deck deck = new Deck();

		// fill the deck with cards
        // Probably use the good modulo
		for (int i = 1; i <= 52; i++) {
			
				int value = i/4;
				//Divise par 4 par le nombre de couleurs
				CardColor c = CardColor.getByValue(i%4+1);
				//On divise par 4, le nombre de couleurs et +1 car la valeur commence à 1
				
				Card carte = new Card(value+2,c);
				//+2 car le 2 va être le plus faible
				deck.add(carte);
				//Ajout de la carte dans le deck
				
		}
		return deck;
	}

}
