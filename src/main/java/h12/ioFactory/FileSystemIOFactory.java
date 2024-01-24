package h12.ioFactory;

import java.io.*;

/**
 * An Implementation of {@link IOFactory} for the Filesystem
 */
public class FileSystemIOFactory implements IOFactory{

    @Override
    public boolean supportsReader() {
        // TODO
        throw new UnsupportedOperationException();
    }

    @Override
    public BufferedReader createReader(String ioName) throws FileNotFoundException {
        // TODO
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean supportsWriter() {
        // TODO
        throw new UnsupportedOperationException();
    }

    @Override
    public BufferedWriter createWriter(String ioName) throws IOException {
        // TODO
        throw new UnsupportedOperationException();
    }
}
