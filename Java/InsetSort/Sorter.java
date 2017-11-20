/*
 	Description 
	used to give a value for sorting algorithems to use
 */
package InsetSort;

/**
 *
 * @author sean
 */
public interface Sorter<T>{
    
    
    int compare(T one, T two);
    
}
