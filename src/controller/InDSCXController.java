package controller;

import database.InDsCxDAO;
import entity.ChuyenXe;
import ui.InDSCXOuputCUI;

public class InDSCXController {
	
	private InDsCxDAO inDsCxDAO = null;
	private InDSCXOuputCUI dsCXOut = null;
	
	public InDSCXController() {
		inDsCxDAO = new InDsCxDAO();
		dsCXOut = new InDSCXOuputCUI();
		
	}
	
	
	
	public void getDSCX() {
		
		ChuyenXe[] listCx = inDsCxDAO.getAllCX();
		int size = inDsCxDAO.getCountCX();
		
		dsCXOut.inDSCX(listCx, size);
		
	}
	
	
}
