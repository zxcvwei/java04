import java.util.Scanner;
public class f5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入班級人數");
		int p = scn.nextInt();
		
		float ah = 0;
		float aw = 0;
		for(int i = 1;i<=p;i++){
			System.out.println("請逐一輸入每個人的身高");
		float h = scn.nextFloat();
		ah = ah+h;
			System.out.println("請逐一輸入每個人的體重");
		float w = scn.nextFloat();
		aw = aw+w;
		}
		float high = ah/p;
		float weight = aw/p;
		System.out.print("平均身高"+high);
		System.out.print("平均體重"+weight);
	}

}
