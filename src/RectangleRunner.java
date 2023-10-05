import java.util.Scanner;
public class RectangleRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scan.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scan.nextLine();
        int length1 = str1.length();
        int length2 = str2.length();
        if (length1 > length2) {
            System.out.println(str1 + " is longer");
        } else if (length1 < length2) {
            System.out.println(str2 + " is longer");
        } else {
            System.out.println("Both strings have the same length");
        }
        if (length1 % 2 == 0) {
            int half1 = length1 / 2;
            System.out.println("First Half: " + str1.substring(0, half1));
            System.out.println("Second Half: " + str1.substring(half1 - 1, length1));
        } else {
            int half1 = length1 / 2;
            System.out.println("First Half: " + str1.substring(0, half1));;
            System.out.println("Second Half: " + str1.substring(half1, length1));

        }
        if (length2 % 2 == 0) {
            int half2 = length2 / 2;
            System.out.println("First Half: " + str2.substring(0, half2));
            System.out.println("Second Half: " + str2.substring(half2 - 1, length2));
        } else {
            int half2 = length2 / 2;
            System.out.println("First Half: " + str2.substring(0, half2));;
            System.out.println("Second Half: " + str2.substring(half2, length2));

        }
        if (str1.indexOf(str2) != -1) {
            System.out.println(str2 + " is found in " + str1 + " at index " + str1.indexOf(str2));
        } else if (str2.indexOf(str1) != -1) {
            System.out.println(str1 + " is found in " + str2 + " at index " + str2.indexOf(str1));
        } else {
            System.out.println(str1 + " is NOT found in " + str2);
        }
    }
}
