@FunctionalInterface
interface Abc {
void dis1();
}
interface Emp{
	void empdetails(int id,String name,float salary);
}
interface Operation{
 	int add(int x, int y);
}
public class Demo2{
  	public static void main(String args[]){
	Operation op= (a,b)->a+b;
	System.out.println(op.add(10,20));
 	Abc obj=new Abc(){
	public void dis1(){
		System.out.println("Method Overridden");
	}
};
obj.dis1();
Abc obj1=()->System.out.println("dis1()method override");
obj1.dis1();
Emp emp=(id1,name1,salary1)->{
	System.out.println("Employee details are");
   	System.out.println("Id="+id1);
	System.out.println("Name="+name1);
	System.out.println("Salary="+salary1);
};
emp.empdetails(100,"Raj",12000);

}
}