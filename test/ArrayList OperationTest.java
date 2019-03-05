package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
public class ArrayListOperationTest {

    ArrayList<Character> arrayList=new ArrayList();
    ArrayListOperation obj ;
    @Before
    public void setUp() throws Exception {
           obj = new ArrayListOperation();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }
    @Test
    public void testArrayList() {
        arrayList.add('i');
        arrayList.add('g');
        arrayList.add('i');
        arrayList.add('e');
        arrayList.add('i');
        arrayList.add('k');
        assertEquals(2,obj.freq(arrayList,'g'));

    }
}

