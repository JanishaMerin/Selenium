package week1.day2;

public class IfElse {

	public static void main(String[] args) {
		int mark=90;
		if(mark>80 && mark<=100){
			System.out.println("FirstClass");
		} else if(mark>60 && mark<80) {
			System.out.println("SecondClass");
		}
		else if(mark>45 && mark<60) {
			System.out.println("ThirdClass");
		}
		else System.out.println("Fail Reappear");
		// TODO Auto-generated method stub

	}

}
