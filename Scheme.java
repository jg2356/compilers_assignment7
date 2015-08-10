import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.Scanner;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;

public class Scheme {
    private static Scanner getScanner() {
        Scanner scanner = new Scanner(System.in);
        Pattern delim = Pattern.compile("( \r?\n)|(\r?\n){2}");
        scanner.useDelimiter(delim);
        return scanner;
    }

    public static void main(String[] args) throws Exception {
        ValVisitor eval = new ValVisitor();
        Scanner scanner = getScanner();
        while (!eval.isDone()) {
            try {
                String src = scanner.next();
                ANTLRInputStream input = new ANTLRInputStream(src);
                SchemeLexer lexer = new SchemeLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                SchemeParser parser = new SchemeParser(tokens);
                ParseTree tree = parser.prog();
                eval.visit(tree);
            }
            catch (NoSuchElementException ee) {
                break;
            }
        }
    }
}
