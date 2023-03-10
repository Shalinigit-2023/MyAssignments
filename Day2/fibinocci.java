package week1.Day2;

public class fibinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Firstnum = 0;
		int Secondnum = 1;
		int sum = 0;
		System.out.println(Firstnum);
		System.out.println(Secondnum);
		for (int i=1; i<11; i++) {
			sum = Firstnum + Secondnum;
			System.out.println(sum);
			Firstnum=Secondnum;
			Secondnum=sum;
		}
		
		
		

	}

}
