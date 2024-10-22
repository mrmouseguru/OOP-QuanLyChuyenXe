package ui;

import database.ArrayMemoryCoSoDuLieu;

public class ChuyenXeApp {
	
	public static ArrayMemoryCoSoDuLieu database = null;
	
	public static void main(String[] args) {

		//khoi tao csdl
		ArrayMemoryCoSoDuLieu.initDatabase();
		
		CXMenuConsoleUI menu = new CXMenuConsoleUI();
		
		menu.controlLoop();
		
		
	}
	
	
	
	
	

}
