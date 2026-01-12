import java.util.Scanner;

public class Baitap01 {
    static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Your name is : ");
        String name = nhap.nextLine();
        System.out.println("Your scare is : ");
        double score = nhap.nextDouble();
        System.out.println("Sinh Vien ten la : "+ name + " diem : " + score);
        nhap.close();
    }
}
