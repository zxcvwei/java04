import java.util.Scanner;
public class c2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入身分證字號的英文大寫");
		String e =scn.next();
		String a = " ";
		switch(e.charAt(0)){
		case 'A':
			a = "台北市";  break;
		case 'B':
			a = "台中市";  break;	
		case 'C':
			a = "基隆市";  break;	
		case 'D':
			a = "台南市";  break;	
		case 'E':
			a = "高雄市";  break;	
		case 'F':
			a = "台北縣";  break;	
		case 'G':
			a = "宜蘭縣";  break;	
		case 'H':
			a = "桃園縣";  break;	
		case 'I':
			a = "嘉義市";  break;		
		case 'J':
			a = "新竹縣";  break;	
		case 'K':
			a = "苗栗縣";  break;	
		case 'L':
			a = "台中縣";  break;	
		case 'M':
			a = "南投縣";  break;	
		case 'N':
			a = "彰化縣";  break;	
		case 'O':
			a = "新竹市";  break;	
		case 'P':
			a = "雲林縣";  break;	
		case 'Q':
			a = "嘉義縣";  break;	
		case 'R':
			a = "台南縣";  break;
		case 'S':
			a = "高雄縣";  break;	
		case 'T':
			a = "屏東縣";  break;	
		case 'U':
			a = "花蓮縣";  break;	
		case 'V':
			a = "台東縣";  break;	
		case 'W':
			a = "金門";  break;	
		case 'X':
			a = "澎湖縣";  break;	
		case 'Y':
			a = "陽明山";  break;	
		case 'Z':
			a = "馬祖";  break;	
		}
	
		System.out.println(a);
	}

}
