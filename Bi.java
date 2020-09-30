
import java.util.Scanner;
public class Bi{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();

		for(int a=0;a<=n;a++)
			System.out.print(((a==0||a==n)?"":B(a,n))+((a==n)?"":"a^"+(n-a))+((a==0)?"":"b^"+a)+((a!=n)?" + ":""));
		scanner.close();
	} 

	static long B(int a,int n){
		return (a==0)?1:(a>n-a)?B(n-a,n):B(a-1,n-1)*n/a;
	}
}
