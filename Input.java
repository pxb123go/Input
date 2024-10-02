import java.util.Scanner;

class Input{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any STRING: ");
        String s1=sc.nextLine();
        System.out.println("Your entered STRING is: " + s1);

        System.out.println("Enter any INTEGER: ");
        int i1=sc.nextInt();
        System.out.println("Your entered INTEGER is: " + i1);
    }
}