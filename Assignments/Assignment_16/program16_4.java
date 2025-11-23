/*
    Function Name   : reverseNumber
    Description     : Reverse digits of given number.
    Input           : int num
    Output          : Prints reversed number
    Author          : Shweta Gogawale
    Date            : 2025-11-23
*/

class Logic
{
    void reverseNumber(int num)
    {
        int rev = 0;

        while(num != 0)
        {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed = " + rev);
    }
}

class program16_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.reverseNumber(1234);
    }
}
