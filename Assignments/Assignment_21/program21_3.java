/*
    Function Name   : displayFactors
    Description     : Display all factors of the given number
    Input           : Integer
    Output          : All factors
    Author          : Shweta Gogawale
    Date            : 2025-11-23
*/

class Logic
{
    void displayFactors(int num)
    {
        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                System.out.println(i);
            }
        }
    }
}

class program21_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.displayFactors(12);
    }
}
