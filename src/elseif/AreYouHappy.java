package elseif;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	int happy = JOptionPane.showOptionDialog(null,"are you happy?", "I like food.(so do dogs)", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new String[] {
			"yes ma'm ","nah","Idk anymore" },null);
	if(happy==0) {
		JOptionPane.showMessageDialog(null, "Nice");
		
	}
	if(happy==1||happy==2) {
		int wantHappy = JOptionPane.showOptionDialog(null, "Do you want 2 be happy my guy?", "Dogs r better than cats", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, 
				null, new String[] {
				"I guess","WAKE ME UP,WAKE ME UP INSIDE","IDK"
		}, null);
		if(wantHappy==2) {
			JOptionPane.showMessageDialog(null, "You should know by now ");
		}
		if(wantHappy==0||wantHappy==1) {
		JOptionPane.showOptionDialog(null, "Change", "doggie", JOptionPane.CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,  new ImageIcon(AreYouHappy.class.getResource("okay.jpeg")), null, null);
			
		}
	}
	}
	
}
	
	

