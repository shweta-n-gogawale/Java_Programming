/*
    Function Name   : checkDivisible
    Description     : Check if number is divisible by both 5 and 11
    Input           : Integer
    Output          : Prints result
    Author          : Shweta Gogawale
    Date            : 2025-11-23
*/

class Logic
{
    void checkDivisible(int num)
    {
        if(num % 5 == 0 && num % 11 == 0)
            System.out.println(num + " is divisible by both 5 and 11");
        else
            System.out.println(num + " is NOT divisible by both 5 and 11");
    }
}

class program19_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkDivisible(55);
    }
}
