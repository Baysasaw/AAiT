import java.security.*;
public class Random{
    public static void main(String[] args){
        SecureRandom randomNumbers = new SecureRandom();
        int randomValue = randomNumbers.nextInt();
        for (int counter = 1; counter <= 20; counter++){
            //pick random integer from 1 to 6
            int  face = 1 + randomNumber.nextInt(6);

            System.out.print("%d ",face); //display generated value

            // if counter id divisible by 5, start a new line of out put
            if (counter % 5 == 0){
                System.out.println();
            }
        }
     }
}