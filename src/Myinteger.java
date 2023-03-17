public class Myinteger {
    private int num;

    Myinteger(int num){
        this.num=num;

    }
    public int getnum(){
        return num;
    }
    public boolean iseven(){
        if(num%2==0)
            return true;
        else
            return false;
    }
    public  boolean isodd(){
        if(num%3==0)
            return true;
        else
            return false;
    }
    public boolean isprime(){
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
    if(!flag)
        return true;
    else
        return false;
    }


//////////////////////////////////////////////////////////////////////



    public static boolean iseven(int num){
        if(num%2==0)
            return true;
        else
            return false;
    }
    public static boolean isodd(int num){
        if(num%3==0)
            return true;
        else
            return false;
    }
    public static boolean isprime(int num){
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if(!flag)
            return true;
        else
            return false;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////



    public static boolean iseven(Myinteger x){
        if(x.num%2==0)
            return true;
        else
            return false;
    }
    public static boolean isodd(Myinteger x){
        if(x.num%3==0)
            return true;
        else
            return false;
    }
    public static boolean isprime(Myinteger x){
        boolean flag = false;
        for (int i = 2; i <= x.num / 2; ++i) {
            // condition for nonprime number
            if (x.num % i == 0) {
                flag = true;
                break;
            }
        }
        if(!flag)
            return true;
        else
            return false;
    }

    public boolean eqauls(int x) {

        if(x == num)
            return true;
         else
            return false;
    }

    public boolean eqauls(Myinteger x) {

        if(x.num == num)
            return true;
        else
            return false;
    }



}
