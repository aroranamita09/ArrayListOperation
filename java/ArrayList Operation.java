package com.stackroute;
import java.util.ArrayList;
import java.util.Collections;

class ArrayListOperation{


    public int freq(ArrayList<Character> clist, char c) {
        clist.add(c);
        if (Collections.frequency(clist, c) != 0) {
            System.out.println(Collections.frequency(clist, c));
            return Collections.frequency(clist, c);
        } else {
            System.out.println("Not Present");
            return Collections.frequency(clist, c);
        }
    }
}




