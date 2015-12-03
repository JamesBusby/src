

	// Copyright Wintriss Technical Schools 2014
	import javax.swing.JOptionPane;

	/*
	 * Everyone has a superpower. Mine is writing recipes. This program will store
	 * the superpowers of all the people in the classroom. E.g. When I type "June",
	 * your program should say "June's superpower is writing recipies".
	 */
	public class x_geeks {
	public static void main(String[] args) {

			// 1. Save the superpower for each person in a variable.
          String James = "your super power is flying";
          String Lucas  = "your super power is Ghost-Ability";
          String Conrad = "your super power is super-speed";
          String Chloe = "your super power is shape-shifting";
          String Aria = "you have infinite wishes, and you're still a POTATO!!";
          String Eric = "your super power is blinking";
          String Casy = "your super power is average Joe";
          String Betsy = "your super power is Drinking Tea";
	
          for (int i = 0; i < 1000; i++) {
			
		
          // 2. Ask the user to enter a name. Store their answer in a variable.
          	String answer1 = JOptionPane.showInputDialog("Please enter your name.");
			// 3. Show the superpower in a pop-up, depending on the name entered. 
          if (answer1 .equalsIgnoreCase("James")){
        	  JOptionPane.showMessageDialog(null, James);
          }
          else if (answer1 .equalsIgnoreCase("Lucas")){
        	  JOptionPane.showMessageDialog(null, Lucas);
          }
          else if (answer1 .equalsIgnoreCase("Conrad")){
        	  JOptionPane.showMessageDialog(null, Conrad);
          }
          else if (answer1 .equalsIgnoreCase("Chloe")){
        	  JOptionPane.showMessageDialog(null, Chloe);
          }
          else if (answer1 .equalsIgnoreCase("Aria")){
        	 JOptionPane.showMessageDialog(null,  "you have infinite wishes, and you're still a POTATO!!");
          }
          else if (answer1 .equalsIgnoreCase(Eric)){
        	  JOptionPane.showMessageDialog(null, Eric);
          }
          else if (answer1 .equalsIgnoreCase("Kc")){
        	  JOptionPane.showMessageDialog(null, Casy);
          }
          else if (answer1 .equalsIgnoreCase("Betsy")){
            	  JOptionPane.showMessageDialog(null, Betsy);
          }
         
          
	}
        		  

		}
	}
	
          
	
	



