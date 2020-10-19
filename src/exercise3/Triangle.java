package exercise3;
import java.util.Scanner;
import java.lang.Math;
public class Triangle{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    double a,b,c;
    do{
      double a1=input.nextDouble();
      a=a1;
      double b1=input.nextDouble();
      b=b1;
      double c1=input.nextDouble();
      c=c1;
      if(a<=0||b<=0||c<=0||a+b<c||a+c<b||b+c<a){
        System.out.println("Values are not correct!");
        break;}
      else{
        double s=(a+b+c)/2.0;
        double area=Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        System.out.println("Area: "+area);
        if(a==b && b==c && c==a){
          System.out.println("Triangle: equilateral");  
        }
        else if(a==b||b==c||c==a){
          System.out.println("Triangle: isosceles");
        }
        else{
          System.out.println("Triangle: scalene");
        }
      }
      }
      while(true);
    }
  }