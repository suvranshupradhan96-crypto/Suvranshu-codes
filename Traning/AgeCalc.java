import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Day, Month, Year of Birth
        System.out.print("Enter your birth day (1-31): ");
        int day = sc.nextInt();
        System.out.print("Enter your birth month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter your birth year (e.g. 2000): ");
        int year = sc.nextInt();

        // Create birth date
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();  // Current date

        if (birthDate.isAfter(today)) {
            System.out.println("Birth date cannot be in the future!");
        } else {
            // Calculate difference
            Period age = Period.between(birthDate, today);
            System.out.println("\nYour Age is:");
            System.out.println(age.getYears() + " Years "
                             + age.getMonths() + " Months "
                             + age.getDays() + " Days");
        }
        sc.close();
    }
}