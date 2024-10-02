package BanHang;

import java.time.LocalDate;

public class HangSanhSu extends HangHoa{

	private static String nhaSanXuat;
	private LocalDate ngayNhapKho;
	
	
	public HangSanhSu() {
		super(getNhaSanXuat());
		this.nhaSanXuat = " ";
		this.ngayNhapKho = LocalDate.now();
	}
	
	public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon,String nhaSanXuat ,LocalDate ngayNhapKho) {
		super(nhaSanXuat);
		this.nhaSanXuat = nhaSanXuat;
		this.ngayNhapKho = ngayNhapKho;
	}
	
	
	
	
	public static String getNhaSanXuat() {
		try {
			try {
				return nhaSanXuat;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nhaSanXuat;
	}

	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}

	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}

	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		this.ngayNhapKho = ngayNhapKho;
	}

	@Override
	public String getDanhGiaBuonBan() {
		if(soLuongTon > 50 )
			return "ban cham";
		else 
		return "khong danh gia";
	}

	@Override
	public double getTienThue() {
		return donGia * 0.1;
	}

	@Override
	public double getTienVAT() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String danhGia() {
		// TODO Auto-generated method stub
		return null;
	}	
}
