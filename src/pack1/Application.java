package pack1;

public class Application {
public static void main(String[] args) {
	Human person1=new Human();// we are getting the copy if Human class
	
	person1.eyeColor="pink";// it does not effect the original
	
	person1.print();
	System.out.println(person1.eyeColor);//// we are getting the copy if Human class
	System.out.println(person1.height);// we are getting the copy if Human class
	System.out.println(person1.weight);// we are getting the copy if Human class
	System.out.println(person1.gender);// we are getting the copy if Human class
	
	System.out.println("------------------------------------------------------------------person2");
	
	Human person2=new Human();//
	//person2.eyeColor="organe";//
	person2.print();
	
	System.out.println(person2.eyeColor);//
	System.out.println(person2.height);//
	System.out.println(person2.weight);// 
	System.out.println(person2.gender);// 
}
}
