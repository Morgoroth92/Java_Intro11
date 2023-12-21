public class Main {
    public static void main(String[] args) {
        isDifferent(6, 5);
    }

    public static void isDifferent(int a, int b) {
        boolean result = a != b;
        System.out.println("I due valore sono: " + a + " e " + b + " e sono diversi?: ");
        System.out.println(result);

    }
}