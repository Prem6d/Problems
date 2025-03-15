import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for(int j =0; j<test;j++){
        int size = sc.nextInt();
        int input[] = new int[size];
        for (int i = 0;i<size; i++){
            input[i] = sc.nextInt();
        }
            int max = input[0];
            for(int i = 0; i<size;i++){
            if(max<input[i]){
                max = input[i];
            }
            }
            System.out.println(max);
        }
	}
}
