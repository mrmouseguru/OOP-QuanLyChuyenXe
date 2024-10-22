package ui;

import java.io.PrintWriter;

public class DoanhThuOutputCUI {
	
private PrintWriter screenOut = null;
	
	public DoanhThuOutputCUI() {
		screenOut = new PrintWriter(System.out, true);
	}
	
	public void inDtTheoLoaiCx(double tongDtNoiThanh, double tongDtNgoaiThanh) {
		
		screenOut.println("Tong doanh thu Ngoai Thanh la: " + tongDtNgoaiThanh);
		screenOut.println("Tong doanh thu Noi Thanh la: " + tongDtNoiThanh);

		
	}

}
