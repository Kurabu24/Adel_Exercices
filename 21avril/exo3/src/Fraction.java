public class Fraction {
    private int num;
    private int denum;

    public Fraction(int num, int denum) {
        this.num = num;
        this.denum = denum;
        this.reduceFrac();
    }

    private int getPGCD(int num1, int num2) {
        int c;
        int denum1 = Integer.max(num1, num2);
        int denum2 = Integer.min(num2, num1);
        while (denum2 != 0) {
            c = denum2;
            denum2 = denum1 % denum2;
            denum1 = c;
        }
        return denum1;
    }

    public Fraction add (Fraction frac2){
        int newNum = this.num *frac2.denum +frac2.num*denum;
        int newDenum = this.denum*frac2.denum;
        return new Fraction(newNum, newDenum);
    }

    private void reduceFrac() {
        int pgcd = this.getPGCD(num, denum);
        this.num /= pgcd;
        this.denum /= pgcd;
    }

    public String toString() {
        if (denum == 1) {
            return String.valueOf(num);
        }
        return num + "/" + denum;
    }
}
