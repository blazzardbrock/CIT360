import java.util.Scanner;

class simple{  
    public static void main(String args[]){
    Scanner ss = new Scanner(System.in);  
    System.out.println("Enter Your Name?");
    String Name = ss.nextLine();
    System.out.println("Your name is " + Name);
    ss.close();
    }  
}  
