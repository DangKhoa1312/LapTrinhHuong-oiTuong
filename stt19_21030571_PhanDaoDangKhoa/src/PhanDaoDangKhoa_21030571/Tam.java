package PhanDaoDangKhoa_21030571;

public class Tam {
	private String ten;
	private double x;
	private double y;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) throws Exception {
		if(ten != null ) {
		this.ten = ten;
		}else {
			throw new Exception(" LOI ");
		}
		this.ten = ten; 
	}
		
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public Tam() {}
	public Tam(String ten, double x, double y) throws Exception {
		if(ten != null ) {
			this.ten = ten;
		}else {
			throw new Exception(" LOI ");
		}
		this.ten = ten;
		this.x = x;
		this.y = y;
	}
	public String toString() {
		String s ="";
		s = s+s.format("%2s(%2s, %2s)", getTen(), getX(), getY());
		return s;
	}
	public static void main(String[] args ) throws Exception {
		Tam t = new Tam("O", 2, 8);
		System.out.println(t);
	}
}
