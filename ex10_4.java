    public class ex10_4{
        public static void main(String[] args){
     
            int m=5;
            int nmin=1;
            int nmax=5;
     
            //int[] p = {100,90,82,70,65};
            //int[] p = {100,80,68,60,45};
            int[] p = {100,100,82,70,50,35};
     
            int gap = 0;
            int passedNum = 0;
     
            for(int n=nmin;n<nmax;n++){
                if(compare(p[n-1], p[n]) > gap){
                    gap = p[n-1] - p[n];
                    passedNum = n;
                }
            }
            System.out.println(passedNum);    
        }
        public static int compare(int i, int j){
            return i-j;
        }
    }
