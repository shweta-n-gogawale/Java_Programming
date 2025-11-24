/*
    Function Name   : printDivisibleBy2and3
    Description     : Print all numbers between 1 to N divisible by both 2 and 3
    Input           : Integer N
    Output          : Numbers divisible by 2 and 3
    Author          : Shweta Gogawale
    Date            : 2025-11-23
*/

class Logic
{
    void printDivisibleBy2and3(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            if(i % 2 == 0 && i % 3 == 0)
            {
                System.out.println(i);
            }
        }
    }
}

class program21_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printDivisibleBy2and3(30);
    }
}
