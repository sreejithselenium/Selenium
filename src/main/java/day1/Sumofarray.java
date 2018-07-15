package day1;

public class Sumofarray {
static int sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] numbers= {21,34,23,56,73,23};
System.out.println();
for (int i=0;i<numbers.length;i++) {
	sum=sum+numbers[i];
	System.out.println(numbers[i]);
}
System.out.println("sum"+" "+sum);
	}

}
