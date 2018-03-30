@FunctionalInterface
interface Abc1{
    void dis1();
    public static void dis2(){
    System.out.println("Abc1 default implementation");
  }
     default void dis3(){}
}
public class Demo{
public static void main(String args[]){

}
}