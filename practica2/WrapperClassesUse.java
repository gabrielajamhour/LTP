package practica2;

/**
 * class WrapperClassesUse.
 * 
 * @author LTP 
 * @version 2020-21
 */

public class WrapperClassesUse {        
    public static void main(String[] args) {            
        // Assignment of wrapper variables to elementary types 
        int i = new Integer(123456);        
        double d = new Double(3.14);
        char c = new Character('A');
            
        // Writing elementary variables
        System.out.println("int i = " + i);
        System.out.println("double d = " + d);
        System.out.println("char c = " + c);
               
        // Assignment of elementary values to wrapper variables
        Integer eI = 123456; 
        Double eD = 3.14;
        Character eC = 'A';
        
        // Writing wrapper variables
        System.out.println("Integer I = " + eI);
        System.out.println("Double D = " + eD);
        System.out.println("Character C = " + eC);
    }    
}
