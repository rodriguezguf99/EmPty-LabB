import java.util.Scanner;
public class SciCalculator
{
    public static void main(String[] args)
    {
        //x = Response 1, y = Resonse 2, z = Output (whatever x and y do to make z)
        double x;
        double y;
        double z = 0;
        int a ;
        int b = 1; // used for looping
        int numCalc = 0; // int isntead of double because we don't want decimal places
        double sumCalc = 0;
        Scanner k = new Scanner(System.in);
        // this while loop runs the game. When the loop ends, the program finishes
        while ( b > 0)
        {

            System.out.println("Current Result: " + z);
            System.out.println();

            //Calculator menu print statements
            System.out.println("Calculator Menu");
            System.out.println("---------------");
            System.out.println("0. Exit Program");
            System.out.println("1. Addition  ");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Logarithm");
            System.out.println("7. Display Average");
            System.out.println();
            //calls for menu selection here
            // loop because if there is an error, it must go back to this line
            int c = 1;
            while (c > 0)
            {
                System.out.println("Enter Menu Selection: ");
                a = k.nextInt();
            //this could have been more cleanly written by a switch statement
                if (a == 7)
                // this case is first because if a =7 the program needs to be able to output the error before prompting the operands
                {
                    if (numCalc == 0)
                    {
                        System.out.println();
                        System.out.println("Error: No calculations yet to average!");
                    } else
                    {
                        System.out.println("Sum of calculations: " + sumCalc);
                        System.out.println("Number of calculations: " + numCalc);
                        double avgCalc = Math.round ((sumCalc / numCalc) * 100.0) / 100.0;
                        System.out.println("Average of calculations: " + avgCalc);
                    }
                }
                else if (a > 7)
                // this case is for any input greater than 7 that doesn't work in the input
                {
                    System.out.println("Error: Invalid selection!");
                }
                else if (a < 0)
                // this case is for any input less than 0 that doesn't work in the input
                {
                    System.out.println("Error: Invalid selection!");
                }
                else if (a == 0)
                // this case ends the program
                {
                    System.out.println("Thanks for using this calculator. Goodbye!");
                    b--;
                    c--;

                }
                else
                // this case actually shows the cases for the operands
                {
                    System.out.println("Enter first operand: ");
                    x = k.nextDouble();
                    System.out.println("Enter second operand: ");
                    y = k.nextDouble();

                    if (a == 1)
                    //addition
                    {
                        z = x + y;
                        numCalc++;
                        sumCalc = sumCalc + z;
                    }
                    else if (a == 2)
                    //subtraction
                    {
                        z = x - y;
                        numCalc++;
                        sumCalc = sumCalc + z;
                    }
                    else if (a == 3)
                    //multiplication
                    {
                        z = x * y;
                        numCalc++;
                        sumCalc = sumCalc + z;
                    }
                    else if (a == 4)
                    // division
                    {
                        z = x / y;
                        numCalc++;
                        sumCalc = sumCalc + z;
                    }
                    else if (a == 5)
                    // exponent
                    {
                        z = Math.pow(x, y);
                        numCalc++;
                        sumCalc = sumCalc + z;

                    } else if (a == 6)
                    // logarithm
                    {
                        z = (Math.log10(y)) / (Math.log10(x));
                        numCalc++;
                        sumCalc = sumCalc + z;
                    }
                    // this break ends the mini loop on the inside
                    break;
                }
            }
        }
    }
}
