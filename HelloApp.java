package hidharun;
public class HelloApp {

    public static void main(String[] args) {

        // Check if arguments are provided
        String names = (args.length > 0) ? String.join(", ", args) : "World";

        // Display greeting
        System.out.println("Hello, " + names + "!");
    }
}