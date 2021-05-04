package cz.stuchlikova.ares.application.connector;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public abstract class ClientBaseTest<O> {

    O openXmlFileUnmarshalToObject(String url) {
        File answer = new File(url);
        try {
            InputStream xmlResult = new FileInputStream(answer);
            return unmarshalStringToObject(xmlResult);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    abstract O unmarshalStringToObject(InputStream xmlResult);
}
