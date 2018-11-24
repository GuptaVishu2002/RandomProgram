    public class ex10_2 {
        public static void main(String[] args) {
            final int COUNTMAX = 10;
            //int[] c = {1, 0, 0, 1, 1, 1, 0, 1, 0, 0};
            int[] c = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
            //int[] c = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            //int[] c = {1, 0, 1, 0, 1, 0, 1, 0, 1, 0};
     
            int[] xZeroOneCount = new int[COUNTMAX];
     
            int zeroOrOne = 0;
            int x=0;
            int i=0;
     
            while(i < COUNTMAX){
                xZeroOneCount[i] = 0;
                while(x < 10 && c[x] == zeroOrOne){
                    xZeroOneCount[i] += 1;
                    x++;
                }
                if (zeroOrOne == 0) {
                    zeroOrOne = 1;
                } else {
                    zeroOrOne = 0;
                }
                i++;
             }
     
             for(i=0;i<=COUNTMAX;i++){
                 System.out.print(xZeroOneCount[i] + " ");
             }
        }
    }
