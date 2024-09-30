package Practise;

import java.util.ArrayList;

public class ArrayListSecond {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("i");
        al.add("learn");
        al.add("at");
        al.add("semicolon");
        al.add("learning");
        al.add("software");
        al.add("programming");

        al.add(1,"school");

        //System.out.println(al);

        String s1 = "java";
        String ne = s1.concat("rules");

        //System.out.println(ne);

        String str = "knowledge";
        String s = str;
        str = str.concat(" base ");

        System.out.println(str);


    }
}
