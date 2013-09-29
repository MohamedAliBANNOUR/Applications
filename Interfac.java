package TPTLC;

import java.awt.Color;
import javax.swing.JFrame;


public class Interfac extends javax.swing.JFrame {
 
   
    public Interfac() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entte = new javax.swing.JPanel();
        Saisie = new javax.swing.JTextField();
        compiler = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultat = new javax.swing.JTextArea();
        III = new javax.swing.JButton();
        VI = new javax.swing.JButton();
        II = new javax.swing.JButton();
        X = new javax.swing.JButton();
        IV = new javax.swing.JButton();
        I = new javax.swing.JButton();
        XI = new javax.swing.JButton();
        V = new javax.swing.JButton();
        VII = new javax.swing.JButton();
        VIII = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        icone = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        entte.setBackground(new java.awt.Color(255, 255, 102));
        entte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 5));
        entte.setForeground(new java.awt.Color(255, 255, 51));

        Saisie.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Saisie.setSelectionColor(new java.awt.Color(204, 51, 0));
        Saisie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaisieActionPerformed(evt);
            }
        });

        compiler.setBackground(new java.awt.Color(51, 153, 255));
        compiler.setForeground(new java.awt.Color(102, 0, 0));
        compiler.setText("=");
        compiler.setToolTipText("calculer une expression arithmétique  ecrite en chiffres Romains.");
        compiler.setMaximumSize(new java.awt.Dimension(51, 23));
        compiler.setMinimumSize(new java.awt.Dimension(51, 23));
        compiler.setNextFocusableComponent(Resultat);
        compiler.setPreferredSize(new java.awt.Dimension(51, 23));
        compiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compilerActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("ENTER VOTRE EXPRESSION");

        jLabel2.setBackground(new java.awt.Color(255, 255, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("RESULT");

        Resultat.setEditable(false);
        Resultat.setColumns(20);
        Resultat.setRows(5);
        Resultat.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("InternalFrame.borderShadow"), 2));
        Resultat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(Resultat);

        III.setText("III");
        III.setMaximumSize(new java.awt.Dimension(51, 23));
        III.setMinimumSize(new java.awt.Dimension(51, 23));
        III.setPreferredSize(new java.awt.Dimension(51, 23));
        III.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IIIActionPerformed(evt);
            }
        });

        VI.setText("VI");
        VI.setMaximumSize(new java.awt.Dimension(51, 23));
        VI.setMinimumSize(new java.awt.Dimension(51, 23));
        VI.setPreferredSize(new java.awt.Dimension(51, 23));
        VI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VIActionPerformed(evt);
            }
        });

        II.setText("II");
        II.setMaximumSize(new java.awt.Dimension(51, 23));
        II.setMinimumSize(new java.awt.Dimension(51, 23));
        II.setPreferredSize(new java.awt.Dimension(51, 23));
        II.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IIActionPerformed(evt);
            }
        });

        X.setText("X");
        X.setMaximumSize(new java.awt.Dimension(51, 23));
        X.setMinimumSize(new java.awt.Dimension(51, 23));
        X.setPreferredSize(new java.awt.Dimension(51, 23));
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });

        IV.setText("IV");
        IV.setMaximumSize(new java.awt.Dimension(51, 23));
        IV.setMinimumSize(new java.awt.Dimension(51, 23));
        IV.setPreferredSize(new java.awt.Dimension(51, 23));
        IV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IVActionPerformed(evt);
            }
        });

        I.setText("I");
        I.setMaximumSize(new java.awt.Dimension(51, 23));
        I.setMinimumSize(new java.awt.Dimension(51, 23));
        I.setPreferredSize(new java.awt.Dimension(51, 23));
        I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IActionPerformed(evt);
            }
        });

        XI.setText("IX");
        XI.setMaximumSize(new java.awt.Dimension(51, 23));
        XI.setMinimumSize(new java.awt.Dimension(51, 23));
        XI.setPreferredSize(new java.awt.Dimension(51, 23));
        XI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XIActionPerformed(evt);
            }
        });

        V.setText("V");
        V.setMaximumSize(new java.awt.Dimension(51, 23));
        V.setMinimumSize(new java.awt.Dimension(51, 23));
        V.setPreferredSize(new java.awt.Dimension(51, 23));
        V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VActionPerformed(evt);
            }
        });

        VII.setText("VII");
        VII.setMaximumSize(new java.awt.Dimension(51, 23));
        VII.setMinimumSize(new java.awt.Dimension(51, 23));
        VII.setPreferredSize(new java.awt.Dimension(51, 23));
        VII.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VIIActionPerformed(evt);
            }
        });

        VIII.setText("VIII");
        VIII.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VIIIActionPerformed(evt);
            }
        });

        jButton1.setText("-");
        jButton1.setMaximumSize(new java.awt.Dimension(51, 23));
        jButton1.setMinimumSize(new java.awt.Dimension(51, 23));
        jButton1.setPreferredSize(new java.awt.Dimension(51, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("+");
        jButton2.setMaximumSize(new java.awt.Dimension(51, 23));
        jButton2.setMinimumSize(new java.awt.Dimension(51, 23));
        jButton2.setPreferredSize(new java.awt.Dimension(51, 23));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("*");
        jButton3.setMaximumSize(new java.awt.Dimension(51, 23));
        jButton3.setMinimumSize(new java.awt.Dimension(51, 23));
        jButton3.setPreferredSize(new java.awt.Dimension(51, 23));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("/");
        jButton4.setMaximumSize(new java.awt.Dimension(51, 23));
        jButton4.setMinimumSize(new java.awt.Dimension(51, 23));
        jButton4.setPreferredSize(new java.awt.Dimension(51, 23));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText(")");
        jButton5.setMaximumSize(new java.awt.Dimension(51, 23));
        jButton5.setMinimumSize(new java.awt.Dimension(51, 23));
        jButton5.setPreferredSize(new java.awt.Dimension(51, 23));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("(");
        jButton6.setMaximumSize(new java.awt.Dimension(51, 23));
        jButton6.setMinimumSize(new java.awt.Dimension(51, 23));
        jButton6.setPreferredSize(new java.awt.Dimension(51, 23));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TPTLC/image/logo.gif"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Projet TLC");

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TPTLC/image/back.jpg"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("$");
        jButton8.setMaximumSize(new java.awt.Dimension(51, 23));
        jButton8.setMinimumSize(new java.awt.Dimension(51, 23));
        jButton8.setPreferredSize(new java.awt.Dimension(51, 23));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout entteLayout = new javax.swing.GroupLayout(entte);
        entte.setLayout(entteLayout);
        entteLayout.setHorizontalGroup(
            entteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entteLayout.createSequentialGroup()
                .addGroup(entteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entteLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(151, 151, 151)
                        .addComponent(icone))
                    .addGroup(entteLayout.createSequentialGroup()
                        .addGroup(entteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(entteLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(entteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(entteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                                    .addComponent(Saisie)))
                            .addGroup(entteLayout.createSequentialGroup()
                                .addGap(369, 369, 369)
                                .addComponent(compiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(entteLayout.createSequentialGroup()
                                .addGap(263, 263, 263)
                                .addGroup(entteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(entteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(entteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entteLayout.createSequentialGroup()
                                                .addComponent(I, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(II, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entteLayout.createSequentialGroup()
                                                .addComponent(IV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(V, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(entteLayout.createSequentialGroup()
                                            .addComponent(VII, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(VIII)))
                                    .addGroup(entteLayout.createSequentialGroup()
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24)
                                .addGroup(entteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(entteLayout.createSequentialGroup()
                                        .addComponent(VI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(entteLayout.createSequentialGroup()
                                        .addComponent(III, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(entteLayout.createSequentialGroup()
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(entteLayout.createSequentialGroup()
                                        .addGroup(entteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(XI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(entteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 223, Short.MAX_VALUE)))
                .addContainerGap())
        );
        entteLayout.setVerticalGroup(
            entteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(entteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(entteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icone)
                    .addComponent(jLabel4))
                .addGap(94, 94, 94)
                .addGroup(entteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(entteLayout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(entteLayout.createSequentialGroup()
                        .addGroup(entteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Saisie, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(entteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(entteLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(entteLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel2)))
                        .addGap(12, 12, 12)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(entteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(entteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(XI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(entteLayout.createSequentialGroup()
                        .addGroup(entteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VII, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VIII))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(entteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(V, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(entteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(II, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(III, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(I, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(entteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(entteLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(entteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(entteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(entteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(compiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        jLabel1.getAccessibleContext().setAccessibleName("ENTRER VOTRE EXPRESSION :");
        jLabel2.getAccessibleContext().setAccessibleName("Result");
        jLabel4.getAccessibleContext().setAccessibleName("PROJET TLC");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(entte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void SaisieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaisieActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_SaisieActionPerformed


private void compilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compilerActionPerformed
         
                
                String chaine=Saisie.getText();
                
                  if(chaine.charAt(chaine.length()-1)!='$'){
                    System.out.println(true); 
                  Resultat.setForeground(Color.red);
                  
                 Resultat.append("ENTRER UNE EXRESSION TERMINANT PAR $!"+"\n");
                 }
                  else{
                AnalyseurLexical  anal=new AnalyseurLexical(chaine,0);
    try{
                   
                 AnalyseurSyntaxique asY =new AnalyseurSyntaxique(anal);
                 String re=asY.Affichage();
                 Resultat.setForeground(Color.blue);
                 
                 Resultat.append(re+"\n");    
                 
                  
                 
               
                
    }catch(StringIndexOutOfBoundsException e){
                  ;
    }  
         }   
}//GEN-LAST:event_compilerActionPerformed

    private void IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IActionPerformed
      String S=Saisie.getText();  // TODO add your handling code here:
        Saisie.setText(S+"I");
    }//GEN-LAST:event_IActionPerformed

    private void VIIIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VIIIActionPerformed
        // TODO add your handling code here:
         String S=Saisie.getText();  // TODO add your handling code here:
        Saisie.setText(S+"VIII");
    }//GEN-LAST:event_VIIIActionPerformed

    private void VIIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VIIActionPerformed
        // TODO add your handling code here:
         String S=Saisie.getText();  // TODO add your handling code here:
        Saisie.setText(S+"VII");
    }//GEN-LAST:event_VIIActionPerformed

    private void XIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XIActionPerformed
 String S=Saisie.getText();  // TODO add your handling code here:
        Saisie.setText(S+"IX");        // TODO add your handling code here:
    }//GEN-LAST:event_XIActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String S=Saisie.getText();  // TODO add your handling code here:
        Saisie.setText(S+"-");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void IVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IVActionPerformed
String S=Saisie.getText();  // TODO add your handling code here:
        Saisie.setText(S+"IV");        // TODO add your handling code here:
    }//GEN-LAST:event_IVActionPerformed

    private void VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VActionPerformed
        // TODO add your handling code here:
    String S=Saisie.getText();  // TODO add your handling code here:
        Saisie.setText(S+"V"); 
    }//GEN-LAST:event_VActionPerformed

    private void VIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VIActionPerformed
        // TODO add your handling code here:
        String S=Saisie.getText();  // TODO add your handling code here:
        Saisie.setText(S+"VI"); 
    }//GEN-LAST:event_VIActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String S=Saisie.getText();  // TODO add your handling code here:
        Saisie.setText(S+"+");         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void IIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IIActionPerformed
String S=Saisie.getText();  // TODO add your handling code here:
        Saisie.setText(S+"II");         // TODO add your handling code here:
    }//GEN-LAST:event_IIActionPerformed

    private void IIIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IIIActionPerformed
        // TODO add your handling code here:
        String S=Saisie.getText();  // TODO add your handling code here:
        Saisie.setText(S+"III"); 
    }//GEN-LAST:event_IIIActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String S=Saisie.getText();  // TODO add your handling code here:
        Saisie.setText(S+"*"); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
String S=Saisie.getText();  // TODO add your handling code here:
        Saisie.setText(S+"(");         // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XActionPerformed
        // TODO add your handling code here:
        String S=Saisie.getText();  // TODO add your handling code here:
        Saisie.setText(S+"X"); 
    }//GEN-LAST:event_XActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String S=Saisie.getText();  // TODO add your handling code here:
        Saisie.setText(S+")"); 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String S=Saisie.getText();  // TODO add your handling code here:
        Saisie.setText(S+"/"); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         String S=Saisie.getText();  // TODO add your handling code here:
         
        S = S.substring(0, S.length()-1);
        Saisie.setText(S); 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        String S=Saisie.getText();  // TODO add your handling code here:
        Saisie.setText(S+"$"); 
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
  
    
    public static void main(String args[]) {
       
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Interfac().setVisible(true);
            }
        });
    }
    	


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton I;
    private javax.swing.JButton II;
    private javax.swing.JButton III;
    private javax.swing.JButton IV;
    private javax.swing.JTextArea Resultat;
    private javax.swing.JTextField Saisie;
    private javax.swing.JButton V;
    private javax.swing.JButton VI;
    private javax.swing.JButton VII;
    private javax.swing.JButton VIII;
    private javax.swing.JButton X;
    private javax.swing.JButton XI;
    private javax.swing.JButton compiler;
    private javax.swing.JPanel entte;
    private javax.swing.JLabel icone;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
