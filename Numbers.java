import java.util.ArrayList;  
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Double> numbers = new ArrayList<Double>();
		
	String oldmoneyInput = JOptionPane.showInputDialog(
			"Please enter comma separated list of your old money e.g. pounds, shillings, pence");
	Scanner oldmoneyScanner = new Scanner(oldmoneyInput);
	oldmoneyScanner.useDelimiter(",");
	int pounds = oldmoneyScanner.nextInt();
	int shillings = oldmoneyScanner.nextInt();
	int pence = oldmoneyScanner.nextInt();
	double newmoney = (double) (pence*0.67 + shillings*12*0.67 + pounds*240*0.67);
	 
	JOptionPane.showMessageDialog(null, String.format("Your money in Euro is %.2f", newmoney));
          }
    }