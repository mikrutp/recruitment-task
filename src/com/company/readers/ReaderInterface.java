package com.company.readers;

import java.io.IOException;
import java.util.List;

public interface ReaderInterface {
    List<String> getData() throws IOException;
}
