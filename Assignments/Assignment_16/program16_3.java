/*
    Function Name   : findFactorial
    Description     : Calculate factorial of given number.
    Input           : int num
    Output          : Prints factorial
    Author          : Shweta Gogawale
    Date            : 2025-11-23
*/

class Logic
{
    void findFactorial(int num)
    {
        int fact = 1;

        for(int i = 1; i <= num; i++)
        {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);
    }
}

class program16_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findFactorial(5);
    }
}
