
public class HelloAspectJDemo {	 
	  public static void sayHello() {
	      System.out.println("Hello");
	  }	 
	  public static void greeting()  {	      
		  long startTime = System.currentTimeMillis();				//joinpoint que declara una variable
		  String name = new String("John\n");      
	      sayHello();	      
	      System.out.print(name);
	      long estimatedTime = System.currentTimeMillis() - startTime;		//joinpoint que declara una variable
	      System.out.print(estimatedTime);
	      System.out.print("\n");	
	  }	   
	  public static void main(String[] args) {  	      
	      sayHello();	      
	      System.out.println("--------");	      
	      sayHello();	      
	      System.out.println("--------");	      
	      greeting(); 
	  }
}
