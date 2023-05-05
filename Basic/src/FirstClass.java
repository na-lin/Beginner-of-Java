public class FirstClass {
    public static void main(String[] args) {
        String greeting = "hello world";
        System.out.println(greeting);

        boolean isPrint = true;
        if(isPrint == false){
            System.out.println("this is print");
        }else{
            System.out.println("Don't print");
        }
        int bit = isPrint ? 1 : 0;
        System.out.println(bit);

//challenge
        double v1 = 20.00;
        double v2 = 80.00;
        System.out.println(v1);
        boolean b1 = v1 == 20.00 ? true: false;
        System.out.println("b1:"+ b1);
    }
}
