public class datatype {
    public static void main(String[] args) {
        
        // 1. Primitive Data Types and Memory Occupied
        System.out.println("----- Primitive Data Types and Memory Allocation -----");

        // Integer Types
        byte aByte = 10;           // 1 byte (8 bits)
        short aShort = 1000;        // 2 bytes (16 bits)
        int anInt = 100000;         // 4 bytes (32 bits)
        long aLong = 10000000000L;  // 8 bytes (64 bits)

        System.out.println("Byte Value: " + aByte + " (Size: 1 byte)");
        System.out.println("Short Value: " + aShort + " (Size: 2 bytes)");
        System.out.println("Int Value: " + anInt + " (Size: 4 bytes)");
        System.out.println("Long Value: " + aLong + " (Size: 8 bytes)");

        // Floating-Point Types
        float aFloat = 3.14f;       // 4 bytes (32 bits)
        double aDouble = 3.1415926535; // 8 bytes (64 bits)

        System.out.println("Float Value: " + aFloat + " (Size: 4 bytes)");
        System.out.println("Double Value: " + aDouble + " (Size: 8 bytes)");

        // Character Type
        char aChar = 'A';           // 2 bytes (16 bits, Unicode character)
        System.out.println("Char Value: " + aChar + " (Size: 2 bytes)");

        // Boolean Type
        boolean aBoolean = true;    // 1 bit (but JVM usually allocates 1 byte)
        System.out.println("Boolean Value: " + aBoolean + " (Size: 1 bit, stored as 1 byte)");

        
        // 2. Type Casting
        System.out.println("\n----- Type Casting (Explicit and Implicit) -----");

        // Implicit Type Casting (Widening Conversion)
        int intNum = 100;
        double doubleNum = intNum;  // int automatically cast to double (no data loss)
        System.out.println("Implicit Casting: int " + intNum + " -> double " + doubleNum);

        // Another Example: Long to Short (data may be lost)
        long largeNumber = 10000L;
        short shortNumber = (short) largeNumber;
        System.out.println("Explicit Casting: long " + largeNumber + " -> short " + shortNumber);

    }
}