import java.util.Scanner;
public class part1_syntax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

// variables of different types
        //int -> 2^32
        int UkrainePopulation = 36927789;
        int UkraineArea = 603700;
        int OdesaPopulation = 1000000;

        //double -> very accurate number (15 decimal places)
        double AtomRadiusCm = 0.00000001;
        double GrainOfSandSizeCm = 0.00625;
        double WorldRespectToRussia = 0.00000000001;

        //char -> one symbol
        char FirstLetterOfName = 'A';
        char WorstGrade = 'F';
        char ExclamationMark = '!';

        //boolean -> true or false
        boolean ItIsWinter = false;
        boolean WeShouldLearEthics = true;
        boolean UkraineWillWin = true;

        //String -> sequence of characters (char)
        String s1 = "Hello, this is Java String example";
        System.out.println(s1);

        /**Operations with different types demonstrate:
         * Numbers operations
         * String operations
         * Input/Output operations
         * this is a demonstration of different comment type
         * @author BoykoAndriy
         */
        System.out.println("Hello, enter your age to enter the website");
        String s2 = "Access is allowed";
        String s3 = "Sorry, you are too young";
        int age = in.nextInt();
        in.nextLine();
        if (age > 18) {
            System.out.println(s2);
        }
        if (age >0 && age <18) {
            System.out.println(s3);
            System.exit(0);
        ;}
        System.out.println("Enter your email");
        String about = in.nextLine();
        /*boolean demonstration
        in next line
         */
        boolean RussianEmail = about.contains("mail.ru");
        if (RussianEmail) {
            System.out.println("Access is denied (russian user)");
        }
    }
}
