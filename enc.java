import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
 
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
 import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
 class AES {
 
    private static SecretKeySpec secretKey;
    private static byte[] key;
 
    public static void setKey(String myKey) 
    {
        MessageDigest sha = null;
        try {
            key = myKey.getBytes("UTF-8");
            sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16); 
            secretKey = new SecretKeySpec(key, "AES");
        } 
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } 
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
 
    public static String encrypt(String strToEncrypt, String secret) 
    {
        try
        {
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
        } 
        catch (Exception e) 
        {
            System.out.println("Error while encrypting: " + e.toString());
        }
        return null;
    }
 
    public static String decrypt(String strToDecrypt, String secret) 
    {
        try
        {
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
        } 
        catch (Exception e) 
        {
            System.out.println("Error while decrypting: " + e.toString());
        }
        return null;
    }
}

class enc
{

public static void main(String[] args) 
{
System.out.println("Enter key here...");
Scanner myObj = new Scanner(System.in);
String userName = myObj.nextLine();
    final String secretKey = userName; 
     
System.out.println("Enter number if");
System.out.println("you have message and you want to encrypt -----------> 1");
System.out.println("you have encrypted message and you want decrypt ----> 2");
	
Scanner myObj1 = new Scanner(System.in);
int choice = myObj1.nextInt();

switch(choice)
{
case 1:
	System.out.println("Enter message here...");
	Scanner myObj2 = new Scanner(System.in);
	String msg = myObj2.nextLine();
	String originalString = msg; 
        String encryptedString = AES.encrypt(originalString, secretKey) ;
	System.out.println("Here is your encrypted message...");
	System.out.println(encryptedString);
      break;

case 2:
	System.out.println("Enter encrypted message here...");
	Scanner myObj3 = new Scanner(System.in);
	String dec = myObj3.nextLine();
	 encryptedString=dec;
	String decryptedString = AES.decrypt(encryptedString, secretKey);
	System.out.println("Here is your message...");
        System.out.println("                                               ---->  " + decryptedString);
      break;
default:
    System.out.println("Wrong choice");
      break; 
}
 
       
}
}






