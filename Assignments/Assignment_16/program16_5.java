/*
    Function Name   : countDigits
    Description     : Count digits of given number.
    Input           : int num
    Output          : Prints digit count
    Author          : Shweta Gogawale
    Date            : 2025-11-23
*/

class Logic
{
    void countDigits(int num)
    {
        int count = 0;

        if(num == 0)
        {
            count = 1;   // special case
        }
        else
        {
            if(num < 0)
            {
                num = -num;
            }

            while(num != 0)
            {
                count++;
                num = num / 10;
            }
        }

        System.out.println("Digits = " + count);
    }
}

class program16_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countDigits(7865);
    }
}
