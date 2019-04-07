package pack1;

public class Calculator {
	// lets create class called calculator, have methods that take three inputs and return sum, average, min and max
  int sum (int a, int b, int c) {
	  return (a+b+c);
  }
  int average(int a, int b, int c) {
	  return (a+b+c)/3;
	  
  }
  int min(int a, int b, int c) {
	  int min=a;
	  if (b<min) {
		  min=b;
	  }
	  if (c<min) {
		  min=c;
	  }
	  return min;
  }
  int max (int a, int b, int c) {
	  int max=a;
	  if (b>a) {
		  max=b;
		  
	  }
	  if (c>max) {
		  max=c;
	  }
	  return c;
  }
  

}
