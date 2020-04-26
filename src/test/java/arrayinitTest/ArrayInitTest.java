package arrayinitTest;

import gen.arrayinit.ArrayInitLexer;
import gen.arrayinit.ArrayInitParser;
import gen.arrayinit.ShortToUnicodeString;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;

import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;
public class ArrayInitTest {
    public static void main(String[] args) throws IOException {
        CharStream input = CharStreams.fromStream(System.in);

        ArrayInitLexer lexer = new ArrayInitLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ArrayInitParser parser = new ArrayInitParser(tokens);

        ArrayInitParser.InitContext tree = parser.init();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new ShortToUnicodeString(),tree);
        System.out.println();

    }
    @Test
    public void test1(){
        for(char i = 'A'; i < 266; i++){
            if(i >= 'A' && i <= 'Z'){
                System.out.print("'");
                System.out.print(i);
                System.out.print("',");
            }

        }
    }

}
