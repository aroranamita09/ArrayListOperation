package com.stackroute;

import org.junit.*;
@Test
public void testinsert(ArrayList<character> clist, char c){
clist.add(c);
// Function to test count frequency of element
 static void freq(ArrayList<character> clist, char c)
{
Iterator it=clist.iterator();
int count=0;
for(int i=0;i<clist.size();i++) 
{="" if(clist.get(i)="=c)" count++;="" }="" if(count="=0)" system.out.println("not="" present");="" else="" system.out.println(count);="" }="">

    }}
     class testinsert {
    @Test
    public void testfreqCount() throws Exception{
        String expectedValue = "not present";
        Gfg data=new Gfg();
        String actualValue=data.freq("");
        assertEquals(expectedValue, actualValue);

}}
   


