package ui;

import java.io.PrintWriter;

import entity.ChuyenXe;

public class InDSCXOuputCUI {
	
private PrintWriter screenOut = null;
	
	public InDSCXOuputCUI() {
		screenOut = new PrintWriter(System.out, true);
	}
	
	public void inDSCX(ChuyenXe[] dscx) {
		
		for (ChuyenXe chuyenXe : dscx) {
			screenOut.println(chuyenXe);
		}
		
	}

	public void inDSCX(ChuyenXe[] listCx, int size) {
		
		for(int i = 0; i < size; i ++ ) {
			ChuyenXe cx = listCx[i];
			screenOut.println(cx);
		}
		
	}

}
