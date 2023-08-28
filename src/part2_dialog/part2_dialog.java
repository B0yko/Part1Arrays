import java.util.Scanner;
public class part2_dialog {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Hello, what is your name?");
        String name = in.nextLine();
        System.out.println("Hello, " + name + ", nice to meet you");

        System.out.println("How old are you?");
        int age = in.nextInt();
        in.nextLine();
        if (age > 5) {
            System.out.println("Great, now I know that you are " + age + " years old");
        }
        if (age > 1 && age  < 5) {
            System.out.println("Great, now I know that you are " +age + " years old, good development for this age!");
        }
        //"Year" in the singular, without -s:
        if (age == 1) {
            System.out.println("Great, now I know that you are 1 year old, good development for this age!");
        }
        if (age < 1) {
            System.out.println("It's kind of unreal, but ok!");
        }
        //contains example
        System.out.println("What program do you study on?");
        String s = in.nextLine();
        boolean isBDT = s.contains("BDS");
        if (isBDT) {
            System.out.println("Oh! I know many smart students from BDS!");
        }

        System.out.println("Where are you from?");
        String s1 = in.nextLine();
        boolean fromKyiv = s1.contains("Kyiv");
        if (fromKyiv) {
            System.out.println("Kyiv is an incredible city, I can tell you one interesting fact about it." +
                    " Write 'tell me' if you want");
            String s2 = in.nextLine();
            boolean KyivFacts = s2.contains("tell me");
            if (KyivFacts) {
                System.out.println("Kyiv was founded in 482CE. It is 1541 years old," +
                        " it is one of the oldest cities in Europe.");

            }
        }

        System.out.println("Tell me more about yourself");
        String s4 = in.nextLine();
        System.out.println("Oh, it's very interesting!");
        //Summarizing user information
        System.out.println("So this is the information I got from you: ");
        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("You study on " + s);
        System.out.println("You are from " + s1);
        System.out.println("This is an information that you wrote about yourself: " + s4);
        //startsWith() example
        System.out.println("To leave a review, start with a phrase " +
                "I like this ChatBot because...");
        String a = "I like this ChatBot because";
        String b = in.nextLine();
        System.out.println(a.startsWith(b));
    }
}
