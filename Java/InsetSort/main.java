/*
	Requirements	
		Needs Sorter.java
	Description 
	Prof of concept
 */


import java.util.ArrayList;

/**
 *
 * @author sean
 */
public class main {
    
    public static void main(String[] args) {
        
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(3);
        
        System.out.println("Before sorted");
        for(Integer i : list)
            System.out.println(i);
        
        InsertSorter.sort(list, new Sorter<Integer>() {
            @Override
            public int compare(Integer one, Integer two) {
            
                if(one.intValue()> two.intValue())
                    return 1;
                else if(one.intValue() == two.intValue())
                    return 0;
                else
                    return -1;
            
            
            }
        });
        
         
        System.out.println("After sorted");
        for(Integer i : list)
            System.out.println(i);
        
        
    }
    
}
