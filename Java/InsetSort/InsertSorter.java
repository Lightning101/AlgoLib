/*
 	Requirments:
	needs Sorter.java
	Description
	simple insertsort algorithem in extensible way
 */
package InsetSort;

import java.util.ArrayList;

/**
 *
 * @author sean
 */
public class InsertSorter {
    
    
    
    static <T> ArrayList<T> sort(ArrayList<T> array,Sorter<T> sort)
    {
     
        for(int i = 1; i<array.size(); i++)
        {
            
            int key = i;
            int pos = i;
            
            for(int q = i-1; q>=0; q--)
            {
               int val = sort.compare(array.get(key),array.get(q));
                
                if(val == -1)
                {
                    T temp = array.get(key); // pos ,
                                            // swper q
                    key =q ;
                    array.set(pos,array.get(q) );
                    array.set(q, temp);
                   
                    
                    
                    
                }
                pos--;
             
            }
            
            
            
        }
        
        return array;
        
    }
    
    
    
    
    
}
