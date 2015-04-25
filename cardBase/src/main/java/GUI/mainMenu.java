package GUI;

import cardBase.*;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

public class mainMenu extends javax.swing.JPanel {

     private CardDeck deck = new CardDeck();
    
    /**
     * Initializes main menu
     */
    public mainMenu() {
        initComponents();
        deck.fillDeck(); 
        deck.shuffleDeck();
        cardCount.setText(deck.getRemainingCards() + ""); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainMenu = new javax.swing.JPanel();
        dealCardBtn = new javax.swing.JButton();
        getFreshDeckBtn = new javax.swing.JButton();
        cardCount = new javax.swing.JLabel();
        CardsRemaining = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        play_highLow_button = new javax.swing.JButton();
        cardImage = new javax.swing.JLabel();

        mainMenu.setMaximumSize(new java.awt.Dimension(1920, 1080));
        mainMenu.setPreferredSize(new java.awt.Dimension(850, 550));

        dealCardBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dealCardBtn.setText("Deal a Card");
        dealCardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealCardBtnActionPerformed(evt);
            }
        });

        getFreshDeckBtn.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        getFreshDeckBtn.setText("Get a Fresh Deck");
        getFreshDeckBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getFreshDeckBtnActionPerformed(evt);
            }
        });

        cardCount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cardCount.setText("---");

        CardsRemaining.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CardsRemaining.setText("Cards left in deck:");

        logoLabel.setFont(new java.awt.Font("04b03", 0, 48)); // NOI18N
        logoLabel.setText("cardBase");

        play_highLow_button.setFont(new java.awt.Font("04b03", 0, 24)); // NOI18N
        play_highLow_button.setText("highLow");
        play_highLow_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_highLow_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoLabel)
                    .addComponent(play_highLow_button, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 313, Short.MAX_VALUE)
                .addComponent(dealCardBtn)
                .addGap(114, 114, 114))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuLayout.createSequentialGroup()
                        .addComponent(CardsRemaining)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cardCount, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuLayout.createSequentialGroup()
                        .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cardImage, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getFreshDeckBtn))
                        .addGap(89, 89, 89))))
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addComponent(cardImage, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dealCardBtn)
                        .addGap(18, 18, 18)
                        .addComponent(getFreshDeckBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CardsRemaining)
                            .addComponent(cardCount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(play_highLow_button, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 844, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dealCardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealCardBtnActionPerformed
        
        Card card = deck.dealCard();
        BufferedImage cardIMG = card.getCardImage();
        Image scaledCard = cardIMG.getScaledInstance( 90, 138,  java.awt.Image.SCALE_SMOOTH ) ;
        cardImage.setIcon(new ImageIcon(scaledCard));
        cardCount.setText(deck.getRemainingCards() + "");
        card = deck.dealCard();
        if ( deck.getRemainingCards() == 0 )
        dealCardBtn.setEnabled(false);
    }//GEN-LAST:event_dealCardBtnActionPerformed

    private void getFreshDeckBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getFreshDeckBtnActionPerformed
        deck = new CardDeck();
        deck.fillDeck();
        cardCount.setText(deck.getRemainingCards() + "");
        dealCardBtn.setEnabled(true);

        //Checks if file path is correct
        /*      File file = new File("src/main/java/cardImages/c2.png");
        System.out.println("File exists: " + file.exists());
        System.out.println(file.getAbsolutePath()); */
    }//GEN-LAST:event_getFreshDeckBtnActionPerformed

    private void play_highLow_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_highLow_buttonActionPerformed
        MainMenuLayout.button_game_highLow();
    }//GEN-LAST:event_play_highLow_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CardsRemaining;
    private javax.swing.JLabel cardCount;
    private javax.swing.JLabel cardImage;
    private javax.swing.JButton dealCardBtn;
    private javax.swing.JButton getFreshDeckBtn;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JButton play_highLow_button;
    // End of variables declaration//GEN-END:variables
}