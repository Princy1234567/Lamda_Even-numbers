import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class lamdaeven{

public static void main(String[]args){

List<Integer>numbers=new ArrayList<>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
numbers.add(4);
numbers.add(5);
numbers.add(6);
numbers.add(7);
numbers.add(8);
numbers.add(9);
numbers.add(10);
numbers.add(11);
numbers.add(12);
numbers.add(13);
numbers.add(14);
numbers.add(15);
numbers.add(16);
numbers.add(17);
numbers.add(18);
numbers.add(19);
numbers.add(20);

List<Integer>evennumbers=numbers.stream().filter(n->n%2==0).collect(collectors.tolist());
System.out.println("Even numbers:");
evennumbers.forEach(System.out.println);
}
}
