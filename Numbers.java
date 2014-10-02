import java.util.Scanner;

public class Numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	String inputnumber = JOptionPane.showInputDialog("What is the your number?"); 
	Scanner inputScanner = new Scanner( System.in );
	
	System.out.print("enter ten numbers separated by spaces");
	      int one = inputScanner.nextInt();
	      int two = inputScanner.nextInt();
	      int three = inputScanner.nextInt();
	      int four = inputScanner.nextInt();
	      int five = inputScanner.nextInt();
	      int six = inputScanner.nextInt();
	      inputScanner.close();
	
	           double average = ( one + two + three + four + five + six)/6 ;
	
	                 System.out.print(average);
	

          }
    }