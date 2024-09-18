import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek: ");
        int age = scanner.nextInt();

        if(age >= 18){
            System.out.println("Jesteś legalny");
        }
        else{
            System.out.println("Jesteś nie legalny");
        }
        scanner.close();
    }
}
