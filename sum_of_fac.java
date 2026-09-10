public class sum_of_fac {
    public static void main(String[] args) {
        int n=6;
        int fac=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                fac+=i;
            }
        }
        System.err.println(fac);
    }
}
