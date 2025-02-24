import  java.util.Scanner;

class Typecast {
    public static void main(String[] args) {
        Scanner var= new Scanner(System.in);
        System.out.println("Enter the price: ");
        
        Float cost= var.nextFloat();
        
        int price = (int)(cost*100);
        System.out.println("The price is "+ price +" paise");
    }
}
