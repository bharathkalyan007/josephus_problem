import java.util.Scanner;

public class josephusproblem {
    public int getSafePosition(int n) {
        // find value of L for the equation

        int valueOfL = n - Integer.highestOneBit(n);//This gives the highest bit of the Binary Digits subtracted  with the Input
        int safePosition = 2 * valueOfL  + 1;       //given.
        //Eg:11=1100  in binary.The highest bit is 1 at the MSB bit
        //so a=1000 which is equal to 8!!
        //This 11 is subtracted by a i.e 8 ->11-8=3.
        //safeposition=2*3+1=7
        return safePosition;
    }
    public static void main(String args[]) {
        josephusproblem s=new josephusproblem();
        System.out.println("Enter 'n'");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=s.getSafePosition(n);
        System.out.println("Safe Position is::"+a);


    }
}
