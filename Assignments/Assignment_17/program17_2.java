/*
    Function Name   : checkPalindrome
    Description     : Accept number and print whether it is palindrome or not
    Input           : Integer
    Output          : "Palindrome" / "Not Palindrome"
    Author          : Shweta Gogawale
    Date            : 2025-11-23
*/

class Logic
{
    void checkPalindrome(int num)
    {
        int temp = num;
        int rev = 0;
        int digit = 0;

        if(num < 0)
        {
            num = -num;
        }

        while(num != 0)
        {
            digit = num % 10;
            rev = (rev * 10) + digit;
            num = num / 10;
        }

        if(rev == temp)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}

class program17_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121);
    }
}
