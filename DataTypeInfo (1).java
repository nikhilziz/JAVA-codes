class DataType {
    public static void main(String[] args) {
        // Primitive Data Types
        System.out.println("Primitive Data Types:");
        System.out.println("byte: Size = " + Byte.SIZE / 8 + " bytes, Range = " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short: Size = " + Short.SIZE / 8 + " bytes, Range = " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int: Size = " + Integer.SIZE / 8 + " bytes, Range = " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long: Size = " + Long.SIZE / 8 + " bytes, Range = " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("float: Size = " + Float.SIZE / 8 + " bytes, Range = " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("double: Size = " + Double.SIZE / 8 + " bytes, Range = " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("char: Size = " + Character.SIZE / 8 + " bytes, Range = " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
        System.out.println("boolean: Size = JVM dependent, Values = " + Boolean.FALSE + " or " + Boolean.TRUE);

        // Non-Primitive Data Types
        System.out.println("Non-Primitive Data Types:");
        System.out.println("String: Size depends on content");
        System.out.println("Array: Size depends on the number of elements");
        System.out.println("Objects: Size depends on the fields.");
    }
}