package BanHang;

import java.util.Arrays;

public class DanhSachHangHoa {
	
	private HangHoa[] dsh;
	private int soLuongHienTai;
	public DanhSachHangHoa(int n)
	{
		dsh = new HangHoa[n];
		soLuongHienTai=0;
	}
	
	public boolean themHangHoa(HangHoa hang) {
		if(soLuongHienTai >= dsh.length) {
			return false;
		}
		for(int i=0;i< soLuongHienTai;i++)
		{
			if(dsh[i].getMaHang().equals(hang.getMaHang())) {
				return false;
			}
		}
		dsh[soLuongHienTai++] = hang;
		return true;
	}
	
	public HangHoa[] getTatCaHangHoa() {
		return Arrays.copyOf(dsh, soLuongHienTai);
	}
	
	public HangHoa timKiemHangHoa(String maHang) {
		for(int i=0;i<soLuongHienTai;i++) {
			if(dsh[i].getMaHang().equals(maHang)) {
				return dsh[i];
			}
		}
		return null;
	}
}
