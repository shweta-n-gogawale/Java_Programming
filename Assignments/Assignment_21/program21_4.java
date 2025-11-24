/*
    Function Name   : countFactors
    Description     : Count total number of factors of given number
    Input           : Integer
    Output          : Number of factors
    Author          : Shweta Gogawale
    Date            : 2025-11-23
*/

class Logic
{
    void countFactors(int num)
    {
        int count = 0;

        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                count++;
            }
        }

        System.out.println(count);
    }
}

class program21_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countFactors(20);
    }
}
