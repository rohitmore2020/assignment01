public class IT2023bit056q2 {
    public static int sumOfDigits(int number){
        if(number == 0){
            return 0;
        }
        return number%10+sumOfDigits(number/10);
    }

    public static void main(String[] args){
        System.out.println(sumOfDigits(170225));
    }
}
