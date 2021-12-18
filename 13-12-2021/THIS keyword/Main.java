package test;

public class Main {
	  int x;

	  // Constructor with a parameter
	  public Main(int x) {
	    this.x = x;
	  }

	  // Call the constructor
	  public static void main(String[] args) {
	    Main myObj = new Main(100);
	    System.out.println("Value of x = " + myObj.x);
	  }
	}

