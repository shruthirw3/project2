package practiceJava;

public class FibonaciSeries {
	public static void main(String[] args) {
		//fibonacii series means sum of previous 2 numbers
		
int a=0,b=1,c,i,count=10;
System.out.println(+a +" " +b);
for(i=2;i<count;i++) {
	c=a+b;
	System.out.println(c);
	a=b;
	b=c;
	
}
}
}
