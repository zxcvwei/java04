import java.util.Scanner;
public class f6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�Jn");
		int n = scn.nextInt();
		System.out.println("�п�Jm");
		int m = scn.nextInt();
		for(int i=1;i<=n;i++){
			for(int j = 1 ; j <= m ;j++){
			System.out.print(i*j+"\t");
			}System.out.println();
		}
		
		
		
	}

}
