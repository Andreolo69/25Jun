import java.util.Scanner;

public class Jun25 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Dame un numero: ");
        String str=sc.nextLine();
        int num=Integer.parseInt(str);

        System.out.print("Dame otro numero: ");
        String str2=sc.nextLine();
        int num2=Integer.parseInt(str2);

        int suma=num+num2;
        System.out.println("La suma es: "+suma);

    }
}
