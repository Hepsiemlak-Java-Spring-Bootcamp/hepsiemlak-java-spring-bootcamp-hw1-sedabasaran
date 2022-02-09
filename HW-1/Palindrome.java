public class Palindrome {
    public static void main(String[] args) {

        for (int number = 10; number <= 100; number++ ) {
            int reverse = getReverse(number);
            System.out.printf("The reverse of %d is %d%n",number,reverse);
            reverseAddPalindrome(number);
        }
    }

    public static int getReverse(int number){
        int reverse = 0;

        while (number != 0){
            reverse = reverse * 10 + number % 10;
            number /= 10;

        }
        return reverse;
    }

    static boolean checkPalindrome(int number)
    {
        int reverse = getReverse(number);

        if(reverse == number)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    static void reverseAddPalindrome(int number)
    {
        if(checkPalindrome(number))
        {
            System.out.println("Given Number is Already a Palindrome");
            System.out.println("");
        }
        else
        {
            while (!checkPalindrome(number))
            {
                int reverse = getReverse(number);
                int sum = number + reverse;

                System.out.println(number+" + "+reverse+" = "+sum);
                System.out.println("");

                number = sum;
            }
        }
    }

}
