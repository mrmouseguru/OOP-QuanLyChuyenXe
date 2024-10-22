package ui;

import java.io.PrintWriter;

public class ThemCXOutputCUI {
	private PrintWriter screenPrompt = null;
	
	public ThemCXOutputCUI() {
		screenPrompt = new PrintWriter(System.out, true);
	}
	
	public  void showResult() {
		
		screenPrompt.println("Da Them Thanh Cong CX!!!");
		
	}

}
