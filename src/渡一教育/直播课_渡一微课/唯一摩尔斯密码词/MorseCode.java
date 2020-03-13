package 渡一教育.直播课_渡一微课.唯一摩尔斯密码词;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import java.util.HashSet;

public class MorseCode {

    public static void main(String[] args) {
        String[] words = new String[]{"gin", "zen", "gig", "msg"};
        int sum = MorseCode.MorseCode(words);
        System.out.println(sum);
    }

    public static int MorseCode(String[] words) {
        //拿到摩斯码的字典
        String[] morseCodes = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        HashSet set = new HashSet();

        for (int i = 0;i < words.length;i++){
            String word = words[i];

            StringBuilder builder = new StringBuilder();
            for (int j = 0;j < word.length();j++){
                int index = word.charAt(j)-'a';
                String morseCode = morseCodes[index];
                builder.append(morseCode);
            }
            set.add(builder.toString());
        }
        return set.size();
    }
}
