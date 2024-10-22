package entity;

public class ChuyenXe {
	protected String maCX;

	protected  String nameTX;

	protected double doanhThu;

	protected ChuyenXe(String maCX, String nameTX, double doanhThu) {
		super();
		this.maCX = maCX;
		this.nameTX = nameTX;
		this.doanhThu = doanhThu;
	}
	
	public double getDoanhThu() {
		return doanhThu;
	}
	
	
	

}
