import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type Your Message: ");
        String message = scan.nextLine();
        char option = '\0';
            System.out.println("Enter An option");
            System.out.println("A.GP" );
            System.out.println("B.Robi");
            System.out.println("E.Exit");
            option = scan.next().charAt(0);
            System.out.println("\n");
            switch (option) {
                case 'A':
                    AllServices obj1 = new AllServices(new Gp());
                    obj1.sendSms();
                    break;
                case 'B':
                    AllServices obj2 = new AllServices(new Robi());
                    obj2.sendSms();
                    break;
                case 'E':
                    System.out.println("*************************");
                    break;
                default:
                    System.out.println("Please Enter Again!!");
                    break;
            }
        }
    }
