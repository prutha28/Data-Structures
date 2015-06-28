package normal.imports;

public class HypotenuseCalculation {

	public static void main(String[] args) {

		double side1 = 0, side2 ;
		double hypotenuse ;
		
		side1 = 4 ;
		side2 = 3 ;
		
		hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2)) ;
		
		System.out.println("Hypotenuse = " + hypotenuse);
	}

}
