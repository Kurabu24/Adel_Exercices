public class Fraction {
    private int num;
    private int denum;
    public Fraction(int num, int denum){
        this.num = num;
        this.denum = denum;
    }
    private int getPGCD(int denum1, int denum2){
        int c ;
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
    public void reduceFrac(){
        int pgcd = this.getPGCD(num, denum);
        this.num /= pgcd;
        this.denum /= pgcd;
    }
    public String toString(){
        if(denum == 1){
            return String.valueOf(num);
        }
        return num + "/" + denum;
    }
}
