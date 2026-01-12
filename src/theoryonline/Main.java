import java.io.BufferedReader;
import java.util.Scanner;
public class Main {
     static void main(String[] args) {

        System.out.print("UTC : ");
        System.out.println("ĐẠi học giao thông vận tải  ");
        System.out.printf("Đào tạo %d nghành",20);
        System.out.println(" ");

//        Scanner nhap = new Scanner(System.in) ;
//        System.out.print("Nhap ten cau ban : ");
//        String name = nhap.nextLine();
//        System.out.print("Nhap điểm trung bình : ");
//        double dtb = nhap.nextDouble();
//
//        System.out.printf(" My name %s điểm  %f \n",name,dtb);
//        nhap.close();
//
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập chiều dài : ");
        double d = nhap.nextDouble();
        System.out.print("Nhap Chiều Rộng : ");
        double r = nhap.nextDouble();
        double chuVi = (d+r)*2;
        double dienTich = d*r;
        System.out.printf(" hình chữ nhật có chiều dài : %f , chiều rộng : %f",d,r );
        System.out.printf(" chu vi : %f chiều Rộng : %f",chuVi,dienTich);
        double min = Math.min(d,r);
        System.out.println(" Min  = "+min);
        nhap.close();
    }

}
