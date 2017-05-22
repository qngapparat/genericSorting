import java.util.Random;
import java.util.UUID;

/**
 * Created by qngapparat on 22.05.17.
 */
public class RandomizedCredential implements Randomized<Credential> {

    public Credential getNextRandomized(){

        Random rand = new Random(38845);

        //user name is composed of char-string and numeric string.
        //char-string:
        char[] alphaString = new char[4];

        for(int i = 0; i < 4; i++){
            //set char to ascii value of a plus random int up to 26 (a to z).
            alphaString[i] = (char)(rand.nextInt(26) + 'a');
        }

        //numeric string:
        //get a 4
        String numericString = new RandomizedInteger().getNextRandomized(4).toString();

        String randomUserName = alphaString.toString() + numericString;

        //now onto the password
        //Note: this solution relies on UUID, which is not cryptographically secure.
        String uuidString = UUID.randomUUID().toString();
        char[] uuidArray = new char[8];
        int i = 0;

        //copy first 8 chars of UUID into a array.
        for(char ch: uuidString.toCharArray()){
            //skip over possible dashes in UUID
            if(ch == '-'){
                continue;
            }

            //copy that char of string into array
            uuidArray[i] = ch;
            i += 1;

            //only copy the first 8 chars into array.
            if(i >= 8){
                break;
            }
        }

        String randomPassword = new String(uuidArray);

        //finally, generate Credential object
        Credential randomCredential = new Credential(randomUserName, randomPassword);

        return randomCredential;

    }

}
