package BanHang;

import java.time.LocalDate;
import java.util.Date;

public class HangThucPham extends HangHoa{
	
	private String nhaCungCap;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;
	
	public HangThucPham() {
		super();
		this.nhaCungCap= "";
		this.ngaySanXuat =LocalDate.now();
		this.ngayHetHan = LocalDate.now();
	}
	
	public HangThucPham(String maHang, String tenHang, double donGia, int soLuongTon, String nhaCungCap, LocalDate ngaySanXuat,LocalDate ngayHetHan) {
		super();
		this.nhaCungCap = nhaCungCap;
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
	}
	
	

	public String getNhaCungCap() {
		return nhaCungCap;
	}

	public void setNhaCungCap(String nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if(ngaySanXuat.isAfter(LocalDate.now()))
			throw new RuntimeException("ngay san xuat phai truoc ngay hien tai");
		this.ngaySanXuat = ngaySanXuat;
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		if(ngayHetHan.isBefore(ngaySanXuat))
			throw new RuntimeException("ngay het han phai sau ngay san xuat");
		this.ngayHetHan = ngayHetHan;
	}

	@Override
	public String getDanhGiaBuonBan() {
		LocalDate currentDate = LocalDate.now();
		if(soLuongTon > 0 && (ngayHetHan.isBefore(currentDate)))
		{
			return "kho ban";
		}
		return "khong danh gia";
	}

	@Override
	public double getTienThue() {
		return donGia *0.05;
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