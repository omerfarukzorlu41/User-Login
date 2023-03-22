import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username,userpassword,username_check,userpassword_check,newpassword;
        Scanner scanner =new Scanner(System.in);
        username ="zobzorlu41";
        userpassword ="13579";
        System.out.print("Please username enter: ");
        username_check = scanner.nextLine();
        System.out.print("Please userpassword enter: ");
        userpassword_check = scanner.nextLine();

        if(username.equals(username_check) && userpassword.equals(userpassword_check)){
            System.out.println("username and userpassword correct");
        }else if(username.equals(username_check) && !(userpassword.equals(userpassword_check))){
            System.out.println("username correct but userpassword incorrect");
            System.out.println("Press 1 if you want to reset your password or press 0 if you don't.");
            int choose = scanner.nextInt();
            switch (choose){
                case 1 :
                    System.out.println("The new password you entered should not be the same as the one you entered incorrectly.");
                    System.out.println("new password: ");
                    scanner.nextLine();
                    newpassword = scanner.nextLine();
                    if(newpassword.equals(userpassword)){
                        System.out.println("Could not create password, please enter another password");
                    }else{
                        System.out.println("password created. new password: "+newpassword);
                    }
                    break;
                case 0 :
                    System.out.println("you are redirected to the exit");
                    break;
                default:
                    System.out.println("incorrent entry");
            }
        }else{
            System.out.println("user not found");
        }
    }
}