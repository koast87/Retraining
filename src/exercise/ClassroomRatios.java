package exercise;
//import decimal format
import java.text.DecimalFormat;

public class ClassroomRatios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		int boys = 11;
		int girls = 16;
		int students = boys + girls;
		
		//format the number of places after the decimal
		DecimalFormat df = new DecimalFormat(".###");
		
		//percent of girls in classroom
		double percent = ((double)girls / students)*100;
		System.out.println(df.format(percent) + "% of the class are girls");
		//ratio of students to teachers
		System.out.println("The student to teacher ratio is " + students / 2.0);

	}

}
