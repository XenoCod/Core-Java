package Java8;

public class LambaTest {
public static void main(String[] args) {
//	A a= new C();
//	a.myMethod();
	
//	Using Lamba expression
//	A a= ()->System.out.println("Inside MyMethod");
//	a.myMethod();
	
	Sum s=(x, y) -> System.out.println(x+y);
	s.add(10, 20);
}

}
