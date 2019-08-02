
class Main{
    public static void main(String[] args) {
        int result = 1 + 2; // plus
        System.out.println(result);
        int prevResult = result;

        result = result - 1;// substract
        System.out.println(result);
        System.out.println(prevResult);

        result = result * 10; // multiplication
        System.out.println(result);

        result = result /5; // division
        System.out.println(result);

        result = result %3; // remainder
        System.out.println(result);

        result++; // plus 1
        System.out.println(result);

        result--; // minus 1
        System.out.println(result);

        result +=2; // add 2
        System.out.println(result);

        result *= 10; // mult 10
        System.out.println(result);

        result -= 10; // minus 10
        System.out.println(result);

        result /= 10; // divide 10
        System.out.println(result);

        boolean isAlien = false;

        // conditional
        if(isAlien == false)
            System.out.println("not alien");


    }

} 
