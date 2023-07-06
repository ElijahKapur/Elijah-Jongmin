
package utilites;

import java.awt.event.KeyEvent;

public class Key {
	
	private static Key[] keys =makeKeyboard();
	private  boolean hasbeenpressed = false;
	private  boolean ispressed = false;
	private String name;
	private int index;
	private String words ="";
	
	//
	public Key(String name,int index){
		this.name = name;
		this.index = index;
	}
	//This method stops keys inouts being called as fast as the refresh rate
	public int StickKey(boolean ispressed) { 
		int change =0;
		if (ispressed && !hasbeenpressed){
			change=1;
		}
		if(ispressed) {
			hasbeenpressed=true;
		}
		else {
			hasbeenpressed=false;
		}
		return(change);
	}
	private static Key[] makeKeyboard() {
		keys = new Key[30];
		String aphebet = "QWERTYUIOPLKJHGFDSAZXCVBNM";
		for(int i =0; i<26; i++) {
			keys[i] = new Key(aphebet.substring(i, i+1),i);
		}
		keys[26] = new Key("backspace",26);
		keys[27] = new Key("space", 27);
		keys[28] = new Key("Enter", 28);
		
		
		return(keys);
	}
	//this method outputs the key that is pressed at the time of method call
	// if multiple keys are pressed at the same time only one key will be outputed
	// that outputed key will be the key that is checked first
	
