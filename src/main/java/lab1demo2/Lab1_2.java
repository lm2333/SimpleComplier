package lab1demo2;

import gen.arrayinit.ArrayInitLexer;
import gen.arrayinit.ArrayInitParser;
import gen.arrayinit.ShortToUnicodeString;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.Scanner;

public class Lab1_2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            CharStream input = CharStreams.fromString(sc.nextLine());

            Lab1_2Lexer lexer = new Lab1_2Lexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            Lab1_2Parser parser = new Lab1_2Parser(tokens);
            Lab1_2Parser.ProgContext tree = parser.prog();

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new Lab1_2BaseListenerImpl(),tree);
        }
        System.out.println("=====Exit=====");
    }
}
