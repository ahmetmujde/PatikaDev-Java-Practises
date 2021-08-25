public class FibonacciNumber {
    public  static void main(String args[]){

        int numberOne=0,numberTwo=1,result=0;

        System.out.print(numberOne+" "+numberTwo+" ");

        for(int i=0; i<8; i++) {
            result=numberOne+numberTwo;
            System.out.print(result + " ");
            numberOne=numberTwo;
            numberTwo=result;

        }
    }
}
