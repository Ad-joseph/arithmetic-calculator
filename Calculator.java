//Simple arithmetic calculator.

public class Calculator{

  //instance variables
  int answer;

  //constructor
  public Calculator() {

  }

  //add method
  public int add(int a, int b){
    int newAnswer = a + b;
    answer = newAnswer;
    return answer;
  }

  //subtract method
  public int subtract(int a, int b){
    int newAnswer = a - b;
    answer = newAnswer;
    return answer;
  }

  //multiply method
  public int multiply(int a, int b){
    int newAnswer = a * b;
    answer = newAnswer;
    return answer;
  }

  public int divide(int a, int b){
    int newAnswer = a / b;
    answer = newAnswer;
    return answer;
  }

  public int modulo(int a, int b){
    int newAnswer = a % b;
    answer = newAnswer;
    return answer;
  }

  //main method
  public static void main(String[] ags) {
    Calculator myCalculator = new Calculator();

    //prints calculation of 5 + 7
    System.out.println(myCalculator.add(5,7));

    System.out.println(myCalculator.subtract(45, 11));
  }
}
