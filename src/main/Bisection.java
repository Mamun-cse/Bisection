package main;
import java.util.Random;
public class Bisection {
	public static final double tolarence=0.0001;
	public static double func(double x){
		double result;
		result=(x*x*x)-x+1;
		return result;
	}
	public static void bisection(double a,double b){

	    if(func(a) * func(b) >= 0)
	    {
	        System.out.println("Incorrect a and b");
	        return;
	    }

	    double c = a;

	    while ((b-a) >=tolarence)
	    {
	        c = (a+b)/2;
	        if (func(c) == 0.0){
	      
	            break;
	        }
	        else if (func(c)*func(a) < 0){
	               
	                b = c;
	        }
	        else{
	                a = c;
	        }
	    }
	        System.out.println("the root is :");
	        System.out.println(c);
	    }
	



    public static void main(String args[]){
	   double num1=-1,num2=5;
       Random rand = new Random();
       for(;;)
       {
          
          
          num1 = rand.nextInt(10)-260;
          num2 = rand.nextInt(10)+260;
          if(num1*num2<0)
              break;
       }
       bisection(num1,num2);
    }
}