public class PrimitiveDataType {
    byte byteDefault;
    short shortDefault;
    int intDefault;
    long longDefault;
    float floatDefault;
    double doubleDefault;
    boolean booleanDefault;
    char charDefault;

    void printPrimitiveDataType() {
        System.out.println("byte类型的最大值为：" + Byte.MAX_VALUE + "  byte类型的最小值为：" + Byte.MIN_VALUE + "  byte类型的默认值为：" + byteDefault);
        System.out.println("short类型的最大值为：" + Short.MAX_VALUE + "    short类型的最小值为：" + Short.MIN_VALUE + "    short类型的默认值为：" + shortDefault);
        System.out.println("int类型的最大值为：" + Integer.MAX_VALUE + "    int类型的最小值为：" + Integer.MIN_VALUE + "    int类型的默认值为：" + intDefault);
        System.out.println("long类型的最大值为：" + Long.MAX_VALUE + "    long类型的最小值为：" + Long.MIN_VALUE + "    long类型的默认值为：" + longDefault);
        System.out.println("float类型的最大值为：" + Float.MAX_VALUE + "    float类型的最小值为：" + Float.MIN_VALUE + "    float类型的默认值为：" + floatDefault);
        System.out.println("double类型的最大值为：" + Double.MAX_VALUE + "    double类型的最小值为：" + Double.MIN_VALUE + "    double类型的默认值为：" + doubleDefault);
        System.out.println("char类型的最大值为：" + Character.MAX_VALUE + "    char类型的最小值为：" + Character.MIN_VALUE + "    char类型的默认值为：" + charDefault);
        System.out.println("boolean类型的默认值为：" + booleanDefault);
    }

    public static void main(String[] args) {
        PrimitiveDataType pt = new PrimitiveDataType();
        pt.printPrimitiveDataType();
    }
}


