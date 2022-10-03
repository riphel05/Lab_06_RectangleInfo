import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String trash = "";
        double sideOne = 0;
        double sideTwo = 0;
        double sideThree = 0;
        double sideFour = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of the first side: ");

        if(in.hasNextDouble())
        {
            sideOne = in.nextDouble();
        }
        else
        {
            System.out.println("You said the first side is: " + trash);
            System.out.println("Enter a correct value for the rectangle.");
            System.exit(0);
        }

        System.out.print("Enter the length of the second side: ");

        if(in.hasNextDouble())
        {
            sideTwo = in.nextDouble();
        }
        else
        {
            System.out.println("You said the second side is: " + trash);
            System.out.println("Enter a correct value for the rectangle.");
            System.exit(0);
        }

        System.out.print("Enter the length of the third side: ");
        if(in.hasNextDouble())
        {
            sideThree = in.nextDouble();
        }
        else
        {
            System.out.println("You said the third side is: " + trash);
            System.out.println("Enter a correct value for the rectangle.");
            System.exit(0);
        }

        System.out.print("Enter the length of the fourth side: ");
        if(in.hasNextDouble())
        {
            sideFour = in.nextDouble();
        }
        else
        {
            System.out.println("You said the fourth side is: " + trash);
            System.out.println("Enter a correct value for the rectangle.");
            System.exit(0);
        }

        area = sideOne * sideTwo;
        perimeter = sideOne + sideTwo + sideThree + sideFour;
        diagonal = Math.sqrt((sideOne * sideOne) + (sideTwo * sideTwo));

        System.out.println("The area of the rectangle will be " + area + "units squared");
        System.out.println("The perimeter will be " + perimeter + "units");
        System.out.println("The diagonal will be " + diagonal + "units");
    }
}