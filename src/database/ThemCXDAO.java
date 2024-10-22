package database;

import entity.ChuyenXe;

public class ThemCXDAO {
	
	public void themCX(ChuyenXe cx) {
		
		ArrayMemoryCoSoDuLieu.insertCX(cx);
		
	}
	
	

}
