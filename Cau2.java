public class Cau2 {
    private String tenDangNhap;
    private String password;
    private String ngayTao;
    private int soBaiDaDang;
    public Cau2() {}
    public Cau2(String tenDangNhap, String password, String ngayTao, int soBaiDaDang) {
        this.tenDangNhap = tenDangNhap;
        this.password = password;
        this.ngayTao = ngayTao;
        this.soBaiDaDang = soBaiDaDang;
    }
    public boolean doiMatKhau(String old_pw, String new_pw) {
        if(password.equals(old_pw)) {
            password=new_pw;
            return true;
        }
        return false;
    }
    public String loaiThanhVien() {
        if(soBaiDaDang>=50) {
            return "Thanh vien VIP";
        } else if(soBaiDaDang>=30 && soBaiDaDang<50) {
            return "Thanh vien nang dong";
        } else if(soBaiDaDang>=5 && soBaiDaDang<30) {
            return "Thanh vien co dong gop";
        }
            return "Thanh vien moi";
    }
    @Override
    public String toString() {
        return "("+tenDangNhap+","+ngayTao+","+loaiThanhVien()+")";
    }
    public static void main(String args[]) {
        Cau2 tv1 = new Cau2("huong", "12345", "24/3/2023", 5);
        System.out.println(tv1.toString());
    }
}