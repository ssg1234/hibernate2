class Outer {
	void dis1(){
		System.out.println("Outer class dis1 method");
	}
	class Inner{
	void dis2(){
		System.out.println("Inner non static method");
	}
	}

        static class Inner2{
    	void dis3(){
   	System.out.println("Inner static method");
}
}
}
public class Demo1{
  public static void main(String args[]){
Outer out = new Outer();
out.dis1();
//Outer.Inner in1=out.new Inner();
  Outer.Inner in2=new Outer().new Inner();
in2.dis2();
Outer.Inner2 in3 = new Outer.Inner2();
in3.dis3();
}
}