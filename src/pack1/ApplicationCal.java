package pack1;

public class ApplicationCal {

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.sum(12, 13, 14);
		calc.average(12, 13, 14);
		calc.min(12, 13, 14);
		calc.max(12, 13, 14);
		System.out.println(calc.sum(12, 13, 14));
		System.out.println(calc.average(12, 13, 14));
		System.out.println(calc.min(12, 13, 14));
		System.out.println(calc.max(12, 13, 14));
		
	}

}
