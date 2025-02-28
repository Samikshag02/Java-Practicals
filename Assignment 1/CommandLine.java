public class CommandLine {
    public static void main(String[] args) {
        
        System.out.println("Number of arguments: " + args.length);
        System.out.println("Arguments passed:");

        
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }
    }
}
