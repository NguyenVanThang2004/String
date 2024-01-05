package DoDai;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String s ;
		System.out.printf("nhap chuoi :");
		s = input.nextLine();
		System.out.printf("chuoi vua nhap:"+s);
		
		// hàm length(): lấy độ dài chuỗi
		// hàm charAt(): lấy ra 1 kí tự tại vị trị bất kì 
		// hàm getChar():
		System.out.println("\ndo dai chuoi:"+s.length());
		
		System.out.println("\nlấy ra kí tự tại vị trí 2:"+s.charAt(2));
		
	}
}
