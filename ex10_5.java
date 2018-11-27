    public class ex10_5{
        public static void main(String[] args){
            int[] person = new int[50];
            int pos = 0;
            int wan = 0;
            int n =50;
            int p = 50;
     
            pos = 0;
            wan = p;
     
            while(true){
                if(wan != 0){
                    person[pos]++;
                    wan--;
                    if(person[pos] == p){
                        System.out.println(pos);
                        break;
                    }
                } else {
                    wan = person[pos];
                    person[pos] = 0;
                }
                pos++;
                if(pos == n){
                    pos = 0;
                }
            }   
        }
    }
