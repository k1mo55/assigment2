public class Main {
    public static void main(String[] args) {
       Myinteger x = new Myinteger (10);
       System.out.println(x.iseven());
        System.out.println(x.isodd());
        System.out.println(x.isprime());

        System.out.println(x.iseven(x));
        System.out.println(x.isodd(x));
        System.out.println(x.isprime(x));

        System.out.println(x.iseven(10));
        System.out.println(x.isodd(10));
        System.out.println(x.isprime(7));

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //q6:   (a)  no output since only super keyword that calls the base constructer
        //      (b)  in constructer a int x is recived in paramater but is not assigned to an instance variable

        //q7:in circle constructer must be written this.radius=radius;     then in constructer of b instead of circle write super(radius);
        //   overriden
        //yes it is a problem beacause method signature (name, parameters, and return type) should be exactly the same as in the superclass

    }
}