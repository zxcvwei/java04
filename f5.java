import java.util.Scanner;
public class f5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�Z�ŤH��");
		int p = scn.nextInt();
		
		float ah = 0;
		float aw = 0;
		for(int i = 1;i<=p;i++){
			System.out.println("�гv�@��J�C�ӤH������");
		float h = scn.nextFloat();
		ah = ah+h;
			System.out.println("�гv�@��J�C�ӤH���魫");
		float w = scn.nextFloat();
		aw = aw+w;
		}
		float high = ah/p;
		float weight = aw/p;
		System.out.print("��������"+high);
		System.out.print("�����魫"+weight);
	}

}
