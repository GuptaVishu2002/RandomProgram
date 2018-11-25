    public class ex10_3 {
        public static int calcTotal(int[] a){
            int total=0;
            for(int i=0;i<a.length;i++){
                total += a[i];
            }
            return total;
            }
        
        public static double calcAve(int[] a){
            return (double)calcTotal(a)/a.length;
        }
     
        public static int calc80ormore(int[] a){
            int anum = 0;
            for(int i=0;i<a.length;i++){
                if (a[i]>=80) ++anum;
            }
            return anum;
        }
        
        public static void main(String[] args) {
            final int NUM = 8;
            //  int[] a = {0, 29, 70, 80, 90, 100, 90, 30};
              int[] a = {79, 80, 80, 80, 100, 90, 0, 50};
            //  int[] a = {80, 0, 0, 0, 0, 0, 0, 0, 0};
     
            System.out.println("total: " + calcTotal(a) + "\n" +"ave: " + calcAve(a) + "\n"+ "80 or more:" + calc80ormore(a));
      
        }
    }
