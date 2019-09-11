package JavaProgram1;

public class Fibonacci {
public static void main(String[] args) {
	int i=0, j=1, k;
System.out.println(i);
System.out.println(j);
	for (int m= 2; m< 10; m++) {
	k=i+j;
	System.out.println(k);
	i=j;
	j=k;
}	
}
}
