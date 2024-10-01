public class relation {
    public static void main(String[] args) {
        System.out.println("Relational operator");
        int a = 10, b = 20;
        System.out.println("a="+a+", b="+b);
        /*reltional operators <,>,==,>=,<=,!= */

        System.out.println("a < b = "+" "+(a<b));
        System.out.println("a > b = "+" "+(a>b));
        System.out.println("a == b = "+" "+(a==b));
        System.out.println("a >= b = "+" "+(a>=b));
        System.out.println("a <= b = "+" "+(a<=b));
        System.out.println("a !=b = "+" "+(a!=b));
        /*logical op &&,||, */
        System.out.println("\n----- Logical Operators -----");

        boolean p = true, q = false;

        System.out.println("p = " + p + ", q = " + q);

        // Logical AND
        System.out.println("p && q: " + (p && q));  // false
        
        // Logical OR
        System.out.println("p || q: " + (p || q));  // true
        
        // Logical NOT
        System.out.println("!p: " + (!p));  // false
        System.out.println("!q: " + (!q));  // true
        
        System.out.println("\n----- Bitwise Operators -----");

        int x = 5; 
        int y = 3;  

        System.out.println("x = " + x + " (Binary: 0101)");
        System.out.println("y = " + y + " (Binary: 0011)");

        // AND operator
        System.out.println("x & y: " + (x & y));  
        
        // OR operator
        System.out.println("x | y: " + (x | y));  
        
        // XOR operator
        System.out.println("x ^ y: " + (x ^ y));  
        
        // NOT operator (bitwise complement)
        System.out.println("~x: " + (~x));  
        
        // Left shift operator
        System.out.println("x << 1: " + (x << 1));  
        
        // Right shift operator
        System.out.println("x >> 1: " + (x >> 1));  
        // Unsigned right shift
        System.out.println("x >>> 1: " + (x >>> 1));  


        
    }
    
}
