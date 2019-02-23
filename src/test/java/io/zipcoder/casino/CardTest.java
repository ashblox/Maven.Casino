package io.zipcoder.casino;

import games.BlackJack;
import io.zipcoder.casino.Cards.Card;
import io.zipcoder.casino.Cards.Rank;
import io.zipcoder.casino.Cards.Suit;
import org.junit.Assert;
import org.junit.Test;

public class CardTest {

    @Test

    public void testCardConstructor() {

        //Given
        Rank rank = Rank.ACE;
        Suit suit = Suit.DIAMONDS;
        Card testCard = new Card(suit,rank);

        //When
        Rank actualRank = testCard.getRank();
        Suit actualSuit = testCard.getSuit();

        //Then
        Assert.assertEquals(rank,actualRank);
        Assert.assertEquals(suit,actualSuit);

    }

    @Test
    public void testCardSetMethod() {

        //Given
        Rank rank = Rank.FIVE;
        Suit suit = Suit.SPADES;
        Card testCard = new Card(suit,rank);

        //When
        Rank actualRank = testCard.getRank();
        Suit actualSuit = testCard.getSuit();
        String expected = "" + rank + " of "+suit;
        //Then
        Assert.assertEquals(expected,testCard.toString());
        Assert.assertEquals(suit,actualSuit);

    }

    @Test
    public void testBlackJack(){
        BlackJack newBlackJack = new BlackJack();

        int i = newBlackJack.play();
    }

}