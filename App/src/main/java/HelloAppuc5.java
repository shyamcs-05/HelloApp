public class HelloAppuc5 {
    public static void main(String[] args){
        if (args.length > 0) {
            // Enhanced for loop to greet each argument
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        } else {
            // Default greeting when no arguments are given
            System.out.println("Hello, World!");
        }
    }
}