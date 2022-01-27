package base.conditions;
import java.util.*;

public class sw_add_sub {
    public static void main(String[] args) throws Exception{

        try (Scanner pog = new Scanner(System.in)) {
            System.out.print("\nEnter two number: ");
            int a = pog.nextInt();
            int b = pog.nextInt();

            System.out.print("\n+ = Addition\n- = Substraction\n* = Multiplication\n/ = Multiplication\n");

            System.out.print("\nEnter an operation: ");
            char op = pog.next().charAt(0);

            switch(op){
                case '+':
                    System.out.println("\nAnswer is: "+ (a+b));
                    break;

                case '-':
                    System.out.println("\nAnswer is: "+ (a-b));
                    break;

                case '*':
                    System.out.println("\nAnswer is: "+ (a*b));
                    break;
                    
                case '/':
                    System.out.println("\nAnswer is: "+ (a/b));
                    break;

                default:
                    System.out.println("\nIncorrect operation");
                    break;
            }
        }
    }
}
