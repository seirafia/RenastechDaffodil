package student.gulsumB;

import java.util.ArrayList;
import java.util.Arrays;

//(ArrayList) Remove "Eric"
//        Given a list of people' names: "Amed",  "Eric""John", "Eric", "Amed" , "Eric" .
//        Write a java operation to remove all the names named , "Eric
public class lab23 {
        public static void main(String[] args) {
            ArrayList<String>name=new ArrayList<>();
            name.addAll(Arrays.asList("Amed","Eric","John","Eric","Amed","Eric"));
            System.out.println(name);
            name.removeAll(Arrays.asList("Eric"));
            System.out.println(name);

        }}

