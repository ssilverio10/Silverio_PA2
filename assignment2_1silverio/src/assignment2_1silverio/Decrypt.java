package assignment2_1silverio;

import javax.swing.JOptionPane;

public class Decrypt {
     public void main(String args [] ) {
          int digit1, digit2, digit3, digit4, decryptedNumber, number;
          number= Integer.parseInt(JOptionPane.showInputDialog ("Enter a 4-Dnumber: "));
          digit1= (number/1000+3)%10;
          digit2= (number%1000/100+3)%10;
          digit3= (number%100/10+3)%10;
          digit4=(number%10+3)%10;
          decryptedNumber= (digit1*10)+digit2 +(digit3*1000)+(digit4*100);
          JOptionPane.showMessageDialog (null, "Decrypted number is " +
decryptedNumber,
          " Encyptor", JOptionPane.INFORMATION_MESSAGE);
          System.exit(0);
          }
     
     }

