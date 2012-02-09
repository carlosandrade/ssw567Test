import java.util.*;
class CarlosTriangleProgram {
    public static void main(String[] args) {
	double[] triangle = new double[3];
		while(isItInvalidInputLetter(triangle))
		{
			System.out.println("This is a invalid input, please only use numbers!");
		}
		double a=triangle[0],b=triangle[1],c=triangle[2];
		if(isItARightTriangle(a,b,c))
		{
			System.out.println("It is a right triangle");
			System.out.println(whatTypeOfTriangleIsThis(a,b,c));
		}
		else
			System.out.println("It is NOT a right triangle");	


    }
	public static boolean isItARightTriangle(double a, double b, double c){
		if( (a < b+c) && (b < a + c) && (c < a + b) ) 
			return true;
		else
			return false;
	}
	public static String whatTypeOfTriangleIsThis(double a, double b, double c)
	{
		if(!(isItARightTriangle(a,b,c))) return "";
		if((a == b) || (b == c) || (a == c))
		{
			if((a != b) || (b!= c) || (a != c))
				if(isRightTriangle(a,b,c)){
					return "The triangle is right and isosceles";
				}else
					return "The triangle is isosceles";
			else
				return "The triangle is equilateral";
		}
		else{
			if(isRightTriangle(a,b,c)){
				return "The triangle is right";
			}else
			return "The triangle is scalene";
		}
	}
	private static boolean isRightTriangle(double side1, double side2, double side3){
		double max=side1;
		if(side2>max) max=side2;
		if(side3>max) max=side3;
		if(Math.abs(Math.sqrt(side3*side3+side2*side2+side1*side1-max*max)-max)/max<0.01){
			return true;
		}else{
			return false;
		}
	}
	public static boolean isItInvalidInputLetter(double[] triangle)
	{
		Scanner scan = new Scanner(System.in);
		try{
			System.out.print("Please input the first side: "); 
		    triangle[0] = scan.nextDouble();
			System.out.print("Please input the second side: "); 		
			triangle[1] = scan.nextDouble();
			System.out.print("Please input the third side: "); 		
			triangle[2] = scan.nextDouble();
		}
		catch(InputMismatchException e){
				return true;
		}
		return false;
	}
}	