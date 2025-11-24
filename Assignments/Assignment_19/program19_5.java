/*
    Function Name   : calculatePower
    Description     : Calculates base^exp using loop
    Input           : Two integers (base, exponent)
    Output          : Prints result
    Author          : Shweta Gogawale
    Date            : 2025-11-23
*/

class Logic
{
    void calculatePower(int base, int exp)
    {
        int result = 1;

        for(int i = 1; i <= exp; i++)
        {
            result = result * base;
        }

        System.out.println(base + " raised to " + exp + " = " + result);
    }
}

class program19_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.calculatePower(2, 5);
    }
}
