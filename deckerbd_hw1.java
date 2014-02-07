import java.util.*;
import java.io.*;

public class deckerbd_hw1 {
	static Scanner keyboard = new Scanner(System.in);
	static String schemaFileName;
	static String binaryFileName;
	static File schemaFile;
	static File binaryFile;
	static ArrayList<String> schema = new ArrayList<String>();
	static ArrayList<Character> binaryCharList = new ArrayList<Character>();
	static ArrayList<Integer> binaryIntList = new ArrayList<Integer>();
	static ArrayList<Double> binaryDoubleList = new ArrayList<Double>();
	static int binaryListSize = 0;
	//static DataOutputStream outStream;
	//static DataInputStream inStream;
	
	public static void loadSchemaFiles(){
		System.out.println("Enter name of schema file: ");
		schemaFileName = keyboard.next();
		System.out.println(schemaFileName);
		System.out.println("Enter name of binary file: ");
		binaryFileName = keyboard.next();
		try{
			schemaFile = new File(schemaFileName);
			Scanner scanner = new Scanner(schemaFile);
			int i = 1;
			while(scanner.hasNext()){
				String line = scanner.next();
				System.out.println("Add No."+i+": "+line);
				schema.add(new String(line.toString()));
			}
			scanner.close();			
		} catch(Exception e){
			e.printStackTrace();
		}
		genBinaryLists();
		printMainMenu();
	}
	
	public static void genBinaryLists(){
		try{
			binaryFile = new File(binaryFileName);
			DataInputStream stream = new DataInputStream(new FileInputStream(binaryFile));
			/*while(){
			}*/
			stream.close();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void printSchema(){
		System.out.println("Current schema being used: ");
		for(int i=0; (i < schema.size()); i++){
			System.out.println("\t"+schema.get(i));
		}
		printMainMenu();
	}
	
	public static void printBinaryToScreen(){
		/*int stringNum = 0;
		int intNum = 0;
		int charNum = 0;
		for(int i=0; (i<binaryListSize); i++){
			for(int j = 0; (j<schema.size()); j++){
				String temp = schema.get(j);
				if(temp.charAt(0).equals('i')){
					System.out.print();
				}
			}
		}*/
	}
	
	public static void printBinaryToText(){
		
	}
	
	public static void searchAndPrintToScreen(){
		
	}
	
	public static void searchAndSaveToBinary(){
		
	}
	
	public static void printThings(PrintStream printStream){
		
	}
	
	public static void printMainMenu(){
		System.out.println("Supported operations:\n"
				+ "\t1. Print schema\n"
				+ "\t2. Print binary data on screen\n"
				+ "\t3. Print binary data to text file\n"
				+ "\t4. Search and print data on screen\n"
				+ "\t5. Search and save data to bindary file\n"
				+ "\t6. Quit");
		getChoice();
	}
	
	public static void getChoice(){
		System.out.println("Enter your choice: ");
		int selected = keyboard.nextInt();
		System.out.println(selected);
		if(selected==1){
			printSchema();
		}
		else if(selected==6){
			System.exit(0);
		}
		else{
			getChoice();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=0; (i<50); i++){
			System.out.println("Hello World No."+i+"!\nThis is a test.");
		}*/
		loadSchemaFiles();
	}

}
