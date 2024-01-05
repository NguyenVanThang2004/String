package SoSanh;

public class test {
   public static void main(String[] args) {
	
	   // hàm equals ( phân biệt chữ hoa chữ thường)
	   // hàm equalsIgnoreCase ( không phân biệt chữ hoa )
	   // hàm compareTo  => so sánh  > < =
	   // hàm startWith : kiểm tra bắt đầu bằng
	   //hàm endWith : kiểm tra kết thúc bằng
	   String s1 = "thang";
	   String s2 = "THANG";
	   System.out.println("s1 so sanh s2 :"+s1.equals(s2));
	   System.out.println("s1 so sanh s2 :"+s1.equalsIgnoreCase(s2));
	   System.out.println("s1 compareTo s2:"+s1.compareTo(s2));
	   
}
}
