import java.util.Scanner;
public class Student_age
{
    public static void main(String[]args)
    {
        Scanner scan= new Scanner(System.in);
        int[][][]arr=new int[2][3][2];
        for (int i=0;i<=arr.length-1;i++)
        {
            for (int j=0;j<=arr[i].length-1;j++)
            {
                for (int k=0;k<=arr[i][j].length-1;k++)
                {
                    System.out.println("Enter the age for student :"+(k+1)+" of class "+(j+1)+" of school "+(i+1));
                    arr[i][j][k]=scan.nextInt();
                }
            }
        }
        System.out.println("The ages are :");
        for (int i=0;i<=arr.length-1;i++)
        {
            for (int j=0;j<=arr[i].length-1;j++)
            {
                for (int k=0;k<=arr[i][j].length-1;k++)
                {
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
                System.out.println("School - "+(i+1));
            }
              System.out.println();
        }

    }
}
