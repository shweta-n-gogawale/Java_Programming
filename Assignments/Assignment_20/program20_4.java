/*
    Function Name   : findLargestDigit
    Description     : Return largest digit from the given number
    Input           : Integer
    Output          : Largest digit
    Author          : Shweta Gogawale
    Date            : 2025-11-23
*/

class Logic
{
    void findLargestDigit(int num)
    {
        int max = 0;
        int digit = 0;

        if(num < 0)
            num = -num;

        while(num != 0)
        {
            digit = num % 10;
            if(digit > max)
            {
                max = digit;
            }
            num = num / 10;
        }

        System.out.println("Largest Digit = " + max);
    }
}

class program20_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
    }
}
