public class Duck {
    public static void main(String[] args) {
        int n=29905;
        boolean d=false;
        while(n>0){
            if(n%10==0){
                d=true;
                break;
            }
            n/=10;
        }
        if(d){
            System.err.println("Duck");
        }
        else System.err.println("Not Duck");
    }
}
