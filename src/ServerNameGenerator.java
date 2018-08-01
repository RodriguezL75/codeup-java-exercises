import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ServerNameGenerator {

    public static void main(String[] args) {

        String[] adjectives = {"Spicy", "Sweet", "Tangy", "Tart", "Salty", "Bland", "Minty", "Tasty", "Fruity", "Garlicy"};
        String[] nouns = {"bunch", "audience", "flock", "team", "group", "family", "band", "village", "pair", "town"};

        for (int i = 0; i < adjectives.length; i++) {
            System.out.println(adjectives[i]);
        }

        for (int i = 0; i < nouns.length; i++) {
            System.out.println(nouns[i]);
        }


        System.out.println(adjectives.length);;
        System.out.println(nouns.length);

        List<String> stringList = Arrays.asList(adjectives);
        Collections.shuffle(stringList);
        adjectives = stringList.toArray(new String[stringList.size()]);
        System.out.println(Arrays.toString(adjectives));


        List<String> wordList = Arrays.asList(nouns);
        Collections.shuffle(wordList);
        nouns = wordList.toArray(new String[wordList.size()]);
        System.out.println(Arrays.toString(nouns));


//        public String getInfo(){
//            return String.format("Here is your server name: " + adjectives)
//        }

//        System.out.println("Here is your server name: " + Arrays.toString(nouns));


    }



}




//public class ServerNameGenerator {
//
//    private static String[] adjectives = {"Spicy", "Sweet", "Tangy", "Tart", "Salty", "Bland", "Minty", "Tasty", "Fruity", "Garlicy"};
//    private static String[] nouns = {"bunch", "audience", "flock", "team", "group", "family", "band", "village", "pair", "town"};
//};
//
/////another way to set up is using private
//private static String getRandomElement(String[] strings) {
//        return strings[getRandomNumberInRange(strings.length -1)];
//        }
//private static int getRandomNumberInRange(int max) {
//        Random r = new Random();
//        return r.nextInt(max);
//        }
//public static void main(String[] args) {
//        System.out.printf(
//        "Here is your server name:%n%s-%s",
//        getRandomElement(adjectives),
//        getRandomElement(nouns));
//        System.out.println();
//        }
//        }