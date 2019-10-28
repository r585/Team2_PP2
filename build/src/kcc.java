/** This class is the compiler which uses the other files to convert a knightcode program to a java program
* @author Ryan Meyer
* @author Elena Milan Lopez
* @author Caleb Proffitt
* @version 1.0.0
* Programming Project Two
* CS 322 - Compiler Construction
* Fall 2019
*/

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;

public class kcc {

        public static void main(String args[]) throws Exception {


                String inputFile = null;
                if (args[1].length()>0)
                        inputFile = args[1];    //Create a new empty string. If arguments have been input in the command line, take args[1] and set that as the name of the inputFile

                InputStream is = System.in;

                if (inputFile !=null)
                        is = new FileInputStream(inputFile);    //If the inputFile exists, create a new FileInputStream to read the raw data of the inputFile

                ANTLRInputStream input = new ANTLRInputStream(is);
                KnightCodeLexer lexer = new KnightCodeLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                KnightCodeParser parser = new KnightCodeParser(tokens);

                parser.removeErrorListeners();
                parser.addErrorListener(new ErrorListener());   //Use the error listener we created instead of any defaults

                ParseTree tree = parser.file();
                ParseTreeWalker walkerTexasRanger = new ParseTreeWalker();      //Create a new parse tree and a walker to walk the tree

                MyListener l = new MyListener();
                walkerTexasRanger.walk(l, tree);        //Use the listener we created to walk the parse tree

                if (args[0].equals("source")) {
                        Runtime rt = Runtime.getRuntime();
                        Process pr = rt.exec(args[3]);    //If the user wants source code, run java kcc source fileName outputName
                } else {
                        System.out.println("Coming Soon");      //If the user wants byte code, politely refuse
                }
        }
}

