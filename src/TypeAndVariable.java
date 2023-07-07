public class TypeAndVariable {
    // strict typing
    // class variables - outside methods - available to all methods
    static boolean b00l = true;
    public static void main(String[] args) {
        // local variable - inside methods 
        int myVariable; // declare variable
        myVariable = 6; // Initalize the variable to the value of 6
        System.out.println(myVariable);
        myVariable = 7;

        // conditionals
        //  operators evaluation
        if(b00l){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
        double x = 2.5; // floating point
        String hello = "Hello";
        String all = "All";
        System.out.println(x + myVariable);
        System.out.println(hello + all); // concatenation
   
}