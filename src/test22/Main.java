package test22;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

   Set<String> a = new HashSet<String>();
   a.add("1");
   a.add("3");
   a.add("4");
   for(String b : a) {
	   
	   System.out.println(b);
   }

   List<String> list = new ArrayList<String>(a);
   
   System.out.println(list.get(0));
   
   String dueDate = "2112-11-11";
	LocalDate lol = LocalDate.parse(dueDate, DateTimeFormatter.ISO_LOCAL_DATE);
 System.out.println(lol);
   
   
   
	}

}
