public class bitwiseOp {
    public static void main(String[] args){

        int a = 5;
        int b = 3;
        
        System.out.println(a | b); // 1 1 -> 1, 1 0 -> 1, 0 0 -> 0 
        System.out.println(a & b); // 1 1 -> 1, 0 0 -> 0, 1 0 -> 0
        System.out.println(a ^ b); // 1 0 -> 1 , 1 1 (or) 0 0 -> 0
        System.out.println(~a);
     }
    
}
