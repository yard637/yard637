import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("What is your name: ");
        String name = scanner.nextLine();
        
        System.out.print("what is your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("what is your favorite color: ");
        String color = scanner.nextLine();

        System.out.print("what is your favorite number: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.print("what is your favorite country: ");
        String country = scanner.nextLine();

        System.out.print("what is a skill you want to learn: ");
        String skill = scanner.nextLine();

        System.out.print("In a scale of 1-10 how pretty or handsome are you: ");
        double scale = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("what movie do you like: ");
        String movie = scanner.nextLine();

        System.out.print("what sports do you like: ");
        String sports = scanner.next();
        scanner.nextLine();

        System.out.print("who is your crush: ");
        String crush = scanner.nextLine();

        System.out.println();

        System.out.println("your name: " + name);
        System.out.println("your age: " + age);
        System.out.println("your favorite color: " + color);
        System.out.println("your favorite number: " + number);
        System.out.println("your favorite country is: " + country);
        System.out.println("your skill/s is: " + skill);
        System.out.println("pretty/handsome scale is: " + scale);
        System.out.println("your favorite movie is: " + movie);
        System.out.println("the sports you like is: " + sports);
        System.out.println("your crush is: " + crush + " ayieeeeee");

        
    }
}