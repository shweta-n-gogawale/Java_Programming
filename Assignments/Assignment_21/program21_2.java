/*
    Function Name   : countEvenOddRange
    Description     : Count how many even and odd numbers exist between 1 and N
    Input           : Integer N
    Output          : Even count & Odd count
    Author          : Shweta Gogawale
    Date            : 2025-11-23
*/

class Logic
{
    void countEvenOddRange(int n)
    {
        int even = 0, odd = 0;

        for(int i = 1; i <= n; i++)
        {
            if(i % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even: " + even);
        System.out.println("Odd : " + odd);
    }
}

class program21_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);
    }
}
