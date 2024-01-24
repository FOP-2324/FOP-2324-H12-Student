package h12.parse;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Class to read line-wise and  provide char-wise stream and removes comments
 */
public class CommentFreeReader {
    final static String COMMENT = "//";
    final static char NEWLINE = '\n';
    private final BufferedReader reader;

    private String lookAheadString = "";


    /**
     * Constructs new {@link CommentFreeReader}
     * @param reader the Reader for the file
     * @throws IOException Can be thrown in case of File Problem
     */
    public CommentFreeReader(BufferedReader reader) throws IOException {
        this.reader = reader;
        lookAhead();
    }

    /**
     *
     * @return true, iff there is a next char
     */
    public boolean hasNext(){
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Reads the next char from stream
     * @return next character
     * @throws IOException Can be thrown in case of File Problem
     */
    public char read() throws IOException {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Return the next char, but do not remove it from stream
     * @return the next char
     */
    public char peek(){
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Looks new Line Ahead and removes comments
     * @throws IOException Can be thrown in case of File Problem
     */
    private void lookAhead() throws IOException {
        // TODO
        throw new UnsupportedOperationException();
    }

}
