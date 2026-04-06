import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args){

    String correctUsername ="admin";
    String correctPassword = "Azra123";

    Scanner input = new Scanner(System.in);

    int attempts = 0;

    while (attempts < 3){
        System.out.print("Username: ");
        String username = input.nextLine();

        System.out.print("Password: ");
        String password = input.nextLine();

        if(username.equals(correctUsername) && password.equals(correctPassword)){
            System.out.println("Access granted");
            break;
        }else{
            attempts++;
            System.out.println("Wrong credentials");
            System.out.println("Remaining attempts " + (3 - attempts));
        }
    }
    if (attempts == 3){
        System.out.println("Account locked");
    }

}


}