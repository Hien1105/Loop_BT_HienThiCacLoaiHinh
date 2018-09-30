import java.util.Scanner;

public class Loop_BT_HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice;
        int width;
        int height;
        System.out.println("Menu:");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("0. Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter choice = ");
        choice = scanner.nextInt();
        System.out.print("Enter width = ");
        width = scanner.nextInt();
        System.out.print("Enter height = ");
        height = scanner.nextInt();
        do {
            switch (choice) {
                case 1:
                    Rectangle(width, height);
                    break;
                case 2:
                 SquareTriangle(height);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        } while (choice != 0);

    }

    public static void Rectangle(int width, int height){
        for (int i=0; i < height; i++){
            for (int j=0; j < width; j++){
                System.out.print(" * ");
            }
            System.out.println("\n");
        }
    }

    public static void SquareTriangle ( int height){
        for (int i=0; i <= height; i++){
            for (int j=0; j < i; j++){
                System.out.print(" * ");
            }
            System.out.println("\n");
        }
    }

}






