package mandatoryTrainings;

public class ParameterizedConstructorday3 {
int a,b;
ParameterizedConstructorday3(int x,int y){
	a=x;
	b=y;
	System.out.println(a);
	System.out.println(b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we cannot use private,protected and we cannot override the constructor
		//only public and we can overload the constructor
ParameterizedConstructorday3 r=new ParameterizedConstructorday3(20,30);
ParameterizedConstructorday3 r1=new ParameterizedConstructorday3(4,35);
ParameterizedConstructorday3 r2=new ParameterizedConstructorday3(50,2);
//this keyword
//
	}

}
