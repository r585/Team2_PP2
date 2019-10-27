import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;

public class kcc  {
    public static void main(String[] args) throws Exception {
        
	String inputFile = null; 
        if ( args.length>0 ) 
		inputFile = args[0];
        
	InputStream is = System.in;
        
	if ( inputFile!=null ) 
		is = new FileInputStream(inputFile);
        
	ANTLRInputStream input = new ANTLRInputStream(is); 
        KnightCodeLexer lexer = new KnightCodeLexer(input); 
        CommonTokenStream tokens = new CommonTokenStream(lexer); 
        KnightCodeParser parser = new KnightCodeParser(tokens); 
        
	parser.removeErrorListeners();

	parser.addErrorListener(new ErrorListener());

	ParseTree tree = parser.program(); // start at the program label

	ParseTreeWalker walker = new ParseTreeWalker();
		
	MyListener l = new MyListener();
	walker.walk(l, tree);
	


	}//end main
}//end class
