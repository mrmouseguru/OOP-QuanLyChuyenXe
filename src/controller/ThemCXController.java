package controller;

import database.ThemCXDAO;
import entity.ChuyenXe;
import entity.NgoaiThanh;
import entity.NoiThanh;
import ui.ThemCXOutputCUI;

public class ThemCXController {
	private ThemCXOutputCUI themCxOut = null;
	private ThemCXDAO themCXDAO = null;

	public ThemCXController() {
		themCxOut = new ThemCXOutputCUI();
		themCXDAO = new ThemCXDAO();
	}

	public void themCX(int maCX, String nameTX, double doanhThu, String tuyenDuong, double soKm) {
		// TODO Auto-generated method stub

		NoiThanh noiThanh = new NoiThanh(tuyenDuong, nameTX, doanhThu, tuyenDuong, maCX);

		themCX(noiThanh);

	}

	public void themCX(int maCX, String nameTX, double doanhThu, String noiDen, int soNgay) {

		NgoaiThanh xeNgoai = new NgoaiThanh(noiDen, nameTX, doanhThu, noiDen, soNgay);

		themCX(xeNgoai);

	}
	
	private void themCX(ChuyenXe cx) {
		themCXDAO.themCX(cx);
		themCxOut.showResult();
	}

}
