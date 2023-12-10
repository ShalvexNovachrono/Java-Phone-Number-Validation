package main;

import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int count = 0;
        Outer:
        while (true) {
            System.out.print("Phone Number:\n>>> ");
            String myInputVal = myObj.nextLine();
            if (myInputVal.length() == 11) {
                char[] myInputValChar = myInputVal.toCharArray();
                Inner:
                for (int i = 0; i < myInputVal.length(); i++ ) { 
                    char character = myInputValChar[i];
                    int icv = (int) character;
                    if (icv >= 48 && icv <= 57) {
                        count++;
                    } else {
                        System.out.println("Make sure its a phone number.");
                        break Inner;
                    }
                }  
                if (count == 11) {
                    System.out.println("Access granted.");
                    break Outer;
                }
            } else {
                System.out.println("Needs to be 11 characters long.");
            }
  
        }
        
    }
    
}
