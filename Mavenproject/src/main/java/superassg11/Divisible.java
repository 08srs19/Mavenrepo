package superassg11;

public class Divisible extends Addition {
	static int d;
	public int division() {
		int result= super.add(a,b,sum);
		if(result%10 == 0) {
			System.out.println("\n"+result+" is Divisible by 10");
		}else {
			System.out.println("\n"+result+" is not Divisible by 10");
		}
		return d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divisible div=new Divisible();
		div.division();
	}
}
