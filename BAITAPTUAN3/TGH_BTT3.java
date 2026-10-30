import java.time.Year;
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

        System.out.println();

        int namHienTai = Year.now().getValue();
        boolean hopLe = true;
 
        if (donGia <= 0) {
            System.out.println("Loi: Don gia phai lon hon 0.");
            hopLe = false;
        }
        if (soLuong < 0) {
            System.out.println("Loi: So luong phai lon hon hoac bang 0.");
            hopLe = false;
        }
        if (namXuatBan < 1900 || namXuatBan > namHienTai) {
            System.out.println("Loi: Nam xuat ban phai tu 1900 den " + namHienTai + ".");
            hopLe = false;
        }
 
        if (!hopLe) {
            System.out.println("=> Sach KHONG hop le, dung chuong trinh.");
            sc.close();
            return;
        }
        System.out.println("=> Sach hop le.");
 
        double thanhTien = donGia * soLuong;
        double phiVanChuyen = thanhTien * 0.05;
        double tongTienNhap = thanhTien + phiVanChuyen;

        String loaiGia;
        if (donGia < 50000) {
            loaiGia = "Sach gia thap";
        } else if (donGia <= 100000) {
            loaiGia = "Sach gia trung binh";
        } else if (donGia <= 200000) {
            loaiGia = "Sach gia cao";
        } else {
            loaiGia = "Sach gia dac biet";
        }
 
        String tonKho;
        if (soLuong == 0) {
            tonKho = "Het sach";
        } else if (soLuong <= 5) {
            tonKho = "Sap het";
        } else if (soLuong <= 20) {
            tonKho = "Con it";
        } else {
            tonKho = "Con nhieu";
        }
 
        System.out.println();
        System.out.println("Chon loai sach:");
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");
        System.out.print("Nhap lua chon (1-4): ");
        int luaChon = Integer.parseInt(sc.nextLine().trim());
 
        String loaiSach;
        switch (luaChon) {
            case 1:
                loaiSach = "Sach giao khoa";
                break;
            case 2:
                loaiSach = "Sach tham khao";
                break;
            case 3:
                loaiSach = "Sach chuyen nganh";
                break;
            case 4:
                loaiSach = "Sach khac";
                break;
            default:
                loaiSach = "Lua chon khong hop le";
        }
 
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
        System.out.println("Phan loai gia : " + loaiGia);
        System.out.println("Ton kho       : " + tonKho);
        System.out.println("Loai sach     : " + loaiSach);
 
        sc.close();
    }
}