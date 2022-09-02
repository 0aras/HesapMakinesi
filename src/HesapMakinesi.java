import java.util.Scanner;

public class HesapMakinesi
{
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        System.out.println("Please input 2 number to calculate");

       float a=tara.nextInt();
        float b=tara.nextInt();

        System.out.println("Please select the transaction \n1-Summation \n2-Subtraction \n3-multiply \n4-Division");

        int islem=tara.nextInt();
        switch(islem){
            case 1:
                System.out.println("Sum of the numbers: "+ (a+b));
                break;

            case 2:
                System.out.println("Difference of the number: "+ (a-b));
                break;
            case 3:
                System.out.println("multiplication result : "+ (a*b));
                break;
            case 4:
                if(b==0){
                    System.out.println("divisor can not be 0");
                    break;
                }

                System.out.println("division: "+ (a/b));
                break;
            default :

        }

    }
}
