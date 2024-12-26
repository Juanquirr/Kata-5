package architecture.io;

import java.io.IOException;

public interface ResponseReader {
    String read() throws IOException;
}
