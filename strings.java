import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        String child_name;
        String father_name;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter child name");
        child_name=sc.nextLine();
        System.out.println("enter father name");
        father_name=sc.nextLine();
        if(child_name.equalsIgnoreCase(father_name))
        {
            System.out.println("both name are same");
        }
        else
        {
            System.out.println("both name are not same");
        }
    }
    
}
