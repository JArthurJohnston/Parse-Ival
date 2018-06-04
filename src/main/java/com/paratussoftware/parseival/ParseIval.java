package com.paratussoftware.parseival;

import com.paratussoftware.parseival.parsers.ruby.RubyLexer;
import com.paratussoftware.parseival.parsers.ruby.RubyParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class ParseIval {

    public static void main(String[] args){
        try {
            String fileName = "src/main/resources/ruby_example.rb";
            CharStream sourceCodeStream = CharStreams.fromFileName(fileName);
            RubyLexer lexer = new RubyLexer(sourceCodeStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            RubyParser parser = new RubyParser(tokenStream);

            RubyParser.ExpressionContext expression = parser.expression();

            System.out.println("done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
