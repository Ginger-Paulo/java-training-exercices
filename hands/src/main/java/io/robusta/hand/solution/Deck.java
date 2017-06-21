package io.robusta.hand.solution;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;

import io.robusta.hand.Card;
import io.robusta.hand.CardColor;
import io.robusta.hand.interfaces.IDeck;

public class Deck extends LinkedList<Card> implements IDeck{

	
	private static final long serialVersionUID = -4686285366508321800L;
	
	public Deck() {

	}
	
	@Override
	public Card pick() {
		// shuffle;
		Collections.shuffle(this);//Utilisation du this pour dire le deck
		// remove card from deck and returns it
		return this.removeFirst();
	}


	

	@Override
	public TreeSet<Card> pick(int number) {
		TreeSet<Card> treeSet = new TreeSet<>();//On crée la main
		
		// reuse pick(), pour cela un fait une boucle de la fonction pick
		for(int i= 1; i<= number;i++){
			treeSet.add(pick());//pour treeSet on fait plusieurs fois la fonction pick
		}
		return treeSet;//on retourne treeSet
	}

	@Override
	public Hand giveHand() {
		// A hand is a **5** card TreeSet
		Hand hand = new Hand();//Création de la main
		hand.addAll(pick(5));//Puis on ajoute à la main plusieurs cartes (d'où le addAll), issu de la fonction pick et 5 pour le nombre de fois où la fonction est faite
		
		
		return hand;
	}
	
	
	
}
