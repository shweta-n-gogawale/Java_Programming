/*
    Function Name   : printReverse
    Description     : Print numbers from N to 1 in reverse
    Input           : Integer
    Output          : Numbers in reverse
    Author          : Shweta Gogawale
    Date            : 2025-11-23
*/

class Logic
{
    void printReverse(int n)
    {
        for(int i = n; i >= 1; i--)
        {
            System.out.println(i);
        }
    }
}

class program20_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printReverse(10);
    }
}
