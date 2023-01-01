public class Main {
    public static void main(String[] args) {

        double[] numbers = {7,9,12,5,14};
       
        double sum=0.0;

        for(int i=0;i<numbers.length;i++){

            sum+=1/numbers[i];
        }

        System.out.println(sum);
    }
}