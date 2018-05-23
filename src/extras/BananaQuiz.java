//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extras;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String Banana=JOptionPane.showInputDialog("Do you like Bananas?");
		
		//2. if they say no, 
			if(Banana.equalsIgnoreCase("No")){
		//tell them they are crazy 
				JOptionPane.showMessageDialog(null,"YOU ARE CRAZY!!");
			//and end quiz
			}
				//3. if they say yes
			else if(Banana.equalsIgnoreCase("Yes")) {
		//	ask them what is their favorite hobby
	String Hobby=JOptionPane.showInputDialog("What is your favorite Hobby");
				//	show a pop up that says "<your hobby> is much better with bananas!"
		JOptionPane.showMessageDialog(null,Hobby+"is MUCH better with a Banana!");
			}
		
			//4. OPTIONAL: if they say something other than “yes” or “no”
		//	show a pop up that says “You are bananas!”
			else {
				JOptionPane.showMessageDialog(null,"You are Bananas!");
			}
			
			
	}

}
