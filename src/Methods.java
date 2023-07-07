
public class Methods {
    public static void main(String[] args){
        sayHello();
        // resusable - fragment of code
        sayHelloWorld("World");
        sayHelloWorld("Everyone");
        returnNum();
        
        int x = sqrt(3);
        System.out.println(x);
        // Interesting??
        System.out.println(sqrt(returnNum()));
        System.out.println("Done executing!");
    }

    // methods return void -nothing, int, or other data types
    static int returnNum(){
        // this is just returning
        // lets print a statement before returning
        System.out.println("You need to call printLn to print");
        return 2;
    }

    static int sqrt(int x){
        return x * x;
    }
    static void sayHello(){
        System.out.println("Hello");
    }

    static void sayHelloWorld(String greet){
        System.out.println("Hello" + greet);
    }
}
