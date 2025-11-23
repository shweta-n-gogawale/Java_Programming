/*
    Function Name   : calculateSum
    Description     : Calculate sum of first N natural numbers.
    Input           : int n
    Output          : Prints sum
    Author          : Shweta Gogawale
    Date            : 2025-11-23
*/

class Logic
{
    void calculateSum(int n)
    {
        int sum = 0;

        for(int i = 1; i <= n; i++)
        {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);
    }
}

class program16_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.calculateSum(10);
    }
}
