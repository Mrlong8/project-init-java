import java.util.Scanner;

public class baithuchanh01 {
    static void main(String[] args) {
        // bài tập 3 Viết chương trình: Nhập vào hai số nguyên x, y.
        //Xuất ra màn hình tổng, hiệu, tích, thương của hai số trên.

        Scanner nhap = new Scanner(System.in);
        System.out.print(" The first number : ");
        int x = nhap.nextInt();
        System.out.print(" The second number : ");
        int y = nhap.nextInt();
        int tong = x + y;
        int hieu = x - y;
        int tich = x * y;
        double thuong = (double)x / y;
        System.out.println(" x + y = "+tong);
        System.out.println(" x - y = "+hieu);
        System.out.println(" x * y = "+tich);
        System.out.println(" x / y = "+thuong);

//        Bài tập 4: Viết chương trình nhập từ bàn phím 2 cạnh cuả
//        hình chữ nhật. Tính và xuất chu vi, diện tích và cạnh nhỏ
//        nhất của hình chữ nhật.
//                Hướng dẫn:
//        Chu vi = (dai+rong)*2
//        Dientich=Dai*rong
//        Canhhonhat=Math.min(dai,rong
        System.out.println("=========== Hình Chữ Nhật =========== ");
        System.out.print("The length : ");
        int length = nhap.nextInt();
        System.out.print("The width : ");
        int width = nhap.nextInt();
        int ChuVi = (length + width) * 2;
        int DienTich = length * width;
        int CanhMax = Math.max(length,width);
        System.out.println("Chu vi hình chữ nhật là : "+ChuVi);
        System.out.println("Diện Tích hình chữ nhật là : "+DienTich);
        System.out.println("Cạnh Lớn nhất : "+CanhMax);

//        viết trương trình nhập các hệ số của phương trình bập 2 và tính căn dental và xuất căn dental ra màn hình

        System.out.println("======= Nhập các hệ số của phương trình bậc 2  ax^2 + bx + c = 0 ===========");
        System.out.print("Nhập hệ số của x^2  a = ");
        int a = nhap.nextInt();
        System.out.print("Nhâp hệ số của x b = ");
        int b = nhap.nextInt();
        System.out.print("Nhập hệ số c = ");
        int c = nhap.nextInt();
        double dental = b*b - 4*a*c;
        if(dental > 0){
            System.out.println("Phương Trình có hai nghiệm phân biệt căn dental =  "+Math.sqrt(dental));
        }else if (dental == 0) {
            System.out.println("Phương Trình có 1 nghiệm kép căn dental =  "+Math.sqrt(dental));
        }else{
            System.out.println("Phương trình vô nghiệm , không có căn dental");
        }
        nhap.close();

    }

}
