import java.util.Scanner;
public class baithuchanh02 {
    static void main(String[] args) {
//        1. Viết chương trình giải bài toán phương trình bậc nhất ax2+bx+c=0
//với a, b, c được nhập vào từ bàn phím
        Scanner nhap = new Scanner(System.in);
        System.out.println("=== ax^2 + bx + c = 0 ===");
        System.out.print("Nhập a = ");
        int a = nhap.nextInt();
        System.out.print("Nhập b = ");
        int b = nhap.nextInt();
        System.out.print("Nhập c = ");
        int c = nhap.nextInt();
        System.out.printf(" %dx^2 + %dx + %d = 0",a,b,c);
        if(a == 0){
            int x = -c/b;
            System.out.println("Nghiệm của Phương trình là x = "+x);
        } else if (a==0 || b ==0 ){
            System.out.println(" phương trình vô nghiệm ");
        }else{
            int dental = b*b - 4*a*c;
            if (dental < 0 ){
                System.out.println("Phương trinh vô nghiệm ");
            } else if (dental == 0) {
                double x = (double)-b/(2*a);
                System.out.println("Phương trình có nghiệm kêp x = "+x);
            }else{
                double x1 = (double)(-b + Math.sqrt(dental))/(2*a);
                double x2 = (double)(-b - Math.sqrt(dental))/(2*a);
                System.out.printf(" phương trinh có hai nghiệm x1 = %f , x2 = %f",x1,x2);
            }
        }
    }
}
