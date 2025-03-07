class StaticExample {
    static int count = 0;
    
    static {
        System.out.println("Static block executed.");
    }
    
    static void showCount() {
        System.out.println("Count: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        StaticExample.showCount();
        StaticExample.count = 5;
        StaticExample.showCount();
    }
}