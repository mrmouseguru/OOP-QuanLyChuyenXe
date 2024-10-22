package ui;

import java.io.PrintWriter;
import java.util.Scanner;

import controller.DoanhThuCxController;
import controller.InDSCXController;

public class CXMenuConsoleUI {
	private Scanner keyBoardInput = null;
	private String prompt = null; // loi nhac cho giao dien nay
	private PrintWriter screenPrompt = null;
	private ThemCXInputCUI themCXCUI = null;
	private InDSCXController inDSCX = null;
	private DoanhThuCxController dtController = null;

	public CXMenuConsoleUI() {
		prompt = "-> ";
		keyBoardInput = new Scanner(System.in);
		screenPrompt = new PrintWriter(System.out, true);
		themCXCUI = new ThemCXInputCUI();
		inDSCX = new InDSCXController();
		dtController = new DoanhThuCxController();
	}

	public void controlLoop() {
		String command = " ";
		screenPrompt.println("go lenh \"help\" de duoc ho tro");

		while (true) {
			screenPrompt.print(prompt);
			screenPrompt.flush();
			command = keyBoardInput.nextLine();
			command = command.trim();

			if (command.equalsIgnoreCase("help")) {
				help();
				continue;
			}

			if (command.equalsIgnoreCase("add")) {

				themCX();
				continue;

			}

			if (command.equalsIgnoreCase("print")) {

				inDSCX();
				continue;

			}
			
			if (command.equalsIgnoreCase("dt")) {

				tinhDTTheoLoai();
				continue;

			}
			
			if (command.equalsIgnoreCase("quit")) {

				break;

			}

		}
	}

	private void help() {
		screenPrompt.println("~~~~~Console Heplp Menu~~~~~");
		screenPrompt.println("[HELP] Ho tro su dung phan mem");
		screenPrompt.println("[ABOUT] Thong tin ve phan mem");
		screenPrompt.println("[ADD] Them moi Chuyen xe");
		screenPrompt.println("[PRINT] In Danh Sach Chuyen Xe");
		screenPrompt.println("[DT] Tinh tong Doanh Thu Loai CX");
		screenPrompt.println("[QUIT] Dong phan mem");



	}

	private void themCX() {

		themCXCUI.nhapThongTinCX();
	}

	private void inDSCX() {
		inDSCX.getDSCX();

	}
	
	private void tinhDTTheoLoai() {
		dtController.tinhTongDtTheoLoai();
	}

}
