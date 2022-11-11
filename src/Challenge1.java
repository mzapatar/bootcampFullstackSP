import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Challenge1 {

	public static void main(String[] args) {
		
		//User input to use Random10DigNumber method (see method below main)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please type 'Type A' or 'Type B': ");
		
		String type = sc.nextLine();
		
		System.out.println("The requested type is " + type);
		
		String ten_digit_number = Random10DigNumber(type);
		
		System.out.println("The generated number is " + ten_digit_number);
		
		sc.close();
		
		//List and String to use ListCheck method (see method below main). The program will check if the number generated via Random10DigNumber is contained in a list of 4 ten-digit numbers.
		String [] numbers = {"5469660026","5400264588","0845961536","0810000651"};
		
		List<String> number_list = Arrays.asList(numbers);
		
		boolean check = ListCheck(ten_digit_number,number_list);
		
		System.out.println("Is the number available?: " + check);
		
		if (check == true) {
			System.out.println(ten_digit_number + " has been successfully assigned. ");
		} else {
			System.out.println(ten_digit_number + " is unavailable and cannot be assigned. ");
		}

	}
	
	//Method to generate two types of 10-digit pseudo-random numbers (Type A starts in 54 and Type B starts in 08) 
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
	
	//Method to check if given String of text is contained in given list. If the number is contained, the method will return false
	public static boolean ListCheck(String str, List<String> list) {
		
		boolean check = list.contains(str);
		
		boolean check_converted = (check == true)?false:true;
		
		return check_converted;
	}

}
