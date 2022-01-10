package Practice;

public class Victory {
    public static void printPattern(String pattern){
        for (int i = 1; i <= 20; i++) {
            System.out.print(pattern);
        }
    }
    public static void main(String args[]) {
        printPattern("/");
        System.out.println("\n||Victory is mine!||");
        printPattern("\\");
    }
}
