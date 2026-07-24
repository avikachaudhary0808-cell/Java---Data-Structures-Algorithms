public class AssignmentOperators {
    public static void main (String [] args)
    {
        int a = 10;
        a += 20;
        System.out.println("Added output:" + a);

        int b = 25;
        b = b+10;
        System.out.println("after b += : " + b);
         
        int c = 50;
        c %= 5;
        System.out.println("modulus of c :" + c);

        
        // comaprison
        int e= 10;
        int d = 20;
        System.out.println(a==b);
        System.out.println(e==d);
        System.out.println(e>d);
        System.out.println(e!=d);
        System.out.println(e+=20);
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a);
    }
}





    