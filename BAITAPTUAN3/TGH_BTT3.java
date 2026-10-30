import java.util.Scanner;
public class TGH_BTT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        String maSach = sc.nextLine();

        System.out.print("Nhap ten sach: ");
        String tenSach = sc.nextLine();

        System.out.print("Nhap tac gia: ");
        String tacGia = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Nhap don gia: ");
        double donGia = Double.parseDouble(sc.nextLine().trim());

        System.out.print("Nhap so luong: ");
        int soLuong = Integer.parseInt(sc.nextLine().trim());

        double thanhTien = donGia * soLuong;

        double phiVanChuyen = thanhTien * 0.05;

        double tongTienNhap = thanhTien + phiVanChuyen;

        System.out.println();
        System.out.println("===== THONG TIN SACH =====");
        System.out.println("Ma sach       : " + maSach);
        System.out.println("Ten sach      : " + tenSach);
        System.out.println("Tac gia       : " + tacGia);
        System.out.println("Nam xuat ban  : " + namXuatBan);
        System.out.printf("Don gia       : %,.0f VND%n", donGia);
        System.out.println("So luong      : " + soLuong);
        System.out.printf("Thanh tien    : %,.0f VND%n", thanhTien);
        System.out.printf("Phi van chuyen: %,.0f VND%n", phiVanChuyen);
        System.out.printf("Tong tien nhap: %,.0f VND%n", tongTienNhap);
        sc.close();
    }
}