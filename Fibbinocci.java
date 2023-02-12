package week1.day2;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 1,i;
		System.out.println(a);
		System.out.println(b);
	
			for(i = 0; i<9; i++)
			{
		int sum = a+b;
		System.out.println(sum);
		
		a = b;
		b = sum;

	}

}
}
