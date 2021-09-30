// This is the class that starts the program
class Main {
  // The next line is the main function
  public static void main(String[] args) {
    int myFirstNumber = 77, mySecondNumber = 44 , answer = 0 ;
     System.out.println("I am using two numbers as variables"); 
    answer = myFirstNumber + mySecondNumber; // add them 
    System.out.println("Our answer when you add is: " + answer);
    answer = myFirstNumber * mySecondNumber; // multiply them
    System.out.println("Our answer when you multiply is: " + answer);
    answer = myFirstNumber / mySecondNumber; // divide them BUT see what you get
     System.out.println("Our answer when you divide is: " + answer);
    answer = myFirstNumber % mySecondNumber; // remainder
    System.out.println("Our remainder when you is: " + answer);
  }
}