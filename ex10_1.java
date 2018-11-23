    public class ex10_1 {
     
        public static void main(String args[]){
            int shippingFee = 1000;
            int price = 0;
            int price1 = 5000;
            int price2 = 9800;
            int price3 = 200;
            int totalPrice = 0;
     
            price = price1 + price2 + price3;
     
            if(price >= 10000){
                shippingFee = 0;
                price = (int)(price * 0.9);
            } else if(price >= 5000){
                price = (int)(price * 0.9);
            }
     
            totalPrice = shippingFee+price;
     
            System.out.println(totalPrice);
     
        }
     
    }
