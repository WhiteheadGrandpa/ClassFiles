import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingException {

    void probability() throws ArithmeticException {
        throw new ArithmeticException("0000");
      //  int i = 40/0;
    }
    public static void main(String[] args) {
        HandlingException call = new HandlingException();
        try {
            call.probability();
        }catch (ArithmeticException e) {
            System.out.println(e);
        }
        Scanner scan = new Scanner(System.in);
        try {

            scan.nextInt();
        }catch (ArithmeticException e) {
            System.out.println("Bad Input!!");

        }catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));

        } finally {
            System.out.println("Car");
        }
    }
}
