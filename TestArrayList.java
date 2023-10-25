
    import java.util.*;

    public class TestArrayList
    {
       public static void main(String...amn)
       {
           List<String> li = new ArrayList<>();

              li.add("coconut");
              li.add("salt");
              li.add("cherry");
              li.add("nuts");

           ListIterator li_itr = li.listIterator();

              while(li_itr.hasNext())
              {
                 System.out.println(li_itr.next());
              }
        }
     }