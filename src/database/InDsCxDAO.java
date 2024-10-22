package database;

import entity.ChuyenXe;

public class InDsCxDAO {
	
	public ChuyenXe[] getAllCX() {
		
		return ArrayMemoryCoSoDuLieu.queryAllCX();
	}
	
	public int getCountCX() {
		return ArrayMemoryCoSoDuLieu.getCountCX();
	}

}
