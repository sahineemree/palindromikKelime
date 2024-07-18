import java.util.Scanner;

public class palindromKelime {
    static boolean isPalindrome (String str){
        String reverse = "";

        for (int i = str.length() -1 ; i>=0 ; i--){
            reverse += str.charAt(i);
        }

        if (str.equals(reverse)){
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir kelime giriniz : ");
        String word = scan.nextLine();


        if (isPalindrome(word)){
            System.out.println("Girdiğiniz karakter dizisi palindromiktir !");
        }
        else {
            System.out.println("Girdiğiniz " + word + " kelimesi bir palindromik kelime değildir !");
        }
        }
    }