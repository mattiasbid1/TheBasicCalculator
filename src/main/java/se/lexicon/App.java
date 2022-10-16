package se.lexicon;

import java.util.Scanner;

/**
 * The basic calculator
 * By Mattias Björk
 */
public class App 
{
    public static void main(String[] args) {
        // adding a scanner
        Scanner scan = new Scanner(System.in);
        // adding some variables
        char theOperator;
        double firstNumber;
        double secondNumber;
        double result = 0;
        do {
            // The menu
            System.out.println("Greetings and welcome to the calculator!");
            System.out.println("(+) Addition\n" +
                    "(-) Subtraction\n" +
                    "(/) Division\n" +
                    "(*) Multiplication\n" +
                    "(q) Quit\n" +
                    "******************");
            // takes input
            theOperator = scan.next().charAt(0);
            // checks if user wants to quit or enters something bonkers
            switch (theOperator) {
                // types goodbye and exits if user type q
                case 'q':
                    System.out.println("Goodbye");
                    System.exit(0);
                    // scan two numbers if user enters correct operator
                case '+': case '-': case '/': case '*':
                    System.out.println("Please enter the first number");
                    firstNumber = scan.nextDouble();
                    System.out.println("Please enter the second number");
                    secondNumber = scan.nextDouble();
                    // the actual math
                    switch (theOperator) {
                        case '+':
                            result = firstNumber + secondNumber;
                            break;
                        case '-':
                            result = firstNumber - secondNumber;
                            break;
                        case '/':
                            result = firstNumber / secondNumber;
                            break;
                        case '*':
                            result = firstNumber * secondNumber;
                            break;
                        default:
                            break;
                    }
                    //prints the numbers, operator and the result before restarting
                    System.out.println(firstNumber + " " + theOperator + " " + secondNumber + " = " + result);
                    break;
                    // Tells user to enter a valid option and returns to start
                default:
                    System.out.println("Please enter a valid option.");

            }

        }while(true);

            }


        }

