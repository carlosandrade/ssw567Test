import java.io.*;

public class YeTriangle {
 private double a;
 private double b;
 private double c;

public YeTriangle(double a, double b, double c) {
  this.a = a;
  this.b = b;
  this.c = c;
}

 public static void main(String[] args) {
 String[] inputMessage=new String[]{"Please input the 1st side.","Please input the 2nd side.","Please input the 3rd side."};
 String[] inputData=new String[3];
 try{
for(int i=0;i<3;i++){
	System.out.println(inputMessage[i]);
	inputData[i]=Keyboard.getString();
}
 }catch(Exception e){
	 e.printStackTrace();
 }
 System.out.println(YeTriangle.isTriangle(inputData[0], inputData[1], inputData[2]));

 }

 public static String isTriangle(String side1, String side2, String side3) {
	 try{
double a=Double.parseDouble(side1);
double b=Double.parseDouble(side2);
double c=Double.parseDouble(side3);
  if(a<=0||b<=0||c<=0)
    return "Not a triangle.";

  if(a+b>c&&a-b<c&&b-a<c) 
   {
     if (a==b||a==c||b==c)
      {
        if(a==b&&a==c) {
          return("Equilateral.");
	}
        else {
           return("Isosceles.");
	}
      }
     return("Scalene.");
   }

  return("Not a triangle.");
	 }catch(Exception e){
		 return "Invalid input.";
	 }
 }
}

class Keyboard{
	public static String getString() throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		return reader.readLine();
	}
}
