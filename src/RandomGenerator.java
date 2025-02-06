import java.util.Random;

public class RandomGenerator {

    public static int randomInt(String[] array){
        Random random = new Random();
        return random.nextInt(array.length);
    }

    public static boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public static String randomNameGenerator(){
        String name = "";
        String[] adjectives = Constants.adjectives;
        String[] colorAdjectives = Constants.colorAdjectives;
        String[] fruits = Constants.fruits;
        String[] naturalTimes = Constants.naturalTimes;
        String[] natureNouns = Constants.natureNouns;
        String[] naturalPhenomena = Constants.naturalPhenomena;

        String[] firstNameArr = (getRandomBoolean())?adjectives:colorAdjectives;
        String[] secondNameArr = (getRandomBoolean())?fruits:naturalTimes;
        String[] thirdNameArr = (getRandomBoolean())?natureNouns:naturalPhenomena;

        StringBuilder strB = new StringBuilder(firstNameArr[randomInt(firstNameArr)]+" ");
        strB.append(secondNameArr[randomInt(secondNameArr)]).append(" ");
        strB.append(thirdNameArr[randomInt(thirdNameArr)]).append(" ");

        return strB.toString();
    }

}
