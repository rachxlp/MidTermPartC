package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author Rachel Prasad
 */
public class TestUserprofile 
{

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
      
        UserProfile user = new UserProfile();
        
        System.out.println("Please enter your name:");
        user.userID = input.nextLine();
        
        System.out.println("Here are some options: " + user.genres);
        
        System.out.println("Please enter your prefered genre from this list:");
        user.genre = input.nextLine();
        
        System.out.println("Your profile has been created.");
        
    }
    
}
