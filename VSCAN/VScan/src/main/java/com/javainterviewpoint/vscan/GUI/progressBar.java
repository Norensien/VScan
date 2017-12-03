/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javainterviewpoint.vscan.GUI;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
/**
 *
 * @author Dan
 */
public class progressBar extends JPanel {

 

  public static void main(String args[]) {
      JProgressBar pbar = new JProgressBar();
      pbar.setMinimum(0);
    pbar.setMaximum(100);
    JPanel test = new JPanel();
    JLabel retrieve = new JLabel();
    JLabel perc = new JLabel();
    retrieve.setText("Retrieving Vulnerabilities");
    
    
     progressBar it = new progressBar();
     it.add(pbar);
    JFrame frame = new JFrame("Progress Bar Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setPreferredSize(new Dimension(250, 120));
    frame.setLocationRelativeTo(null); 
    frame.setLayout(new GridLayout(0,1));
    test.setLayout(new FlowLayout());
    test.add(perc);
    test.add(pbar);
    frame.add(retrieve);
    frame.add(test);
    
    
    frame.pack();
    frame.setVisible(true);

    for (int i = 0; i <= 100; i++) {
      final int percent = i;
      try {
        SwingUtilities.invokeLater(new Runnable() {
          public void run() {
              
            pbar.setValue(percent);
            perc.setText(percent+"%");
          }
        });
        java.lang.Thread.sleep(100);
      } catch (InterruptedException e) {
        ;
      }
    }
    
    
  }
}