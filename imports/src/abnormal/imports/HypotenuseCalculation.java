package abnormal.imports;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow ;

public class HypotenuseCalculation {

	public static void main(String[] args) {

		double side1 = 0, side2 ;
		double hypotenuse ;
		
		side1 = 4 ;
		side2 = 3 ;
		
		hypotenuse = sqrt(pow(side1, 2) + pow(side2, 2)) ;
		
		System.out.println("Hypotenuse = " + hypotenuse);
	}

}
