public class ElseIfStatement {
    public static void main(String [] args)
    {
        int cgpa = 6;
        if (cgpa >= 7)
        {
            System.out.println("passed");
        }
        else if (cgpa < 7 && cgpa >= 5)
        {
            System.out.println("average");
        }
        else 
        {
            System.out.println("fail");
        }

        int num = 95;
        if(num >= 100)
        {
            System.out.println("A+");
        }
        else if(num < 100 && num >= 90)
        {
            System.out.println("A");
        }
        else if(num < 90 && num >= 80)
        {
            System.out.println("B");
        }
        else if(num < 80 && num >= 70)
        {
            System.out.println("C");
        }
        else if(num < 70 && num >= 60)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("fail");
        }

        
        int mycgpa= 9;
        if(mycgpa > 8)
        {
            System.out.println("i am eligible");
        }
        else if (mycgpa > 6 && mycgpa <=8)
        {
            System.out.println("i am avergae");
        }
        else 
        {
            System.out.println("i am not eligible");

        }
        double cgpa_1 = 8.7;

boolean isEligible;

if (cgpa_1 >= 7) {
    isEligible = true;
} else {
    isEligible = false;
}

System.out.println(isEligible);
    }

}
