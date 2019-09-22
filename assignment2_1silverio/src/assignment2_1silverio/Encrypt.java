package assignment2_1silverio;

import java.math.BigInteger;

import javax.swing.JOptionPane;

public class Encrypt {
	
	public static void main (String args[]) {
		int digit1, digit2, digit3, digit4, encryptedNumber, number = 0;
		BigInteger input = new BigInteger("0");
		boolean isValidNumber = false;
			while(!isValidNumber) {
				try {
					String inputString = JOptionPane.showInputDialog ("Enter a 4-Dnumber.");
					if(inputString==null) {
						System.exit(0);
					}
			input= new BigInteger(inputString);
				}
				
				catch(Exception e) {
				}
			if(input.intValue()>999 && input.intValue()<10000) {
				isValidNumber=true;
				number = input.intValue();
			}
}
			digit1= (number/1000+7)%10;
			   digit2= (number%1000/100+7)%10;
		         digit3= (number%100/10+7)%10;
		         digit4=(number%10+7)%10;
		         encryptedNumber= digit1*10+digit2 + digit3*1000 + digit4*100;
		         JOptionPane.showMessageDialog (null, "Encrypted number is" +
		encryptedNumber,
		         " Encyptor", JOptionPane.INFORMATION_MESSAGE);
		         System.exit(0);
		         
		         class Decrypt {
		              public void main (String args [] ) {
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
		         }
		    }

