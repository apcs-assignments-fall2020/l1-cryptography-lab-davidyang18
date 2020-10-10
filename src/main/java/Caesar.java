import java.util.Scanner;

public class Caesar {
    public static String encryptCaesar(String message) {
        char ch = ' ';
        String output = "";
        for (int i = 0; i < message.length(); i++) {
            ch = message.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || ( ch >= 'A' && ch <= 'Z')) {
                ch = (char) (ch + 3);
                if ((ch > 'z') || (ch > 'Z' && ch < 'a')) {
                    ch = (char) (ch - 26);
                }
            }
            output += ch;
        }
        return output;
    }

    public static String decryptCaesar(String message) {
       char ch = ' ';
        String output = "";
        for (int i = 0; i < message.length(); i++) {
            ch = message.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || ( ch >= 'A' && ch <= 'Z')) {
                ch = (char) (ch - 3);
                if ((ch < 'A') || (ch > 'Z' && ch < 'a')) {
                    ch = (char) (ch + 26);
                }
            }
            output += ch;
        }
        return output;
    }

    public static String encryptCaesarKey(String message, int key) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Please enter a key for your shift");
        // key = sc.nextInt();
        // sc.close();
        char ch = ' ';
        String output = "";
        for (int i = 0; i < message.length(); i++) {
            ch = message.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || ( ch >= 'A' && ch <= 'Z')) {
                ch = (char) (ch + key);
                if ((ch > 'z') || (ch > 'Z' && ch < 'a')) {
                    ch = (char) (ch - (23+key));
                }
            }
            output += ch;
        }
        return output;
        
    }

    public static String decryptCaesarKey(String message, int key) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Please enter a key for your shift");
        // key = sc.nextInt();
        // sc.close();
        char ch = ' ';
        String output = "";
        for (int i = 0; i < message.length(); i++) {
            ch = message.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || ( ch >= 'A' && ch <= 'Z')) {
                ch = (char) (ch - key);
                if ((ch < 'A') || (ch > 'A' && ch < 'z')) {
                    ch = (char) (ch + (23 - key));
                }
            }
            output += ch;
        }
        return output;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to \"encrypt\" or \"decrypt\" a message?");
        String command = scan.nextLine().trim().toLowerCase();

        if (command.equals("encrypt")) {
            System.out.println("Please enter your message to be encrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptCaesar(message));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptCaesar(message));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}
