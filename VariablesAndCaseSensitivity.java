public class VariablesAndCaseSensitivity {
    public static void main(String[] args) {
        int studentAge = 15;
        double itemPrice = 29.99;
        String studentName = "Alice";
        int counter = 10;  
        int Counter = 20;

        System.out.printf("Student Age: %d\n", studentAge);
        System.out.printf("Item Price: $%.2f\n", itemPrice);
        System.out.printf("Student Name: %s\n", studentName);
        System.out.printf("Counter: %d\n", counter);
        System.out.printf("Counter (Different Case): %d\n", Counter);

    }
}