public class LogicalOperators {
    public static void main(String [] args)
    {
        int a = 10;
        int b = 10;
        System.out.println(a==b);
        System.out.println(a++);
        System.out.println("is true:" + (a > b));

        int cgpa = 7;
        boolean isPlcaed = true;
        System.out.println("Is Eligible:" + (cgpa< 8 && isPlcaed));
        
        boolean backlog = false ;
        System.out.println("Eligible only when:" + (!backlog));

        boolean mytrip = true;
        boolean ifnot_backlog = true;
        System.out.println("Eligible for trip:" + (mytrip || ifnot_backlog));

        boolean igot_hired = false;
        System.out.println("yes i am hired:" + (!igot_hired));




    }
}
