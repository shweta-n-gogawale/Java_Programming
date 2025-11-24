/*
    Function Name   : printDigits
    Description     : Prints each digit of the number separately
    Input           : Integer
    Output          : Digits
    Author          : Shweta Gogawale
    Date            : 2025-11-23
*/

class Logic
{
    void printDigits(int num)
    {
        if(num < 0)
            num = -num;

        while(num != 0)
        {
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }
    }
}

class program19_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printDigits(9876);
    }
}
