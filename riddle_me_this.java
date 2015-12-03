import javax.swing.JOptionPane;

public class riddle_me_this {


		public static void main(String[] args) {

			// 1. Make a variable to hold the score
      String score = "";
			// 3. Ask the user a riddle. Here are some ideas: bit.ly/the-riddler
           String riddle = JOptionPane.showInputDialog("this five letter word becomes shorter when you add two letters to it");
			// 4. If they got the answer right, pop up "correct!" and increase the score by one
            if( riddle .equals ("short")){
            	JOptionPane.showMessageDialog(null, "correct");
            }
            else{
            	JOptionPane.showMessageDialog(null, "wrong");
            }
			// 5. Otherwise, say "wrong" and tell them the answer
 
           // String riddle2 = JOptionPane.showInputDialog(null, "Four cars come to a four way stop, all coming from a different direction. They can't decide who got there first, so they all go forward at the same time. They do not crash into each other, but all four cars go. How is this possible?");
          
		

			//}
            

			// 2. Make a pop up to show the score.
			JOptionPane.showMessageDialog(null, score);
		}
}
	



