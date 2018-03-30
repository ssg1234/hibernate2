import java.util.*;
public class Demo3{
  	public static void main(String args[]){
	List<Integer> ll=new ArrayList<>();
	ll.add(20);
	ll.add(10);
	ll.add(40);
        ll.add(30);
System.out.println("After 8 using lambda expression");
	ll.forEach((val)->System.out.println(val));
	Collections.sort(ll);
	System.out.println("After sort");
	ll.forEach((val)->System.out.println(val));

}
}