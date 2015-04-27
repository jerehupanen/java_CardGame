package gameTypes;

import cardBase.Card;
import cardBase.CardDeck;
import cardBase.HandOfCards;
import java.awt.image.BufferedImage;

public class blackJack {
    
    private CardDeck deck;   
    private Card     card;    
    private HandOfCards myHand, dealerHand;     
    private int myHandValue, dealerHandValue, myScore, dealerScore, winningScore, aceCounter;
    private boolean gameOver = false;
    
    private BufferedImage myCard1, myCard2, dealerCard1, dealerCard2;
    
    
    public blackJack() {
        myHandValue     = 0;
        myScore         = 0;
        dealerHandValue = 0;
        dealerScore     = 0;
        winningScore    = 5;
        gameOver        = false;
    }
    
    public void dealNewHands() {
        deck = new CardDeck();
        deck.fillDeck();
        deck.shuffleDeck();
        
        myHand      = new blackJack_hand();
	dealerHand  = new blackJack_hand();
        
	for (int i=0; i < 2; i++) {
            card = deck.dealCard();
            myHand.addCard(card);
            
            card = deck.dealCard();
            dealerHand.addCard(card);
        }
        
        myHandValue = 0;
        dealerHandValue = 0;
        
        setMyHandValue();
        setDealerHandValue();
    }
    
    public void dealPlayerOneCard() {
        card = deck.dealCard();
        myHand.addCard(card);
        setMyHandValue();
    }
    
    public void dealDealerOneCard() {
        card = deck.dealCard();
        dealerHand.addCard(card);
        setDealerHandValue();
    }
       
    public int getMyHandSize() {
        return myHand.getHandSize();
    }
    
    public void setMyHandValue() {
        int value;
        int total = 0;
        
        for(int i=0; i < myHand.getHandSize(); i++) {
            value = myHand.getCard(i).getCardIntValue();
            
            if(value > 10) {
                if(value > 13) {
                    aceCounter++;
                } else {
                    total += 10;
                }
            } else {
                total += value;
            }
        }
        
        if(aceCounter > 0) {
            if(aceCounter == 1 && total < 11) {
                total += 11;
            } else {
                total += aceCounter*1;           
            }
        }
       aceCounter = 0;
       myHandValue = total;
    }
    
    public int getMyHandValue() {
        return myHandValue;
    }
    
    public int getDealerFirstCardValue() {             
        return dealerHand.getCard(0).getCardIntValue();
    }        
    
    public void setDealerHandValue() {
        int value;
        int total = 0;
        
        for(int i=0; i < dealerHand.getHandSize(); i++) {
            value = dealerHand.getCard(i).getCardIntValue();
            
            if(value > 10) {
                if(value > 13) {
                    aceCounter++;
                } else {
                    total += 10;
                }
            } else {
                total += value;
            }
        }       
        if(aceCounter > 0) {
            if(aceCounter == 1 && total < 11) {
                total += 11;
            } else {
                total += aceCounter*1;           
            }
        }     
        aceCounter = 0;
        dealerHandValue = total;
    }
 
    public int getDealerHandValue() {
        return dealerHandValue;
    }
    
    public int getMyScore() {
        return myScore;
    }
    
    public void addMyScore() {
        myScore++;
    }
            
    public void addDealerScore() {
        dealerScore++;
    }
    
    public int getDealerScore() {
        return dealerScore;
    }
    
    public void checkFor21() {
        if(myHandValue == 21) {
            gameOver = true;
            myScore++;
      } if(dealerHandValue == 21) {
            gameOver = true;
            dealerScore++;
        } else {
            gameOver = false;
        }
    }
    
    public boolean isOver() {
        return gameOver;
    }
    
    public BufferedImage getCardImages(String card) {
               if(card == "myCard1") {
            return myHand.getCard(0).getCardImage();
        } else if(card == "myCard2") {
            return myHand.getCard(1).getCardImage();
        } else if(card == "myCard3") {
            return myHand.getCard(2).getCardImage();
        } else if(card == "myCard4") {
            return myHand.getCard(3).getCardImage();
        } else if(card == "myCard5") {
            return myHand.getCard(4).getCardImage();
        } else if(card == "dealerCard1") {
            return dealerHand.getCard(0).getCardImage();
        } else if(card == "dealerCard2") {
            return dealerHand.getCard(1).getCardImage();
        } else if(card == "dealerCard3") {
            return dealerHand.getCard(2).getCardImage();
        } else if(card == "dealerCard4") {
            return dealerHand.getCard(3).getCardImage();
        } else if(card == "dealerCard5") {
            return dealerHand.getCard(4).getCardImage();
        } else {
            return null;
        }       
    }  
}

    