package Arrays;

public class AvarageofArrayvalues {

	public static void main(String[] args) {
		double [] array1={1,8,6.5,5,4,12,87,45};
		double total=0;
		for(int i=0;i<array1.length;i++){
			total = total+array1[i];
		}
		System.out.println(total);
		double avg=total/array1.length;
		System.out.println(avg);
	}
	

}
