package exercise3;
import java.util.Scanner;
import java.lang.Math;
public class AngleCalculation{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    double value;
    char type;
    do{
      
      double value1=input.nextDouble();
      value=value1;
      char type1=input.next().charAt(0);
      type=type1;
      if(type=='r'){
        double a=180.0*value/Math.PI;
        System.out.print("Angle: "+a+"d");
      }
      else{
        double a=value*Math.PI/180.0;
        System.out.print("Angle: "+a+"r");
      }
    }
    while(type=='r'||type=='d');
      
      
    
    }
  }