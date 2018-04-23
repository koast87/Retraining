package classWork;

public class Iterations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(1,10));
		System.out.println(sum(20,30));
		System.out.println(sum(35,45));

	}
	
	public static int sum(int start, int end){
		int total = 0;
		for(int i =start; i <= end;i++){
			total += i;
		}
			return total;
	}

}
