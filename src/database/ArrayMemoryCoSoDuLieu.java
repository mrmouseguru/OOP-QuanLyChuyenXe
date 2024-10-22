package database;

import entity.ChuyenXe;
import entity.NgoaiThanh;
import entity.NoiThanh;

public class ArrayMemoryCoSoDuLieu {
	
	private static ChuyenXe[] listCX = null;
	private static int countCX = 0;
	
	public static void initDatabase() {
		listCX = new ChuyenXe[100];
		insertCX(new NoiThanh("cx1", "Le Van Teo", 5.5, "tuyen 55", 55));
		insertCX(new NgoaiThanh("cx2", "Le Van Tung", 100, "Binh Chanh", 5));
		
	}
	
	
	public static void insertCX(ChuyenXe cx) {
		// TODO Auto-generated method stub
		listCX[countCX] = cx;
		countCX++;
		
	}

	public static ChuyenXe[] queryAllCX() {
		return listCX;
	}
	
	public static int getCountCX() {
		return countCX;
	}

}
