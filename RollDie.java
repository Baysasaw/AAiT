import java.security.SecureRandom;
public class RollDie{
    public static void main(String[] args){
        SecureRandom randomNumber = new SecureRandom();

        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequency6 = 0;
        for (int i = 0; i <= 600_000; i++){
            int face = 1 + randomNumber.nextInt(6);
            switch (face){
                case 1:
                    ++frequency1;
                    break;
            case 2:
                frequency2++;
                break;
            case 3:
                frequency3++;
                break;
            case 4:
                frequency4++;
                break;
            case 5:
                frequency5++;
                break;
            case 6:
                frequency6++;
                break;
            }
        }
        System.out.printf("Face\tFrequency%n 1\t%d%n 2\t%d%n 3\t%d%n 4\t%d%n 5\t%d%n 6\t%d%n"
        ,frequency1, frequency2, frequency3, frequency4, frequency5, frequency6 );

    }
}