package entity;

public class NoiThanh extends ChuyenXe{
	
	private String soTuyen;
	private int soKm;
	
	public NoiThanh(String maCX, String nameTX, double doanhThu, String soTuyen, int soKm) {
		super(maCX, nameTX, doanhThu);
		this.soTuyen = soTuyen;
		this.soKm = soKm;
	}
	
	

	
}
