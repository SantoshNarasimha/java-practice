// if input as 7 returns 11, if input 11 returns 7 with out using if else 

class SwapWithoutIfElse {

    public static int test(int n) {

        return 7 + 11 - n;

    }

    // another way to solve it

    public static int swapWithArray(int n) {

        int[] answers = new int[12];
        answers[7] = 11;
        answers[11] = 7;

        return answers[n];
    }

    // another way instead of if else, using Ternary Operator

    public static int swapWithTernary(int n) {

        return (n == 7) ? 11 : 7;

    }

    public static void main(String[] args) {

        System.out.println("\nThe value of 7 is : " + test(7));

        System.out.println("The value of 11 is: " + test(11));

        System.out.println("the value of 7 is [ array ]: " + swapWithArray(7));

        System.out.println("the value of 11 is [ Ternary ]: " + swapWithTernary(11));

    }

}