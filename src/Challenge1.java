import java.util.Scanner;
import java.util.List;
import java.util.Random;

public class Challenge1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please type 'Type A' or 'Type B': ");
		
		String type = sc.nextLine();
		
		System.out.println("The requested type is " + type);
		
		String ten_digit_number = Random10DigNumber(type);
		
		System.out.println("The generated number is " + ten_digit_number);
		
		sc.close();

	}
	
	//Method to generate a 10-digit pseudo-random number 
	public static String Random10DigNumber(String type) {
		
		Random rand = new Random();
		  
		Integer random_number = rand.nextInt(100000000);
		
		String str_random_number = random_number.toString();
		
		int needed_width = 8;
		
		String eight_digit_number = String.format("%0" + needed_width + "d", Integer.valueOf(str_random_number));
		
		String ten_digit_number = "";
      
		boolean check = type.toLowerCase().contains("a");
      
		if (check == true) {
			ten_digit_number = ten_digit_number + "54" + eight_digit_number;
		} else {
			ten_digit_number = ten_digit_number + "08" + eight_digit_number;
		}
		
		return ten_digit_number;
		
		
	}
	
	//Method to check if String of text is contained in list 
	public static boolean ListCheck(String str, List<String> list) {
		
		boolean check = list.contains(str);
		
		boolean check_converted = (check == true)?false:true;
		
		return check_converted;
	}

}
