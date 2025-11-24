/*
    Function Name   : checkSign
    Description     : Check whether the number is positive, negative, or zero.
    Input           : Integer
    Output          : Prints "Positive", "Negative", or "Zero"
    Author          : Shweta Gogawale
    Date            : 2025-11-23
*/

class Logic
{
    void checkSign(int num)
    {
        if(num > 0)
        {
            System.out.println("Positive");
        }
        else if(num < 0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("Zero");
        }
    }
}

class program18_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkSign(-8);
    }
}
