import java.util.Scanner;
public class f1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入任意整數");
		int num = scn.nextInt();
		int sum = 0;
		int a = num%2;
		if(a==1){
			for(int i=num;i<100;i = i+2){
				sum = sum+i;
			}
		}else{
			for(int i=num+1;i<100;i = i+2){
				sum = sum+i;
			}
		}
		
		System.out.println("sum="+sum);
		
		
	}

}
