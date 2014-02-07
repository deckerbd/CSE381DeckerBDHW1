import java.util.*;
import java.awt.*;

public class deckerbd_hw1 {
	static Scanner keyboard = new Scanner(System.in);
	
	public static void printMainMenu(){
		System.out.println("Supported operations:\n"
				+ "\t1. Print schema\n"
				+ "\t2. Print binary data on screen\n"
				+ "\t3. Print binary data to text file\n"
				+ "\t4. Search and print data on screen\n"
				+ "\t5. Search and save data to bindary file\n"
				+ "\t6. Quit");
	}
	
	public static void getChoice(){
		System.out.println("Enter your choice: ");
		int selected = keyboard.nextInt();
		System.out.println(selected);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=0; (i<50); i++){
			System.out.println("Hello World No."+i+"!\nThis is a test.");
		}*/
		printMainMenu();
		getChoice();
	}

}