	//Soo only call this method if the input will be a single key press
	public static String checkKeyBoard() {
		if (1== keys[26].StickKey(GDV5.KeysPressed[KeyEvent.VK_BACK_SPACE] )) {	return("BackSpace");} 
		if (1== keys[27].StickKey(GDV5.KeysPressed[KeyEvent.VK_SPACE] )) {return(" ");}
		if(1== keys[0].StickKey(GDV5.KeysPressed[KeyEvent.VK_Q])){return("Q");}
		if(1== keys[1].StickKey(GDV5.KeysPressed[KeyEvent.VK_W])){return("W");}
		if (1== keys[2].StickKey(GDV5.KeysPressed[KeyEvent.VK_E])) {return("E");}
		if (1== keys[3].StickKey(GDV5.KeysPressed[KeyEvent.VK_R])) {return("R");}
		if (1== keys[4].StickKey(GDV5.KeysPressed[KeyEvent.VK_T])) {return("T");}
		if (1== keys[5].StickKey(GDV5.KeysPressed[KeyEvent.VK_Y])) {return("Y");}
		if (1== keys[6].StickKey(GDV5.KeysPressed[KeyEvent.VK_U])) {return("U");}
		if (1== keys[7].StickKey(GDV5.KeysPressed[KeyEvent.VK_I])) {return("I");}
		if (1== keys[8].StickKey(GDV5.KeysPressed[KeyEvent.VK_O])) {return("O");}
		if (1== keys[9].StickKey(GDV5.KeysPressed[KeyEvent.VK_P])) {return("P");}
		if (1== keys[10].StickKey(GDV5.KeysPressed[KeyEvent.VK_A])) {return("A");}
		if (1== keys[11].StickKey(GDV5.KeysPressed[KeyEvent.VK_S])) {return("S");}
		if (1== keys[12].StickKey(GDV5.KeysPressed[KeyEvent.VK_D])) {return("D");}
		if (1== keys[13].StickKey(GDV5.KeysPressed[KeyEvent.VK_F])) {return("F");}
		if (1== keys[14].StickKey(GDV5.KeysPressed[KeyEvent.VK_G])) {return("G");}
		if (1== keys[15].StickKey(GDV5.KeysPressed[KeyEvent.VK_H])) {return("H");}
		if (1== keys[16].StickKey(GDV5.KeysPressed[KeyEvent.VK_J])) {return("J");}
		if (1== keys[17].StickKey(GDV5.KeysPressed[KeyEvent.VK_K])) {return("K");}
		if (1== keys[18].StickKey(GDV5.KeysPressed[KeyEvent.VK_L])) {return("L");}
		if (1== keys[19].StickKey(GDV5.KeysPressed[KeyEvent.VK_Z])) {return("Z");}
		if (1== keys[20].StickKey(GDV5.KeysPressed[KeyEvent.VK_X])) {return("X");}
		if (1== keys[21].StickKey(GDV5.KeysPressed[KeyEvent.VK_C])) {return("C");}
		if (1== keys[22].StickKey(GDV5.KeysPressed[KeyEvent.VK_V])) {return("V");}
		if (1== keys[23].StickKey(GDV5.KeysPressed[KeyEvent.VK_B])) {return("B");}
		if (1== keys[24].StickKey(GDV5.KeysPressed[KeyEvent.VK_N])) {return("N");}
		if (1== keys[25].StickKey(GDV5.KeysPressed[KeyEvent.VK_M])) {return("M");}
		if (1== keys[28].StickKey(GDV5.KeysPressed[KeyEvent.VK_ENTER])) {return("Enter");}
		return("");
			

		
	}
	//This method checks all keys at once and outputs the keys that are pressed at the time 
	//the method is called. 
	public static String checkKeyExtra() {
		String output="";
		if (1== keys[26].StickKey(GDV5.KeysPressed[KeyEvent.VK_BACK_SPACE] )) {	output+="BackSpace";} 
		if (1== keys[27].StickKey(GDV5.KeysPressed[KeyEvent.VK_SPACE] )) {	output+=" ";}
		if(1== keys[0].StickKey(GDV5.KeysPressed[KeyEvent.VK_Q])){output+="Q";}
		if(1== keys[1].StickKey(GDV5.KeysPressed[KeyEvent.VK_W])){	output+="W";}
		if (1== keys[2].StickKey(GDV5.KeysPressed[KeyEvent.VK_E])) {output+="E";}
		if (1== keys[3].StickKey(GDV5.KeysPressed[KeyEvent.VK_R])) {output+="R";}
		if (1== keys[4].StickKey(GDV5.KeysPressed[KeyEvent.VK_T])) {output+="T";}
		if (1== keys[5].StickKey(GDV5.KeysPressed[KeyEvent.VK_Y])) {output+="Y";}
		if (1== keys[6].StickKey(GDV5.KeysPressed[KeyEvent.VK_U])) {output+="U";}
		if (1== keys[7].StickKey(GDV5.KeysPressed[KeyEvent.VK_I])) {output+="I";}
		if (1== keys[8].StickKey(GDV5.KeysPressed[KeyEvent.VK_O])) {output+="O";}
		if (1== keys[9].StickKey(GDV5.KeysPressed[KeyEvent.VK_P])) {output+="P";}
		if (1== keys[10].StickKey(GDV5.KeysPressed[KeyEvent.VK_A])) {output+="A";}
		if (1== keys[11].StickKey(GDV5.KeysPressed[KeyEvent.VK_S])) {output+="S";}
		if (1== keys[12].StickKey(GDV5.KeysPressed[KeyEvent.VK_D])) {output+="D";}
		if (1== keys[13].StickKey(GDV5.KeysPressed[KeyEvent.VK_F])) {output+="F";}
		if (1== keys[14].StickKey(GDV5.KeysPressed[KeyEvent.VK_G])) {output+="G";}
		if (1== keys[15].StickKey(GDV5.KeysPressed[KeyEvent.VK_H])) {output+="H";}
		if (1== keys[16].StickKey(GDV5.KeysPressed[KeyEvent.VK_J])) {output+="J";}
		if (1== keys[17].StickKey(GDV5.KeysPressed[KeyEvent.VK_K])) {output+="K";}
		if (1== keys[18].StickKey(GDV5.KeysPressed[KeyEvent.VK_L])) {output+="L";}
		if (1== keys[19].StickKey(GDV5.KeysPressed[KeyEvent.VK_Z])) {output+="Z";}
		if (1== keys[20].StickKey(GDV5.KeysPressed[KeyEvent.VK_X])) {output+="X";}
		if (1== keys[21].StickKey(GDV5.KeysPressed[KeyEvent.VK_C])) {output+="C";}
		if (1== keys[22].StickKey(GDV5.KeysPressed[KeyEvent.VK_V])) {output+="V";}
		if (1== keys[23].StickKey(GDV5.KeysPressed[KeyEvent.VK_B])) {output+="B";}
		if (1== keys[24].StickKey(GDV5.KeysPressed[KeyEvent.VK_N])) {output+="N";}
		if (1== keys[25].StickKey(GDV5.KeysPressed[KeyEvent.VK_M])) {output+="M";}
		if (1== keys[28].StickKey(GDV5.KeysPressed[KeyEvent.VK_ENTER])) {output+="Enter";}
		return(output);
			

		
	}
	//don;t use this method it is only for reference when making checkkeyboard code in main method;
	public String makeLetters() {
		String nextLetter = Key.checkKeyBoard();
		if (nextLetter.equals("BackSpace")) {
			if(words.length()>0) {
			words = words.substring(0, words.length()-1);}
			nextLetter="";
		}
		words+= nextLetter;
		return(words);
	}
}
	
