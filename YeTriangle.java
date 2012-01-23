import java.util.*;

public class YeTriangle {
 private double a;
 private double b;
 private double c;

public Triangle(double a, double b, double c) {
  this.a = a;
  this.b = b;
  this.c = c;
}

 public static void main(String[] args) {
  
  Scanner scan = new Scanner(System.in);
  System.out.println("first side:");
  double a = scan.nextDouble();
  System.out.println("second side:");
  double b = scan.nextDouble();
  System.out.println("third side:");
  double c = scan.nextDouble();
   scan.close();
  
  Triangle.isTriangle(a, b, c);
 }

 public static void isTriangle(double a, double b, double c) {

  if(a<=0||b<=0||c<=0)
    System.out.println("This is not a triangle");

  if(a+b>c&&a-b<c&&b-a<c) 
   {
     if (a=b||a==c||b==c)
      {
        if(a==b&&a==c) {
          System.out.println("This is an equilateral");
	return;}
        else {
           System.out.println("This is an isosceles");
	return;}
      }
     System.out.println("This is a scalene");
return;
   }

  System.out.println("This is not a triangle");
 }


