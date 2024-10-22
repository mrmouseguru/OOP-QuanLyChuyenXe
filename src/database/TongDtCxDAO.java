package database;

import entity.ChuyenXe;

public class TongDtCxDAO {
	
	public ChuyenXe[] getAllCx() {
		return ArrayMemoryCoSoDuLieu.queryAllCX();
	}

}
