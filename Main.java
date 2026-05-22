import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO STUDENT GRADE TRACKER");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Number of Subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        int total = 0;

        for(int i = 0; i < n; i++) {

            System.out.print("Enter Mark " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            total = total + marks[i];
        }

        double average = (double) total / n;

        int highest = marks[0];
        int lowest = marks[0];

        for(int i = 0; i < n; i++) {

            if(marks[i] > highest) {
                highest = marks[i];
            }

            if(marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        System.out.println("\n------ STUDENT REPORT ------");

        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
    }
}