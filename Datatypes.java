public class Datatypes{
    public static void main(String[] args) {
       
        byte byteVar = 127; 
        short shortVar = 32767; 
        int intVar = 2147483647; 
        long longVar = 9223372036854775807L; 
       
        float floatVar = 3.14f; 
        double doubleVar = 3.141592653589793; 
       
        char charVar = 'A';
        
        boolean booleanVar = true; 
        
        System.out.println("Demonstrating basic data types in Java:");
        System.out.println("byte value: " + byteVar);
        System.out.println("short value: " + shortVar);
        System.out.println("int value: " + intVar);
        System.out.println("long value: " + longVar);
        System.out.println("float value: " + floatVar);
        System.out.println("double value: " + doubleVar);
        System.out.println("char value: " + charVar);
        System.out.println("boolean value: " + booleanVar);

       
        System.out.println("\nSome operations with these data types:");
        System.out.println("Sum of int and float: " + (intVar + floatVar));
        System.out.println("Concatenation of char and String: " + charVar + " is the first letter.");
        System.out.println("Boolean check (is byteVar > 100?): " + (byteVar > 100));
    }
}
