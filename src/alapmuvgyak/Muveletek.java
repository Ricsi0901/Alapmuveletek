package alapmuvgyak;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Muveletek extends javax.swing.JFrame {

    int osszKerdesekSzama = 0, osszProbalkozasokSzama = 0;
    int osztasKerdesekSzama = 0;
    int szorzasKerdesekSzama = 0;

    int osztasProbakSzama = 0;
    int szorzasProbakSzama = 0;
    JLabel[] lblTomb;
    String[] lbltextTomb;

    public Muveletek() {
        initComponents();
        lblTomb = new JLabel[]{lblOsszKerdes, lbllblOsszProba, lblOsszeadKerdes, lblOsszeadProba, lblKivonasKerdes, lblKivonasProba, lblOsztasKerdes, lblOsztasProba, lblSzorzasKerdes, lblSzorzasProba};
        lbltextTomb = new String[]{"Össz kérdések száma: ", "Össz Probálkozások száma: ","Összeadás: ","Összeadás: ","Kivonás: ","Kivonás: ","Osztás: ","Osztás: ","Szorzás: ","Szorzás: "};
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlGyakorlas = new javax.swing.JPanel();
        lblFeladat = new javax.swing.JLabel();
        txtEredmeny = new javax.swing.JTextField();
        btnEllenorzes = new javax.swing.JButton();
        lblValasz = new javax.swing.JLabel();
        btnUj = new javax.swing.JButton();
        btnMegoldas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblOsszKerdes = new javax.swing.JLabel();
        lbllblOsszProba = new javax.swing.JLabel();
        lblEredmeny = new javax.swing.JLabel();
        lblOsszeadKerdes = new javax.swing.JLabel();
        lblKivonasKerdes = new javax.swing.JLabel();
        lblOsztasKerdes = new javax.swing.JLabel();
        lblSzorzasKerdes = new javax.swing.JLabel();
        lblOsszeadProba = new javax.swing.JLabel();
        lblKivonasProba = new javax.swing.JLabel();
        lblOsztasProba = new javax.swing.JLabel();
        lblSzorzasProba = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFajl = new javax.swing.JMenu();
        mnuFajlMegnyit = new javax.swing.JMenuItem();
        mnuFajlMent = new javax.swing.JMenuItem();
        mnuFajlMentesMaskent = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuFajlKilep = new javax.swing.JMenuItem();
        mnuMuvelet = new javax.swing.JMenu();
        mnuMuveletOsszeadas = new javax.swing.JRadioButtonMenuItem();
        mnuMuveletKivonas = new javax.swing.JRadioButtonMenuItem();
        mnuMuveletOsztas = new javax.swing.JRadioButtonMenuItem();
        mnuMuveletSzorzas = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alapműveletek gyakoroltatása");

        pnlGyakorlas.setBorder(javax.swing.BorderFactory.createTitledBorder("Gyakorlás"));

        lblFeladat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btnEllenorzes.setText("Ellenőrzés");
        btnEllenorzes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEllenorzesActionPerformed(evt);
            }
        });

        lblValasz.setText("visszajelzés");

        javax.swing.GroupLayout pnlGyakorlasLayout = new javax.swing.GroupLayout(pnlGyakorlas);
        pnlGyakorlas.setLayout(pnlGyakorlasLayout);
        pnlGyakorlasLayout.setHorizontalGroup(
            pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblValasz, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                        .addComponent(lblFeladat, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEllenorzes)
                .addContainerGap())
        );
        pnlGyakorlasLayout.setVerticalGroup(
            pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFeladat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEllenorzes)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValasz, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnUj.setText("Új feladat");

        btnMegoldas.setText("Megoldás");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Statisztika"));

        lblOsszKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszKerdes.setText("Össz kérdések száma: 0");

        lbllblOsszProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbllblOsszProba.setText("Össz Probálkozások száma: 0");

        lblEredmeny.setText("Eredmény: 0 %");

        lblOsszeadKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszeadKerdes.setText("Összeadás: 0");

        lblKivonasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblKivonasKerdes.setText("Kivonás: 0");

        lblOsztasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsztasKerdes.setText("Osztás: 0");

        lblSzorzasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSzorzasKerdes.setText("Szorzás: 0");

        lblOsszeadProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszeadProba.setText("Összeadás: 0");

        lblKivonasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblKivonasProba.setText("Kivonás: 0");

        lblOsztasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsztasProba.setText("Osztás: 0");

        lblSzorzasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSzorzasProba.setText("Szorzás: 0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEredmeny)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOsszeadKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblKivonasKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsztasKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSzorzasKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsszKerdes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKivonasProba, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSzorzasProba, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsszeadProba, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsztasProba, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbllblOsszProba, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblKivonasKerdes, lblOsszeadKerdes, lblOsztasKerdes, lblSzorzasKerdes});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOsszKerdes)
                    .addComponent(lbllblOsszProba))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblOsszeadKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKivonasKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOsztasKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSzorzasKerdes))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblOsszeadProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKivonasProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOsztasProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSzorzasProba)))
                .addGap(18, 18, 18)
                .addComponent(lblEredmeny)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnuFajl.setText("Fájl");

        mnuFajlMegnyit.setText("Megnyit");
        mnuFajlMegnyit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFajlMegnyitActionPerformed(evt);
            }
        });
        mnuFajl.add(mnuFajlMegnyit);

        mnuFajlMent.setText("Ment");
        mnuFajlMent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFajlMentActionPerformed(evt);
            }
        });
        mnuFajl.add(mnuFajlMent);

        mnuFajlMentesMaskent.setText("Mentés másként...");
        mnuFajlMentesMaskent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFajlMentesMaskentActionPerformed(evt);
            }
        });
        mnuFajl.add(mnuFajlMentesMaskent);
        mnuFajl.add(jSeparator1);

        mnuFajlKilep.setText("Kilép");
        mnuFajl.add(mnuFajlKilep);

        jMenuBar1.add(mnuFajl);

        mnuMuvelet.setText("Műveletek");
        buttonGroup1.add(mnuMuvelet);

        buttonGroup1.add(mnuMuveletOsszeadas);
        mnuMuveletOsszeadas.setText("Összeadás");
        mnuMuvelet.add(mnuMuveletOsszeadas);

        buttonGroup1.add(mnuMuveletKivonas);
        mnuMuveletKivonas.setText("Kivonás");
        mnuMuvelet.add(mnuMuveletKivonas);

        buttonGroup1.add(mnuMuveletOsztas);
        mnuMuveletOsztas.setText("Osztás");
        mnuMuveletOsztas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMuveletOsztasActionPerformed(evt);
            }
        });
        mnuMuvelet.add(mnuMuveletOsztas);

        buttonGroup1.add(mnuMuveletSzorzas);
        mnuMuveletSzorzas.setText("Szorzás");
        mnuMuveletSzorzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMuveletSzorzasActionPerformed(evt);
            }
        });
        mnuMuvelet.add(mnuMuveletSzorzas);

        jMenuBar1.add(mnuMuvelet);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlGyakorlas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUj)
                            .addComponent(btnMegoldas))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMegoldas))
                    .addComponent(pnlGyakorlas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String mentettFajl;
    private void mnuFajlMentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFajlMentActionPerformed
//        JFileChooser fc = new JFileChooser();
//        fc.setDialogTitle("Fájl mentése");
//        fc.setCurrentDirectory(new File("."));
//        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//
//        int valasztottGombErteke = fc.showSaveDialog(this);
//        if (valasztottGombErteke == JFileChooser.APPROVE_OPTION) {
//            File f = fc.getSelectedFile();
//            if (f.isDirectory()) {
//                lblEredmeny.setText("<html>Elérés: " + f.getPath() + "<br>Könyvtár: " + f.getName() + "</html>");
//                try {
//                    Files.write(Paths.get(f.getPath(), "stat.txt"), "Statisztika: ".getBytes());
//                } catch (IOException ex) {
//                    Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }
        if (mentettFajl == null) { // még nincs mentett fájl
            mnuFajlMentesMaskentActionPerformed(evt); //1. mentésnél nevet kell adni, és helyet kell választani.
        } else {
            // ez írja ki
            try {
                // menteni a meglévő helyen és helyre
                Files.write(Paths.get(mentettFajl), tartalomOsszeallitasa().getBytes());
            } catch (IOException ex) {
                Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
            }
            // ez írja ki vége
        }
    }//GEN-LAST:event_mnuFajlMentActionPerformed

    private void mnuFajlMentesMaskentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFajlMentesMaskentActionPerformed
        // név és hely választása
        JFileChooser fc = new JFileChooser(new File("."));
        fc.setDialogTitle("Mentés másként");

        fc.setAcceptAllFileFilterUsed(false);

        FileNameExtensionFilter imgfilter = new FileNameExtensionFilter("PNG és GIF képek", "png", "gif");
        fc.addChoosableFileFilter(imgfilter);
        FileNameExtensionFilter txtfilter = new FileNameExtensionFilter("csak szöveg (*.txt)", "txt");
        fc.addChoosableFileFilter(txtfilter);
        FileNameExtensionFilter bpfilter = new FileNameExtensionFilter("saját (*.bp)", "bp");
        fc.addChoosableFileFilter(bpfilter);

        fc.setFileFilter(txtfilter);
        /* Tesztesetek:
        - kiterjesztés megváltoztatása
        - olyan kiterjesztés írása, ami nincs a listában
        - üresen marad a fájl neve
        - másik mappa kiválasztása
         */

        int valasztottGombErteke = fc.showSaveDialog(this);
        if (valasztottGombErteke == JFileChooser.APPROVE_OPTION) {
            File f = fc.getSelectedFile();
            String[] kit = ((FileNameExtensionFilter) fc.getFileFilter()).getExtensions();
            String fn = f.getPath() + "." + kit[0];

            if (!fn.endsWith("." + kit[0])) {
                fn += "." + kit[0];
            }

            boolean mentes = true;
            Path path = Paths.get(fn);
            if (Files.exists(path)) {
                valasztottGombErteke = JOptionPane.showConfirmDialog(this, "A fájl létezik!\nFelülírjam?", "A fájl már létezik!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (valasztottGombErteke == JOptionPane.NO_OPTION) {
                    mentes = false;
                }
            }

            lblEredmeny.setText("<html>Elérés: " + fn + "<br>Fájl neve: " + f.getName() + "." + kit[0] + "</html>");
            try {
                if (mentes) {
                    Files.write(path, tartalomOsszeallitasa().getBytes());
                }
            } catch (IOException ex) {
                Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Mentés másként megszakítva!", "NINCS MENTÉS!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_mnuFajlMentesMaskentActionPerformed

    private void mnuFajlMegnyitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFajlMegnyitActionPerformed
        JFileChooser fc = new JFileChooser(new File("."));
        fc.setDialogTitle("Fájl megynyitás");

        /*választható fájl típusok*/
        FileNameExtensionFilter imgfilter = new FileNameExtensionFilter("PNG és GIF képek", "png", "gif");
        fc.addChoosableFileFilter(imgfilter);
        FileNameExtensionFilter txtfilter = new FileNameExtensionFilter("csak szöveg (*.txt)", "txt");
        fc.addChoosableFileFilter(txtfilter);
        FileNameExtensionFilter bpfilter = new FileNameExtensionFilter("saját (*.bp)", "bp");
        fc.addChoosableFileFilter(bpfilter);

        fc.setFileFilter(txtfilter);

        int valasztottGombErteke = fc.showOpenDialog(this);
        if (valasztottGombErteke == JFileChooser.APPROVE_OPTION) {
            File f = fc.getSelectedFile();
            String fn = f.getPath();
            lblEredmeny.setText("<html>Elérés: " + fn + "<br>Fájl neve: " + f.getName() + "</html>");
            /*
            ez nyitja meg
             */
            Path path = Paths.get(fn);
            try {
//                byte[] bajtTomb=Files.readAllBytes(path); betűnként, ráadásul ASCII kóddal
                List<String> stringLista = Files.readAllLines(path);
                int lblindex=0;
                for (int i = 0; i < stringLista.size(); i++) {
                    String egySor = stringLista.get(i);
                    String[] adatok = egySor.split(": ");
                    JLabel lbl=lblTomb[lblindex+1];
                    lbl.setText(lbltextTomb[lblindex+1] + adatok[2]);
                    adatok = adatok[1].split(" ");
                     lbl=lblTomb[lblindex];
                    lbl.setText(lbltextTomb[lblindex] + adatok[0]);
                    lblindex+=2;
                }
//                String egySor = stringLista.get(1);
//                String[] adatok = egySor.split(": ");
//                
//                String proSz=adatok[2];
//                //int szam=Integer.parseInt(proSz);
//                lbllblOsszProba.setText("Össz Probálkozások száma: "+proSz);
//                adatok=adatok[1].split(" ");
//                String kerSz=adatok[0];
//                lblOsszKerdes.setText("Össz kérdések száma: "+kerSz);
//                
//                //összeadás
//                egySor = stringLista.get(2);
//                adatok = egySor.split(": ");                
//                proSz=adatok[2];
//                lblOsszeadProba.setText("Összeadás: "+proSz);
//                adatok=adatok[1].split(" ");
//                kerSz=adatok[0];
//                lblOsszeadKerdes.setText("Összeadás: "+kerSz);
////                kivonás
//                egySor = stringLista.get(3);
//                adatok = egySor.split(": ");   
//                
//                proSz=adatok[2];
//                lblKivonasProba.setText("Kivonás: "+proSz);
//                adatok=adatok[1].split(" ");
//                kerSz=adatok[0];
//                lblKivonasKerdes.setText("Kivonás: "+kerSz);
////                osztas
//                egySor = stringLista.get(4);
//                adatok = adatok[1].split(": ");                
//                proSz=adatok[2];
//                lblOsszeadProba.setText("Osztás: "+proSz);
//                adatok=adatok[1].split(" ");
//                kerSz=adatok[0];
//                lblOsszeadKerdes.setText("osztás: "+kerSz);
////                szorzás
//                egySor = stringLista.get(5);
//                adatok = egySor.split(": ");                
//                proSz=adatok[2];
//                lblOsszeadProba.setText("Szorzás: "+proSz);
//                adatok=adatok[1].split(" ");
//                kerSz=adatok[0];
//                lblOsszeadKerdes.setText("Szorzás: "+kerSz);
//                
//                egySor = stringLista.get(2);
//                adatok = egySor.split(": ");                
//                proSz=adatok[2];
//                lblOsszeadProba.setText("Összeadás: "+proSz);
//                adatok=adatok[1].split(" ");
//                kerSz=adatok[0];
//                lblOsszeadKerdes.setText("Összeadás: "+kerSz);
                int i = 7;
            } catch (Exception ex) {
                Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Megnyitás megszakítva!", "NINCS Megnyitás!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_mnuFajlMegnyitActionPerformed

    private void mnuMuveletOsztasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMuveletOsztasActionPerformed
        /* osztás kérdést generálni... */
        int szam1, szam2;
        boolean jo;
        do {
            szam1 = (int) (Math.random() * 101);
            szam2 = (int) (Math.random() * 99) + 1;
            jo = szam2 != 0 && szam1 % szam2 == 0 && szam1 > szam2;
        } while (!jo);
        lblFeladat.setText(szam1 + " / " + szam2 + " = ");

        /*statisztika*/
        osszKerdesekSzama++;
        lblOsszKerdes.setText("Össz kérdések száma: " + osszKerdesekSzama);

        osztasKerdesekSzama++;
        lblOsztasKerdes.setText("Osztás: " + osztasKerdesekSzama);
    }//GEN-LAST:event_mnuMuveletOsztasActionPerformed

    private void mnuMuveletSzorzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMuveletSzorzasActionPerformed
        /* szorzás kérdést generálni... */

 /*statisztika*/
        osszKerdesekSzama++;
        lblOsszKerdes.setText("Össz kérdések száma: " + osszKerdesekSzama);

        szorzasKerdesekSzama++;
        lblSzorzasKerdes.setText("Szorzás: " + szorzasKerdesekSzama);
    }//GEN-LAST:event_mnuMuveletSzorzasActionPerformed

    private void btnEllenorzesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEllenorzesActionPerformed
        /*válasz ellenőrzése*/

 /*statisztika*/
        osszProbalkozasokSzama++;
        lbllblOsszProba.setText("Össz próbálkozások száma: " + osszProbalkozasokSzama);

        if (mnuMuveletOsztas.isSelected()) {
            osztasProbakSzama++;
            lblOsztasProba.setText("Osztás: " + osztasProbakSzama);
        } else if (mnuMuveletSzorzas.isSelected()) {
            szorzasProbakSzama++;
            lblSzorzasProba.setText("Szorzás: " + szorzasProbakSzama);
        }
    }//GEN-LAST:event_btnEllenorzesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Muveletek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEllenorzes;
    private javax.swing.JButton btnMegoldas;
    private javax.swing.JButton btnUj;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblEredmeny;
    private javax.swing.JLabel lblFeladat;
    private javax.swing.JLabel lblKivonasKerdes;
    private javax.swing.JLabel lblKivonasProba;
    private javax.swing.JLabel lblOsszKerdes;
    private javax.swing.JLabel lblOsszeadKerdes;
    private javax.swing.JLabel lblOsszeadProba;
    private javax.swing.JLabel lblOsztasKerdes;
    private javax.swing.JLabel lblOsztasProba;
    private javax.swing.JLabel lblSzorzasKerdes;
    private javax.swing.JLabel lblSzorzasProba;
    private javax.swing.JLabel lblValasz;
    private javax.swing.JLabel lbllblOsszProba;
    private javax.swing.JMenu mnuFajl;
    private javax.swing.JMenuItem mnuFajlKilep;
    private javax.swing.JMenuItem mnuFajlMegnyit;
    private javax.swing.JMenuItem mnuFajlMent;
    private javax.swing.JMenuItem mnuFajlMentesMaskent;
    private javax.swing.JMenu mnuMuvelet;
    private javax.swing.JRadioButtonMenuItem mnuMuveletKivonas;
    private javax.swing.JRadioButtonMenuItem mnuMuveletOsszeadas;
    private javax.swing.JRadioButtonMenuItem mnuMuveletOsztas;
    private javax.swing.JRadioButtonMenuItem mnuMuveletSzorzas;
    private javax.swing.JPanel pnlGyakorlas;
    private javax.swing.JTextField txtEredmeny;
    // End of variables declaration//GEN-END:variables

    private String tartalomOsszeallitasa() {
        String statisztika = "Az alapműveletek gyakoroltatása:\n";

        final int HE = 3; //Helyi érték 3 helyen
        final int KERDES_MAX_HOSSZ = lblTomb[0].getText().length();
        final int PROBA_MAX_HOSSZ = lblTomb[1].getText().length();

        for (int i = 0; i < lblTomb.length - 1; i += 2) {
            JLabel lblKerdes = lblTomb[i];
            JLabel lblProba = lblTomb[i + 1];
            String format = "%" + (KERDES_MAX_HOSSZ + HE) + "s%" + (PROBA_MAX_HOSSZ + HE) + "s\n";
            statisztika += String.format(format, lblKerdes.getText(), lblProba.getText());
//            statisztika += lblKerdes.getText() + "\t";           
//            statisztika += lblProba.getText() + "\n";
        }

//        for (JLabel lbl: lblTomb) {
//            statisztika += lbl.getText() + "\n";
//        }
//        statisztika += lblOsszKerdes.getText() + "\n";
//        statisztika += lbllblOsszProba.getText() + "\n";
        return statisztika;
    }
}
