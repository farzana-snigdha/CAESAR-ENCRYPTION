import java.util.Scanner;

public class CaesarCipher {

    // Decrypts text using a shift s


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to encrypt or decrypt(e/d)? ");
        String ans = input.next();

        Encrypt e = new Encrypt();
        Decrypt d = new Decrypt();
        if (ans.equals("e")) {
            //encrypt msg
            System.out.print("enter original message : ");
            String msg = input.next();
            System.out.println("enter shifting value : ");
            int s = input.nextInt();
            System.out.println("Cipher: " + e.encrypt(msg, s));

        }
        if (ans.equals("d")) {
            //decrypt msg
            System.out.print("enter encrpted message : ");
            String msg = input.next();
            System.out.println("enter shifting value : ");
            int s = input.nextInt();
            System.out.println("Cipher: " + d.decrypt(msg, s));

        }

    }
}