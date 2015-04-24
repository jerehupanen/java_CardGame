package GUI;

import cardBase.*;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import gameTypes.highLow;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class gamePanel_highLow extends javax.swing.JPanel {
    
    private highLow game = new highLow();
    private boolean playedGame;
    
    
    /**
     * Initializes the game view and makes restart button invisible
     */
    public gamePanel_highLow() {
        initComponents();
        Card card = game.getCurrentCard();
        BufferedImage cardIMG = card.getCardBackImage();
        Image scaledCard = cardIMG.getScaledInstance( 90, 138,  java.awt.Image.SCALE_SMOOTH ) ;
        cardImage.setIcon(new ImageIcon(scaledCard));
        lowerButton.setVisible      (false);
        higherButton.setVisible     (false);
        text_or.setVisible          (false);
        text_willTheNext.setVisible (false);
        text_cardBe.setVisible      (false);
        text_Score.setVisible       (false);
        score.setVisible            (false);
        finalScore.setVisible       (true);
        restartButton.setText("start playing!");
        restartButton.setVisible    (true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardImage = new javax.swing.JLabel();
        text_Score = new javax.swing.JLabel();
        text_cardBe = new javax.swing.JLabel();
        lowerButton = new javax.swing.JButton();
        text_or = new javax.swing.JLabel();
        higherButton = new javax.swing.JButton();
        text_willTheNext = new javax.swing.JLabel();
        finalScore = new javax.swing.JLabel();
        currentCard = new javax.swing.JLabel();
        restartButton = new javax.swing.JButton();
        score = new javax.swing.JLabel();
        score_popupJPanel = new javax.swing.JPanel();
        saveScoreJbutton = new javax.swing.JButton();
        namefield = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(850, 550));
        setLayout(null);
        add(cardImage);
        cardImage.setBounds(450, 120, 130, 160);

        text_Score.setFont(new java.awt.Font("04b03", 0, 48)); // NOI18N
        text_Score.setText("Score:");
        add(text_Score);
        text_Score.setBounds(360, 460, 160, 40);

        text_cardBe.setFont(new java.awt.Font("04b03", 0, 24)); // NOI18N
        text_cardBe.setText("card be");
        add(text_cardBe);
        text_cardBe.setBounds(120, 380, 96, 24);

        lowerButton.setFont(new java.awt.Font("04b03", 0, 36)); // NOI18N
        lowerButton.setText("lower");
        lowerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowerButtonActionPerformed(evt);
            }
        });
        add(lowerButton);
        lowerButton.setBounds(280, 340, 160, 80);

        text_or.setFont(new java.awt.Font("04b03", 0, 24)); // NOI18N
        text_or.setText("or");
        add(text_or);
        text_or.setBounds(480, 370, 27, 24);

        higherButton.setFont(new java.awt.Font("04b03", 0, 36)); // NOI18N
        higherButton.setText("higher");
        higherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                higherButtonActionPerformed(evt);
            }
        });
        add(higherButton);
        higherButton.setBounds(540, 340, 153, 80);

        text_willTheNext.setFont(new java.awt.Font("04b03", 0, 24)); // NOI18N
        text_willTheNext.setText("Will the next");
        add(text_willTheNext);
        text_willTheNext.setBounds(90, 350, 161, 24);

        finalScore.setFont(new java.awt.Font("04b03", 0, 40)); // NOI18N
        finalScore.setToolTipText("");
        add(finalScore);
        finalScore.setBounds(330, 470, 360, 40);

        currentCard.setFont(new java.awt.Font("04b_19", 0, 18)); // NOI18N
        add(currentCard);
        currentCard.setBounds(420, 300, 320, 30);

        restartButton.setFont(new java.awt.Font("04b03", 0, 36)); // NOI18N
        restartButton.setText("start again?");
        restartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartButtonActionPerformed(evt);
            }
        });
        add(restartButton);
        restartButton.setBounds(280, 340, 410, 80);

        score.setFont(new java.awt.Font("04b03", 0, 65)); // NOI18N
        score.setText("0");
        add(score);
        score.setBounds(540, 450, 110, 60);

        score_popupJPanel.setBackground(new java.awt.Color(153, 153, 153));
        score_popupJPanel.setLayout(null);

        saveScoreJbutton.setFont(new java.awt.Font("04b03", 0, 24)); // NOI18N
        saveScoreJbutton.setText("save score");
        saveScoreJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveScoreJbuttonActionPerformed(evt);
            }
        });
        score_popupJPanel.add(saveScoreJbutton);
        saveScoreJbutton.setBounds(100, 80, 180, 40);

        namefield.setFont(new java.awt.Font("04b03", 0, 24)); // NOI18N
        namefield.setText("type your nick here...");
        namefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namefieldActionPerformed(evt);
            }
        });
        score_popupJPanel.add(namefield);
        namefield.setBounds(50, 20, 279, 50);

        add(score_popupJPanel);
        score_popupJPanel.setBounds(310, 150, 360, 130);
    }// </editor-fold>//GEN-END:initComponents

    private void lowerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowerButtonActionPerformed
        
        playedGame = game.chooseLow();
    
        if(playedGame == true) {
                Card card = game.getCurrentCard();
                BufferedImage cardIMG = card.getCardBackImage();
                Image scaledCard = cardIMG.getScaledInstance( 90, 138,  java.awt.Image.SCALE_SMOOTH ) ;
                cardImage.setIcon(new ImageIcon(scaledCard));
                lowerButton.setVisible      (false);
                higherButton.setVisible     (false);
                text_or.setVisible          (false);
                text_willTheNext.setVisible (false);
                text_cardBe.setVisible      (false);
                text_Score.setVisible       (false);
                score.setVisible            (false);
                finalScore.setVisible       (true);
                restartButton.setText("play again?");
                restartButton.setVisible    (true);
                finalScore.setText("final score: " + game.getCurrentScore());
            }
            else {
                score.setText(game.getCurrentScore() + "");
            } 
        
        Card card = game.getCurrentCard();        
        BufferedImage cardIMG = card.getCardImage();
        Image scaledCard = cardIMG.getScaledInstance( 90, 138,  java.awt.Image.SCALE_SMOOTH ) ;
        cardImage.setIcon(new ImageIcon(scaledCard));
        currentCard.setText(game.getCurrentCard().toString() + " [" + game.getCurrentCard().getCardIntValue() + "]");                    
    }//GEN-LAST:event_lowerButtonActionPerformed

    private void higherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_higherButtonActionPerformed
        
        playedGame = game.chooseHigh();
    
        if(playedGame == true) {
                Card card = game.getCurrentCard();
                BufferedImage cardIMG = card.getCardBackImage();
                Image scaledCard = cardIMG.getScaledInstance( 90, 138,  java.awt.Image.SCALE_SMOOTH ) ;
                cardImage.setIcon(new ImageIcon(scaledCard));
                lowerButton.setVisible      (false);
                higherButton.setVisible     (false);
                text_or.setVisible          (false);
                text_willTheNext.setVisible (false);
                text_cardBe.setVisible      (false);
                text_Score.setVisible       (false);
                score.setVisible            (false);
                finalScore.setVisible       (true);
                finalScore.setText("final score: " + game.getCurrentScore());               
            }
            else {
                score.setText(game.getCurrentScore() + "");
            } 
        
        Card card = game.getCurrentCard();        
        BufferedImage cardIMG = card.getCardImage();
        Image scaledCard = cardIMG.getScaledInstance( 90, 138,  java.awt.Image.SCALE_SMOOTH ) ;
        cardImage.setIcon(new ImageIcon(scaledCard));
        currentCard.setText(game.getCurrentCard().toString() + " [" + game.getCurrentCard().getCardIntValue() + "]");    
        
    }//GEN-LAST:event_higherButtonActionPerformed

    private void restartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartButtonActionPerformed
                lowerButton.setVisible      (true);
                higherButton.setVisible     (true);
                text_or.setVisible          (true);
                text_willTheNext.setVisible (true);
                text_cardBe.setVisible      (true);
                text_Score.setVisible       (true);
                score.setVisible            (true);
                finalScore.setVisible       (false);
                restartButton.setVisible    (false);        
                playedGame = false;
                
                game = new highLow();
                Card card = game.getCurrentCard();
                BufferedImage cardIMG = card.getCardImage();
                Image scaledCard = cardIMG.getScaledInstance( 90, 138,  java.awt.Image.SCALE_SMOOTH ) ;
                cardImage.setIcon(new ImageIcon(scaledCard));
                
                currentCard.setText(game.getCurrentCard().toString() + " [" + game.getCurrentCard().getCardIntValue() + "]");
                score.setText(game.getCurrentScore() + "");
    }//GEN-LAST:event_restartButtonActionPerformed

    private void saveScoreJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveScoreJbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveScoreJbuttonActionPerformed

    private void namefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namefieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cardImage;
    private javax.swing.JLabel currentCard;
    private javax.swing.JLabel finalScore;
    private javax.swing.JButton higherButton;
    private javax.swing.JButton lowerButton;
    private javax.swing.JTextField namefield;
    private javax.swing.JButton restartButton;
    private javax.swing.JButton saveScoreJbutton;
    private javax.swing.JLabel score;
    private javax.swing.JPanel score_popupJPanel;
    private javax.swing.JLabel text_Score;
    private javax.swing.JLabel text_cardBe;
    private javax.swing.JLabel text_or;
    private javax.swing.JLabel text_willTheNext;
    // End of variables declaration//GEN-END:variables
}
