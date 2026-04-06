import java.util.Random;
import java.util.Scanner;
public class PasswordGenerator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
        StringBuilder password = new StringBuilder();

        System.out.print("Unesi duzinu passworda");
        int length = input.nextInt();

        for (int i=0; i < length; i++){
            int index = random.nextInt(chars.length());
            password.append(chars.charAt(index));
        }
        System.out.println("Generated password: " + password);
    }

}
