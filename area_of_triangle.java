import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        int base,height,A;
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter Base = ");
        base=scan.nextInt();
        System.out.println("Enter Height = ");
        height=scan.nextInt();
        A=base*height*1/2;
        
        System.out.println("Area Of Triangle =" +A);
    }
}
