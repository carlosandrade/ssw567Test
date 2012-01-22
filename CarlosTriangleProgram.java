import java.util.*;
class CarlosTriangleProgram {
    public static void main(String[] args) {
	double a=0,b=0,c=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please input the first side: "); 
	    a = scan.nextDouble();
		System.out.print("Please input the second side: "); 		
		b = scan.nextDouble();
		System.out.print("Please input the third side: "); 		
		c = scan.nextDouble();
		if(isItARightTriangle(a,b,c))
		{
			System.out.println("It is a right triangle");
			whatTypeOfTriangleIsThis(a,b,c);
		}
		else
			System.out.println("It is NOT a right triangle");	
	
			
    }
	private static boolean isItARightTriangle(double a, double b, double c){
		if( (a < b+c) && (b < a + c) && (c < a + b) ) 
			return true;
		else
			return false;
	}
	private static void whatTypeOfTriangleIsThis(double a, double b, double c)
	{
		if((a == b) || (b == c) || (a == c))
		{
			if((a != b) || (b!= c) || (a != c))
				System.out.println("The triangle is isosceles");
			else
				System.out.println("The triangle is equilateral");
		}
		else
			System.out.println("The triangle is scalene");
	}
}	