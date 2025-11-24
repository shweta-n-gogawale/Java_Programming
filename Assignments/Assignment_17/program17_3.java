/*
    Function Name   : findMax
    Description     : Print maximum of two numbers
    Input           : Two integers
    Output          : Maximum number
    Author          : Shweta Gogawale
    Date            : 2025-11-23
*/

class Logic
{
    void findMax(int a, int b)
    {
        if(a > b)
        {
            System.out.println(a);
        }
        else
        {
            System.out.println(b);
        }
    }
}

class program17_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findMax(20, 15);
    }
}
