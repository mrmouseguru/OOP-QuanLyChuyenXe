package controller;

import database.TongDtCxDAO;
import entity.ChuyenXe;
import entity.NgoaiThanh;
import entity.NoiThanh;
import ui.DoanhThuOutputCUI;

public class DoanhThuCxController {
	private TongDtCxDAO dtCxDAO = null;
	private DoanhThuOutputCUI  dtOutputCUI = null;
	
	public DoanhThuCxController(TongDtCxDAO dtCxDAO, DoanhThuOutputCUI dtOutputCUI) {
		this.dtCxDAO = dtCxDAO;
		this.dtOutputCUI = dtOutputCUI;
	}
	
	public DoanhThuCxController() {
		dtCxDAO = new TongDtCxDAO();
		dtOutputCUI = new DoanhThuOutputCUI();
	}
	
	public void tinhTongDtTheoLoai() {
		double tongDtNoiThanh = 0, tongDtNgoaiThanh = 0;
		ChuyenXe[] dsCX = dtCxDAO.getAllCx();
		
		for (ChuyenXe cx : dsCX) {
			
			if(cx instanceof NoiThanh) {
				tongDtNoiThanh += cx.getDoanhThu();
			}
			
			if(cx instanceof NgoaiThanh) {
				tongDtNgoaiThanh += cx.getDoanhThu();
			}
			
			
		}
		
		//in
		dtOutputCUI.inDtTheoLoaiCx(tongDtNoiThanh, tongDtNgoaiThanh);
		
	}
	
	
	
}
