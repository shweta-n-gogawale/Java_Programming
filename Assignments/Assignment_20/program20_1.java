/*
    Function Name   : sumEvenNumbers
    Description     : Calculate sum of all even numbers from 1 to N
    Input           : Integer
    Output          : Sum of even numbers
    Author          : Shweta Gogawale
    Date            : 2025-11-23
*/

class Logic
{
    void sumEvenNumbers(int n)
    {
        int sum = 0;

        for(int i = 1; i <= n; i++)
        {
            if(i % 2 == 0)
            {
                sum = sum + i;
            }
        }

        System.out.println("Sum of even numbers = " + sum);
    }
}

class program20_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumEvenNumbers(10);
    }
}
