/*
    Function Name   : findSmallestDigit
    Description     : Return smallest digit from the given number
    Input           : Integer
    Output          : Smallest digit
    Author          : Shweta Gogawale
    Date            : 2025-11-23
*/

class Logic
{
    void findSmallestDigit(int num)
    {
        int digit = 0;
        int min = 9;

        if(num < 0)
            num = -num;

        while(num != 0)
        {
            digit = num % 10;

            if(digit < min)
            {
                min = digit;
            }

            num = num / 10;
        }

        System.out.println("Smallest Digit = " + min);
    }
}

class program20_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872);
    }
}
