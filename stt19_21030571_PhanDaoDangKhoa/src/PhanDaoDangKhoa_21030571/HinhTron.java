package PhanDaoDangKhoa_21030571;

public class HinhTron {
	private double banKinh;
	private Tam t;
	public Tam getT() {
		return t;
	}
	public void setT(Tam t) throws Exception {
		if(t != null) {
			this.t = t;
		}else {
			throw new Exception(" LOI ");
		}
	}
	public static final double PI = 3.1416;
	public double getBanKinh() {
		return banKinh;
	}
	public void setBanKinh(double bk ) throws Exception {
		if(bk>0) {
			this.banKinh = bk;
		}else {
			throw new Exception(" LOI ");
		}
	}
	public HinhTron() {}
	public HinhTron(double banKinh, Tam t) {
		super();
		this.banKinh = banKinh;
		this.t = t;
	}
	//
	public double getDienTich() {
		return getBanKinh() *getBanKinh() *PI;
	}
	public double getChuVi() {
		return getBanKinh() *2*PI;
	}
	public String toString() {
		String m="";
		m+=m.format("%-3s, %10s, %10s", getBanKinh(), getDienTich(), getChuVi());
		return m;
	}
	public static void main(String[] args ) throws Exception {
		HinhTron h1 = new HinhTron(10, new Tam("O", 12, 12));
		System.out.println(h1);
	}

}
