public class DataTypes {
    public static void main(String [] args) {
        // primitive data types
        byte myRange = 100;
        short MYHEIGHT = 200;
        int age = 20;
        long myStory = 1000l;
        Float myCGPA = 7.73F;
        Double mypercentage = 75.5;
        char Grades = 'A';
        Boolean MERI_placement = true;
        String my_name ="Avika";

        System.out.println("Byte :" + myRange);
        System.out.println("Boolean :" + MERI_placement);
        System.out.println("String:" + my_name);
        System.out.println("Grades:" + Grades);
        System.out.println("Age:" + age);
        System.out.println("Long:" + myStory);
        System.out.println("Float:" + myCGPA);
        System.out.println("Double:" + mypercentage);

        // type conversion
        // widening (automatic type conversion)
        // smaller data type to larger data type

        float myFloat = 10.5f;
        double value = myFloat;
        int num = 10;
        long value1 = num;
        System.out.println("value");
        System.out.println(num);

        // narrowing (manual / explicit type conversion)
        // larger data type to smaller data type

        double mydouble = 12.5;
        int num2 = (int)mydouble;
        System.out.println(num);
    }
}










 