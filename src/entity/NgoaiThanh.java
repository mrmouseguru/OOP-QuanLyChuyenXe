package entity;

public class NgoaiThanh extends ChuyenXe{
	
	private String noiDen;
	private int soNgay;
	
	public NgoaiThanh(String maCX, String nameTX, double doanhThu, String noiDen, int soNgay) {
		super(maCX, nameTX, doanhThu);
		this.noiDen = noiDen;
		this.soNgay = soNgay;
	}

}
