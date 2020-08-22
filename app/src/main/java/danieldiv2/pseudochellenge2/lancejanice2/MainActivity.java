package danieldiv2.pseudochellenge2.lancejanice2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.lang.reflect.Array;

import danieldiv2.pseudochellenge2.lancejanice2.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("AppTag", "created it is");
        String outputString = solution("Yvzs! I xzm'g yvorvev Lzmxv olhg srh qly zg gsv xlolmb!!");
        //          Yeah! I can't believe Lance lost his job at the colony!!
        Log.i("AppTag", "outputString: " + outputString);

        String outputString2 = solution("wrw blf hvv ozhg mrtsg'h vkrhlwv?");
        //          did you see last night's episode?
        Log.i("AppTag", "outputString2: " + outputString2);
    }



    /*
          //now we have a charArrayIn we get every letter of it and
        //either change it or not
        //than throw into output array
        //for every character in the sentence
     */



    public String solution(String inputString) {
        String outputString = "";
        boolean hasBeenSet;
        char[] charArrayIn = new char[inputString.length()];
        char[] charArrayOut = new char[inputString.length()];
        char[] apphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int i = 0; i < inputString.length(); i++) {
            inputString.getChars(i, i + 1, charArrayIn, i);
        }
        for (int i = 0; i < charArrayIn.length; i++) {
            hasBeenSet = false;
            for (int j = 0; j < apphabet.length; j++) {
                if (charArrayIn[i] == apphabet[j] && hasBeenSet == false) {
                    charArrayOut[i] = apphabet[(apphabet.length - j) - 1];
                    hasBeenSet = true;
                }
                if (charArrayIn[i] != apphabet[j] && hasBeenSet == false) {
                    charArrayOut[i] = charArrayIn[i];
                }
            }
            outputString = outputString + charArrayOut[i];
        }
        return outputString;
    }
}




