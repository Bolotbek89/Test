package Bolot.Lolo;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        List<Integer> listOfInteger = new ArrayList<Integer>();
        listOfInteger.add(2);
        listOfInteger.add(3);
        listOfInteger.add(4);
        listOfInteger.add(6);
        listOfInteger.add(7);
        listOfInteger.add(8);
        listOfInteger.add(9);
        listOfInteger.add(10);
        listOfInteger.add(1);
        listOfInteger.add(12);
        
        int sum = 0;
        
        for (int i: listOfInteger) {
        	if (i % 2 == 0) {
        		sum += i;
        	}
        }
        
    	System.out.println(sum);
        
        
    }
}
