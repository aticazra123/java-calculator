package com.mycompany.checkststrengthofpassword;

import java.util.Scanner;

public class CheckStregthOfPassword {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Unesi password: ");
        String userPassword = input.nextLine();

        int result = passwordStrength(userPassword);

        if (result <= 2) {
            System.out.println("Password strength: Weak");
        } else if (result <= 4) {
            System.out.println("Password strength: Medium");
        } else {
            System.out.println("Password strength: Excellent");
        }

    }
    public static int passwordStrength(String password){
        int score = 0;
        int length = password.length();

        if (length >= 8 && length <= 10){
            score += 1;
        }
        else if (length >= 11 && length <= 15){
            score += 2;
        }
        else if(length >= 16){
            score += 3;
        }
        if (password.matches("(?=.*[a-z]).*")){
            score++;
        }
        if (password.matches("(?=.*[A-Z]).*")){
            score++;
        }
        if (password.matches("(?=.*[0-9]).*")){
            score++;
        }
        if (password.matches("(?=.*[!@#$%^&*]).*")){
            score++;
        }
        return score;

    }
}
