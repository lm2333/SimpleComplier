package lab1demo2;

import java.util.ArrayList;
import java.util.Objects;

public class Lab1_2BaseListenerImpl extends Lab1_2BaseListener {
    ArrayList<String> arrayList = new ArrayList<String>();
    @Override
    public void enterStat(Lab1_2Parser.StatContext ctx) {
        if(Objects.isNull(ctx.STRING())){
            return;
        }
        String text = ctx.STRING().getText();
        StringBuilder sb = new StringBuilder();
        char[] lowerChars = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] upperChars = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for(char c : text.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                sb.append(lowerChars[(c-'a'+13)%26]);
            }else if(c >= 'A' && c<= 'Z'){
                sb.append(upperChars[(c-'A'+13)%26]);
            }else {
                sb.append(c);
            }

        }
        arrayList.add(sb.toString());
    }

    @Override
    public void exitProg(Lab1_2Parser.ProgContext ctx) {
        for(String s : arrayList){
            System.out.println(s);
        }
    }
}
