package student;

public class Homework1 {

    public double shippingCalculator(int n){
         if (n != 0) {
            return 10.95 + (n - 1) * 2.95;
        } else {
    
        return 0;
    }
    }
    public boolean isValidTriangle(int a, int b, int c){
       if (a + b > c && a + c > b && b + c > a) {
            return true;
        } else {
            return false;

        }

    }
    public boolean isPrime(int number){
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public  int hex2int(String hex) {
          hex = hex.toUpperCase();

        if (hex.length() == 1) {
            char ch = hex.charAt(0);
            if (ch >= '0' && ch <= '9') {
                return ch - '0';
            } else if (ch >= 'A' && ch <= 'F') {
                return ch - 'A' + 10;
            }
        }
        return -1;
    }
    public String int2hex(int value) {
        if (value >= 0 && value <= 15) {
            if (value < 10) {
                return String.valueOf(value);
            } else {
                return String.valueOf((char) (value - 10 + 'A'));
            }
        }
        return "";
    }


}
