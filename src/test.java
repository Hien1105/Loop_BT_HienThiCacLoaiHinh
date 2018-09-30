import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int width;
        int height;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width = ");
        width = scanner.nextInt();
        System.out.print("Enter height = ");
        height = scanner.nextInt();
        for (int i=0; i < height; i++){
            for (int j=0; j < width; j++){
                System.out.print(" * ");
            }
            System.out.println("\n");
        }
    }
}
