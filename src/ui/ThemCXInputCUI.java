package ui;

import java.io.PrintWriter;
import java.util.Scanner;

import controller.ThemCXController;

public class ThemCXInputCUI {
	private Scanner keyBoardInput = null;
	private PrintWriter screenPrompt = null;
	private String maCXPrompt, nameTXPrompt, doanhThuPrompt, 
	soTuyenPrompt, soKmPrompt, noiDenPrompt, soNgayPrompt, loaiCX;
	private ThemCXController themCXController = null;
	
	public ThemCXInputCUI() {
		screenPrompt =  new PrintWriter(System.out, true);
		keyBoardInput = new Scanner(System.in);
		themCXController = new ThemCXController();
		
		maCXPrompt = "MA CHUYEN XE: "; 
		nameTXPrompt = "TEN TAI XE: ";
		doanhThuPrompt = "DOANH THU: "; 
		soTuyenPrompt = "TUYEN DUONG: "; soKmPrompt = "SO KM: "; 
		noiDenPrompt = " NOI DEN: "; soNgayPrompt = "SO NGAY: ";
		loaiCX = "LOAI CHUYEN XE [\"Noi\" / \"Ngoai\"]: ";
	}
	
	
	public void nhapThongTinCX() {
		screenPrompt.print(maCXPrompt);screenPrompt.flush();
		int maCX = keyBoardInput.nextInt();keyBoardInput.nextLine();
		screenPrompt.print(nameTXPrompt);screenPrompt.flush();
		String nameTX = keyBoardInput.nextLine();
		screenPrompt.print(doanhThuPrompt);screenPrompt.flush();
		double doanhThu = keyBoardInput.nextDouble();keyBoardInput.nextLine();
		screenPrompt.print(loaiCX);screenPrompt.flush();
		String loaiCX = keyBoardInput.nextLine();
		
		if("Noi".equalsIgnoreCase(loaiCX)) {
			screenPrompt.print(soTuyenPrompt);screenPrompt.flush();
			String tuyenDuong = keyBoardInput.nextLine();
			screenPrompt.print(soKmPrompt);screenPrompt.flush();
			double soKm = keyBoardInput.nextDouble();
			
			themCXController.themCX(maCX, nameTX, doanhThu, tuyenDuong, soKm);


		}
		
		if("Ngoai".equalsIgnoreCase(loaiCX)) {
			screenPrompt.print(noiDenPrompt);screenPrompt.flush();
			String noiDen = keyBoardInput.nextLine();
			screenPrompt.print(soNgayPrompt);screenPrompt.flush();
			int soNgay = keyBoardInput.nextInt();
			
			themCXController.themCX(maCX, nameTX, doanhThu, noiDen, soNgay);
		}
		
		
	}
	
	public void setThemCXController(ThemCXController themCXController) {
		this.themCXController = themCXController;
	}

}
