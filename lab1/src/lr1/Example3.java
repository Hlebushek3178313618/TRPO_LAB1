package lr1;

public class Example3 {
    public static void main(String[] args) {
        int s, d;
        
        s = 10;
        d = 20;

        System.out.println("S: " + s);
        System.out.println("D: " + d);
        if (s < d){
            System.out.println("S < D");
        }

        s = s * 2;
        System.out.println("S: " + s);
        System.out.println("D: " + d);
        if(s == d){
            System.out.println("S == D");
        }

        s = s*  d;
        System.out.println("S: " + s); 
        System.out.println("D: " + d);
        if(s>  d){
            System.out.println("S > D");
        }
    }
}
