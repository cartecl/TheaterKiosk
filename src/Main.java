
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int age = 0;    //num age = 0

    System.out.print("Input your age");         // output "input your age"
    in.hasNextInt();                            // input age
    if (in.hasNextInt()) {
        age = in.nextInt();
        if (age >= 21) {                        // if age >= 21 then
        System.out.println("You are 21 or over, you get a wristband."); //output "You are 21 or over, you get a wristband"
        }
    } //end if
    } //return
} //end class