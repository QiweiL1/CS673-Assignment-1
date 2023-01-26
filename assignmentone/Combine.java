package assignmentone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Write a function that combines two lists by alternatingly taking elements, e.g. [a,b,c], [1,2,3] → [a,1,b,2,c,3] and test it in your program.

public class Combine {

    public static void main(String[] args){
        List<String> list = Arrays.asList("a","b","c");
        List<String> list2 = Arrays.asList("1","2","3");

        System.out.println("The elements for first list are: " + list);
        System.out.println("The elements for second list are: " + list2);

        int max = list.size() > list.size()?list.size():list2.size();

        List<String> list3 = new ArrayList<>(list.size() + list.size());

        for(int i=0; i<max; i++){
            if(i < list.size()){
                list3.add(list.get(i));
            }

            if(i < list2.size()){
                list3.add(list2.get(i));
            }
        }

        System.out.println("Final list after two lists combines is: " + list3);

    }

}
