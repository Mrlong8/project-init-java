import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class HelloWorld {
    static void main(String[] args) {
        System.out.println("hello world Bui Xuan Long");
        int a = 6;
        int b = 9;
        int c = a + b;
        System.out.println(" Sum : "+c);

        System.out.printf("bui %f Xuan Long",344.7);
        System.out.println(" Sum : "+c);

        int age = 20;
        String  name = "Toi la sinh Vien khoa CNTT";
        System.out.println("My age ís : "+age +" name is: "+name);

        Scanner nhap = new Scanner(System.in);
        System.out.println("First number : ");
        int x = nhap.nextInt();
        System.out.println("Seconds number : ");
        int y = nhap.nextInt();
        int min = Math.min(x,y);
        System.out.println("Min = "+min);
        nhap.close();

        // nhập đói tượng từ bàn phím

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Your name id: ");
//        String name2 = scanner.nextLine();
//        System.out.println("Your age is : ");
//        int age2 = scanner.nextInt();
//        System.out.println("my name is : " + name2 +",age : "+age2);
//        scanner.close();

    }
}
